
import java.util.HashMap;
import java.util.Stack;

enum VarType{ INT, REAL, UNKNOWN }

class Value{ 
	public String name;
	public VarType type;
	public Value( String name, VarType type ){
		this.name = name;
		this.type = type;
	}
}

public class LLVMActions extends LangXBaseListener {
    
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
       } else {
          error(ctx.getStart().getLine(), "unknown variable "+ID);
       }
    } 

   void error(int line, String msg){
       System.err.println("Error, line "+line+", "+msg);
       System.exit(1);
   } 
       
}
