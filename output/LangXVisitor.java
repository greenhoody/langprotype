// Generated from C:/Users/John/Desktop/kompro read/langprotype/LangX.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LangXParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LangXVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LangXParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LangXParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignBool}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignBool(LangXParser.AssignBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(LangXParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(LangXParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link LangXParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(LangXParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle0(LangXParser.Single0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LangXParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sub}
	 * labeled alternative in {@link LangXParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(LangXParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(LangXParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle1(LangXParser.Single1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LangXParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(LangXParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LangXParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(LangXParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LangXParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToint(LangXParser.TointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToreal(LangXParser.TorealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link LangXParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(LangXParser.ParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neg}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(LangXParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(LangXParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(LangXParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xor}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXor(LangXParser.XorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singlebool0}
	 * labeled alternative in {@link LangXParser#boolexpr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinglebool0(LangXParser.Singlebool0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link LangXParser#boolexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(LangXParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idb}
	 * labeled alternative in {@link LangXParser#boolexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdb(LangXParser.IdbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parb}
	 * labeled alternative in {@link LangXParser#boolexpr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParb(LangXParser.ParbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equals}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(LangXParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notequals}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotequals(LangXParser.NotequalsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterthan}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthan(LangXParser.GreaterthanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessthan}
	 * labeled alternative in {@link LangXParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessthan(LangXParser.LessthanContext ctx);
}