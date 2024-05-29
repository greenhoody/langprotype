// Generated from PleaseWork.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PleaseWorkParser}.
 */
public interface PleaseWorkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PleaseWorkParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(PleaseWorkParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link PleaseWorkParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(PleaseWorkParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link PleaseWorkParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PleaseWorkParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PleaseWorkParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PleaseWorkParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PleaseWorkParser#blockif}.
	 * @param ctx the parse tree
	 */
	void enterBlockif(PleaseWorkParser.BlockifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PleaseWorkParser#blockif}.
	 * @param ctx the parse tree
	 */
	void exitBlockif(PleaseWorkParser.BlockifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PleaseWorkParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(PleaseWorkParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PleaseWorkParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(PleaseWorkParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PleaseWorkParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(PleaseWorkParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link PleaseWorkParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(PleaseWorkParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if}
	 * labeled alternative in {@link PleaseWorkParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIf(PleaseWorkParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if}
	 * labeled alternative in {@link PleaseWorkParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIf(PleaseWorkParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link PleaseWorkParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PleaseWorkParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link PleaseWorkParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PleaseWorkParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link PleaseWorkParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(PleaseWorkParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link PleaseWorkParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(PleaseWorkParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(PleaseWorkParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(PleaseWorkParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(PleaseWorkParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(PleaseWorkParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neg}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterNeg(PleaseWorkParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitNeg(PleaseWorkParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sub}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSub(PleaseWorkParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSub(PleaseWorkParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterOr(PleaseWorkParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitOr(PleaseWorkParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAnd(PleaseWorkParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAnd(PleaseWorkParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xor}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterXor(PleaseWorkParser.XorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link PleaseWorkParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitXor(PleaseWorkParser.XorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link PleaseWorkParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterDiv(PleaseWorkParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link PleaseWorkParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitDiv(PleaseWorkParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link PleaseWorkParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(PleaseWorkParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link PleaseWorkParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(PleaseWorkParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link PleaseWorkParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(PleaseWorkParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link PleaseWorkParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(PleaseWorkParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterInt(PleaseWorkParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitInt(PleaseWorkParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterReal(PleaseWorkParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitReal(PleaseWorkParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterBool(PleaseWorkParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitBool(PleaseWorkParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterId(PleaseWorkParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitId(PleaseWorkParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToint(PleaseWorkParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToint(PleaseWorkParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterToreal(PleaseWorkParser.TorealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitToreal(PleaseWorkParser.TorealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterPar(PleaseWorkParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link PleaseWorkParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitPar(PleaseWorkParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equals}
	 * labeled alternative in {@link PleaseWorkParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterEquals(PleaseWorkParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link PleaseWorkParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitEquals(PleaseWorkParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notequals}
	 * labeled alternative in {@link PleaseWorkParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterNotequals(PleaseWorkParser.NotequalsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notequals}
	 * labeled alternative in {@link PleaseWorkParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitNotequals(PleaseWorkParser.NotequalsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterthan}
	 * labeled alternative in {@link PleaseWorkParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterGreaterthan(PleaseWorkParser.GreaterthanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterthan}
	 * labeled alternative in {@link PleaseWorkParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitGreaterthan(PleaseWorkParser.GreaterthanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessthan}
	 * labeled alternative in {@link PleaseWorkParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterLessthan(PleaseWorkParser.LessthanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessthan}
	 * labeled alternative in {@link PleaseWorkParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitLessthan(PleaseWorkParser.LessthanContext ctx);
}