// Generated from LangX.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LangXParser}.
 */
public interface LangXListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LangXParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LangXParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LangXParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LangXParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LangXParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LangXParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignBool}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignBool(LangXParser.AssignBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignBool}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignBool(LangXParser.AssignBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LangXParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LangXParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(LangXParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(LangXParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(LangXParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(LangXParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LangXParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LangXParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSub(LangXParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSub(LangXParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterDiv(LangXParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitDiv(LangXParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(LangXParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(LangXParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(LangXParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(LangXParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterInt(LangXParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitInt(LangXParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterReal(LangXParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitReal(LangXParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterId(LangXParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitId(LangXParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToint(LangXParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToint(LangXParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToreal(LangXParser.TorealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToreal(LangXParser.TorealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterPar(LangXParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitPar(LangXParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 */
	void enterNeg(LangXParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 */
	void exitNeg(LangXParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 */
	void enterOr(LangXParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 */
	void exitOr(LangXParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 */
	void enterAnd(LangXParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 */
	void exitAnd(LangXParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xor}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 */
	void enterXor(LangXParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 */
	void exitXor(LangXParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singlebool0}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 */
	void enterSinglebool0(LangXParser.Singlebool0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code singlebool0}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 */
	void exitSinglebool0(LangXParser.Singlebool0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code idb}
	 * labeled alternative in {@link LangXParser#boolexpr1}.
	 * @param ctx the parse tree
	 */
	void enterIdb(LangXParser.IdbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idb}
	 * labeled alternative in {@link LangXParser#boolexpr1}.
	 * @param ctx the parse tree
	 */
	void exitIdb(LangXParser.IdbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link LangXParser#boolexpr1}.
	 * @param ctx the parse tree
	 */
	void enterBool(LangXParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link LangXParser#boolexpr1}.
	 * @param ctx the parse tree
	 */
	void exitBool(LangXParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parb}
	 * labeled alternative in {@link LangXParser#boolexpr1}.
	 * @param ctx the parse tree
	 */
	void enterParb(LangXParser.ParbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parb}
	 * labeled alternative in {@link LangXParser#boolexpr1}.
	 * @param ctx the parse tree
	 */
	void exitParb(LangXParser.ParbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equals}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterEquals(LangXParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitEquals(LangXParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notequals}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterNotequals(LangXParser.NotequalsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notequals}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitNotequals(LangXParser.NotequalsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterthan}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterGreaterthan(LangXParser.GreaterthanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterthan}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitGreaterthan(LangXParser.GreaterthanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessthan}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterLessthan(LangXParser.LessthanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessthan}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitLessthan(LangXParser.LessthanContext ctx);
}