
import java.util.HashMap;
import java.util.Stack;
import java.util.HashSet;

enum VarType{ INT, REAL, BOOL ,UNKNOWN }

class Value{ 
	public String name;
	public VarType type;

	public Value( String name, VarType type ){
		this.name = name;
		this.type = type;
	}
}

public class LLVMActions extends PleaseWorkBaseListener {

    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    HashMap<String, VarType> local_variables = new HashMap<String, VarType>();

    Stack<Value> stack = new Stack<Value>();

    //list of declared functions
    HashSet<String> functions = new HashSet<String>();
    //decides on which stack to put variable, local or global
    Boolean global;
    //current function
    String function,return_type;


    //TO_DO NAJWAŻNIEJSZE
    @Override
    public void exitFblock(PleaseWorkParser.FblockContext ctx) {

       if( ! local_variables.containsKey(function) ){
         switch (return_type){
            case "i1":
               LLVMGenerator.declare_bool("%" + function,global);
               LLVMGenerator.assign_bool("%" + function,"0");
               LLVMGenerator.load_bool( "%"+function );
               break;
            case "i32":
            LLVMGenerator.declare_i32("%" + function,global);
            LLVMGenerator.assign_i32("%" + function, "0");
            LLVMGenerator.load_i32( "%"+function );
               break;
            case "double":
            LLVMGenerator.declare_double("%" + function,global);
            LLVMGenerator.assign_double("%" + function, "0.0");
            LLVMGenerator.load_double( "%"+function );
               break;
            case "float":
               //TO-DO
               break;
         }
       }

       LLVMGenerator.functionend(return_type);


       local_variables = new HashMap<String, VarType>();
       return_type = "";
       global = true;

    }

    @Override
    public void enterFunction(PleaseWorkParser.FunctionContext ctx)
    {
      String fname= ctx.fname().getText();
      functions.add(fname);
      function = fname;

      return_type = ctx.datatype().getText();
      //deciding what return type function will have
      switch (return_type){
         case "int":
         return_type = "i32";
         break;
         case "real":
         return_type = "double";
         break;
         case "float":
         //TO-DO
         //return_type = "";
         break;
         case "bool":
         return_type = "i1";
         break;
      }

      LLVMGenerator.functionstart(return_type, fname);
      global = false;
    }

    @Override
    public void enterLblock(PleaseWorkParser.LblockContext ctx) { 
      Value v = stack.pop();
      if(v.type == VarType.INT){
       LLVMGenerator.loopstart(v.name);
      } else{
         error(ctx.getStart().getLine(), "counter variable mismatch, expected INT");
      }
    }

    @Override
    public void exitLblock(PleaseWorkParser.LblockContext ctx) {
       if( ctx.getParent() instanceof PleaseWorkParser.LoopContext ){
         
          LLVMGenerator.loopend();
       }
    }


    @Override
    public void exitIf(PleaseWorkParser.IfContext ctx) {
    Value v = stack.pop();
    if (v.type != VarType.BOOL)
      {
         error(ctx.getStart().getLine(), "If needs bool type");
      }
    }

    @Override
    public void enterBlockif(PleaseWorkParser.BlockifContext ctx) {
       LLVMGenerator.ifstart();
    }

    @Override
    public void exitBlockif(PleaseWorkParser.BlockifContext ctx) {
       LLVMGenerator.ifend();
    }

    @Override
    public void exitAssign(PleaseWorkParser.AssignContext ctx) {

       String ID = ctx.ID().getText();
       Value v = stack.pop();
       if(variables.containsKey(ID))
       {
         if( v.type == VarType.INT ){
            LLVMGenerator.assign_i32("@" + ID, v.name);
         }
         if( v.type == VarType.REAL ){
            LLVMGenerator.assign_double("@" + ID, v.name);
         }
         if( v.type == VarType.BOOL ){
            LLVMGenerator.assign_bool("@" + ID, v.name);
         }
       }else if(local_variables.containsKey(ID))
       {
         if( v.type == VarType.INT ){
            LLVMGenerator.assign_i32("%" + ID, v.name);
         }
         if( v.type == VarType.REAL ){
            LLVMGenerator.assign_double("%" + ID, v.name);
         }
         if( v.type == VarType.BOOL ){
            LLVMGenerator.assign_bool("%" + ID, v.name);
         }
       }
       //variable doesn't exist
       else{
         if(global){
            if( v.type == VarType.INT ){
               LLVMGenerator.declare_i32("@" + ID, global);
               LLVMGenerator.assign_i32("@" +ID, v.name);
            }
            if( v.type == VarType.REAL ){
               LLVMGenerator.declare_double("@" +ID, global);
               LLVMGenerator.assign_double("@" +ID, v.name);
            }
            if( v.type == VarType.BOOL ){
               LLVMGenerator.declare_bool("@" + ID, global);
               LLVMGenerator.assign_bool("@" + ID, v.name);
            }
            variables.put(ID,v.type);
         } else if(!global){
            if( v.type == VarType.INT ){
               LLVMGenerator.declare_i32("%" + ID, global);
               LLVMGenerator.assign_i32("%" + ID, v.name);
            }
            if( v.type == VarType.REAL ){
               LLVMGenerator.declare_double("%" + ID, global);
               LLVMGenerator.assign_double("%" + ID, v.name);
            }
            if( v.type == VarType.BOOL ){
               LLVMGenerator.declare_bool("%" + ID, global);
               LLVMGenerator.assign_bool("%" + ID, v.name);
            }
            local_variables.put(ID,v.type);
         }
       }

    }

   @Override
    public void exitId(PleaseWorkParser.IdContext ctx) {
        String ID = ctx.ID().getText();
        if (local_variables.containsKey(ID)) {
            VarType type = local_variables.get(ID);
            int reg = -1;
            if (type == VarType.INT) {
                reg = LLVMGenerator.load_i32("%" + ID);
            } else if (type == VarType.REAL) {
                reg = LLVMGenerator.load_double("%" + ID);
            } else if (type == VarType.BOOL) {
                reg = LLVMGenerator.load_bool("%" + ID);
            }
            stack.push(new Value("%" + reg, type));
         }else if(variables.containsKey(ID)){
          VarType type = variables.get(ID);
            int reg = -1;
            if (type == VarType.INT) {
                reg = LLVMGenerator.load_i32("@" + ID);
            } else if (type == VarType.REAL) {
                reg = LLVMGenerator.load_double("@" + ID);
            } else if (type == VarType.BOOL) {
                reg = LLVMGenerator.load_bool("@" + ID);
            }
            stack.push(new Value("@" + reg, type));
        } else {
            error(ctx.getStart().getLine(), "no such variable");
        }
    }

    @Override
    public void enterProg(PleaseWorkParser.ProgContext ctx) {
       global = true;
    }

    @Override 
    public void exitProg(PleaseWorkParser.ProgContext ctx) {
       LLVMGenerator.close_main();
       System.out.println( LLVMGenerator.generate() );
    }

    @Override 
    public void exitInt(PleaseWorkParser.IntContext ctx) {
         stack.push( new Value(ctx.INT().getText(), VarType.INT) );       
    } 

    @Override 
    public void exitReal(PleaseWorkParser.RealContext ctx) {
         stack.push( new Value(ctx.REAL().getText(), VarType.REAL) );       
    } 

    // TO-DO
    @Override
    public void exitBool(PleaseWorkParser.BoolContext ctx) {
         stack.push( new Value(ctx.BOOL().getText(), VarType.BOOL) );
    }


    @Override 
    public void exitAdd(PleaseWorkParser.AddContext ctx) {
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
	  if( v1.type == VarType.INT ){
             LLVMGenerator.add_i32(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
          }
	  if( v1.type == VarType.REAL ){
             LLVMGenerator.add_double(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) ); 
         }
       } else {
          error(ctx.getStart().getLine(), "add type mismatch");
       }
    }


    @Override
    public void exitSub(PleaseWorkParser.SubContext ctx) {
       //v1.name, and v2.name are in this order, because when we put on stack a - b
       //a and b are in a reverse order, on top of stack is subtrahend and on next is minuend
       Value v2 = stack.pop();
       Value v1 = stack.pop();
       if( v1.type == v2.type ) {

	  if( v1.type == VarType.INT ){
             LLVMGenerator.sub_i32(v1.name,v2.name);
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
          }
	  if( v1.type == VarType.REAL ){
             LLVMGenerator.sub_double(v1.name, v2.name);
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
         }
       } else {
          error(ctx.getStart().getLine(), "sub type mismatch");
       }
    }

    @Override 
    public void exitMult(PleaseWorkParser.MultContext ctx) {
       Value v1 = stack.pop();
       Value v2 = stack.pop();
       if( v1.type == v2.type ) {
	  if( v1.type == VarType.INT ){
             LLVMGenerator.mult_i32(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
          }
	  if( v1.type == VarType.REAL ){
             LLVMGenerator.mult_double(v1.name, v2.name); 
             stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) ); 
         }
       } else {
          error(ctx.getStart().getLine(), "mult type mismatch");
       }
    }

   @Override
   public void exitDiv(PleaseWorkParser.DivContext ctx) {
      Value v2 = stack.pop(); //denominator
      Value v1 = stack.pop(); //numerator
      if( v1.type == v2.type ) {
   if( v1.type == VarType.INT ){
            LLVMGenerator.div_i32(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) );
         }
   if( v1.type == VarType.REAL ){
            LLVMGenerator.div_double(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) );
      }
      } else {
         error(ctx.getStart().getLine(), "div type mismatch");
      }
   }

      @Override
   public void exitAnd(PleaseWorkParser.AndContext ctx) {
      Value v2 = stack.pop(); //denominator
      Value v1 = stack.pop(); //numerator
      if( v1.type == v2.type && v1.type == VarType.BOOL ) {
         LLVMGenerator.and(v1.name, v2.name);
         stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL) );
      } else {
         error(ctx.getStart().getLine(), "and type mismatch, not all variables are bool");
      }
   }

   @Override
   public void exitNeg(PleaseWorkParser.NegContext ctx) {
      Value v1 = stack.pop();
      if(v1.type == VarType.BOOL ) {
         LLVMGenerator.neg(v1.name);
         stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL) );
      } else {
         error(ctx.getStart().getLine(), "and type mismatch, not all variables are bool");
      }
 }

      @Override
   public void exitOr(PleaseWorkParser.OrContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        if( v1.type == v2.type && v1.type == VarType.BOOL ) {
            LLVMGenerator.or(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL) );
        } else {
            error(ctx.getStart().getLine(), "and type mismatch, not all variables are bool");
        }
    }


    @Override
   public void exitXor(PleaseWorkParser.XorContext ctx) {
        Value v2 = stack.pop();
        Value v1 = stack.pop();
        if( v1.type == v2.type && v1.type == VarType.BOOL ) {
            LLVMGenerator.xor(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL) );
        } else {
            error(ctx.getStart().getLine(), "and type mismatch, not all variables are bool");
        }
    }




    @Override 
    public void exitToint(PleaseWorkParser.TointContext ctx) {
       Value v = stack.pop();
       LLVMGenerator.fptosi( v.name );
       stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
    }

    @Override 
    public void exitToreal(PleaseWorkParser.TorealContext ctx) {
       Value v = stack.pop();
       LLVMGenerator.sitofp( v.name );
       stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) ); 
    }

    @Override
    public void exitPrint(PleaseWorkParser.PrintContext ctx) {
       String ID = ctx.ID().getText();
       VarType type = variables.get(ID);
       if( type != null ) {
          if( type == VarType.INT ){
            LLVMGenerator.printf_i32( ID );
          }
          if( type == VarType.REAL ){
            LLVMGenerator.printf_double( ID );
          }
          if( type == VarType.BOOL ){
            LLVMGenerator.printf_bool( ID );
          }
       } else {
          error(ctx.getStart().getLine(), "unknown variable "+ID);
       }
    }

    @Override
    public void exitRead(PleaseWorkParser.ReadContext ctx) {
       String ID = ctx.ID().getText();
       VarType type = variables.get(ID);
       if( ! variables.containsKey(ID) ) {
         error(ctx.getStart().getLine(), "unknown variable "+ID);
       } else {
         if(type == VarType.INT)
         {
            LLVMGenerator.scanInt(ID);
         } else if (type == VarType.REAL) {
            LLVMGenerator.scanReal(ID);
         }
       }
    }

   void error(int line, String msg){
       System.err.println("Error, line "+line+", "+msg);
       System.exit(1);
   } 
       
}
