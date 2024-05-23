
import java.util.HashMap;
import java.util.Stack;

enum VarType{ INT, REAL, BOOL ,UNKNOWN }

class Value{ 
	public String name;
	public VarType type;

	public Value( String name, VarType type ){
		this.name = name;
		this.type = type;
	}
}

public class LLVMActions extends LangXBaseListener {
    
   //HashMap<String, Value> variables_2 = new HashMap<String, Value>();

    HashMap<String, VarType> variables = new HashMap<String, VarType>();
    Stack<Value> stack = new Stack<Value>();

    @Override
    public void exitAssign(LangXParser.AssignContext ctx) { 
       String ID = ctx.ID().getText();
       Value v = stack.pop();
       variables.put(ID, v.type);
       if( v.type == VarType.INT ){
         LLVMGenerator.declare_i32(ID);
         LLVMGenerator.assign_i32(ID, v.name);
       } 
       if( v.type == VarType.REAL ){
         LLVMGenerator.declare_double(ID);
         LLVMGenerator.assign_double(ID, v.name);
       } 
    }

        @Override
    public void exitAssignBool(LangXParser.AssignBoolContext ctx) {
      String ID = ctx.ID().getText();
      Value v = stack.pop();
      variables.put(ID, v.type);
      LLVMGenerator.declare_bool(ID);
      LLVMGenerator.assign_bool(ID, v.name);
    }

   @Override
    public void exitId(LangXParser.IdContext ctx) {
        String ID = ctx.ID().getText();
        if (variables.containsKey(ID)) {
            VarType type = variables.get(ID);
            int reg = -1;
            if (type == VarType.INT) {
                reg = LLVMGenerator.load_i32(ID);
            } else if (type == VarType.REAL) {
                reg = LLVMGenerator.load_double(ID);
            }
            stack.push(new Value("%" + reg, type));
        } else {
            error(ctx.getStart().getLine(), "no such variable");
        }
    }

    @Override 
    public void exitProg(LangXParser.ProgContext ctx) { 
       System.out.println( LLVMGenerator.generate() );
    }

    @Override 
    public void exitInt(LangXParser.IntContext ctx) { 
         stack.push( new Value(ctx.INT().getText(), VarType.INT) );       
    } 

    @Override 
    public void exitReal(LangXParser.RealContext ctx) { 
         stack.push( new Value(ctx.REAL().getText(), VarType.REAL) );       
    } 

    // TO-DO
    @Override
    public void exitBool(LangXParser.BoolContext ctx) {
         stack.push( new Value(ctx.BOOL().getText(), VarType.BOOL) );
    }

    @Override 
    public void exitAdd(LangXParser.AddContext ctx) { 
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
    public void exitSub(LangXParser.SubContext ctx) {
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
    public void exitMult(LangXParser.MultContext ctx) { 
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
   public void exitDiv(LangXParser.DivContext ctx) {
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
   public void exitAnd(LangXParser.AndContext ctx) {
      Value v2 = stack.pop(); //denominator
      Value v1 = stack.pop(); //numerator
      if( v1.type == v2.type && v1.type == VarType.BOOL ) {
         LLVMGenerator.and(v1.name, v2.name);
         stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL) );
      } else {
         error(ctx.getStart().getLine(), "and type mismatch, not all variables are bool");
      }
   }

   // @Override
   // public void exitNeg(LangXParser.NegContext ctx) {
   //    Value v1 = stack.pop(); //numerator
   //    if(v1.type == VarType.BOOL ) {
   //       LLVMGenerator.neg(v1.name);
   //       stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL) );
   //    } else {
   //       error(ctx.getStart().getLine(), "and type mismatch, not all variables are bool");
   //    }
   // }

      @Override
   public void exitOr(LangXParser.OrContext ctx) {
        Value v2 = stack.pop(); //denominator
        Value v1 = stack.pop(); //numerator
        if( v1.type == v2.type && v1.type == VarType.BOOL ) {
            LLVMGenerator.or(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL) );
        } else {
            error(ctx.getStart().getLine(), "and type mismatch, not all variables are bool");
        }
    }

    @Override
   public void exitXor(LangXParser.XorContext ctx) {
        Value v2 = stack.pop(); //denominator
        Value v1 = stack.pop(); //numerator
        if( v1.type == v2.type && v1.type == VarType.BOOL ) {
            LLVMGenerator.xor(v1.name, v2.name);
            stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.BOOL) );
        } else {
            error(ctx.getStart().getLine(), "and type mismatch, not all variables are bool");
        }
    }




    @Override 
    public void exitToint(LangXParser.TointContext ctx) { 
       Value v = stack.pop();
       LLVMGenerator.fptosi( v.name );
       stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.INT) ); 
    }

    @Override 
    public void exitToreal(LangXParser.TorealContext ctx) { 
       Value v = stack.pop();
       LLVMGenerator.sitofp( v.name );
       stack.push( new Value("%"+(LLVMGenerator.reg-1), VarType.REAL) ); 
    }

    @Override
    public void exitPrint(LangXParser.PrintContext ctx) {
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
    public void exitRead(LangXParser.ReadContext ctx) {
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
