// Generated from LangX.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LangXParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PRINT=4, TOINT=5, TOREAL=6, ID=7, REAL=8, INT=9, 
		SUB=10, ADD=11, MULT=12, NEWLINE=13, WS=14;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr0 = 2, RULE_expr1 = 3, RULE_expr2 = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr0", "expr1", "expr2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'print'", "'(int)'", "'(real)'", null, null, 
			null, "'-'", "'+'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PRINT", "TOINT", "TOREAL", "ID", "REAL", "INT", 
			"SUB", "ADD", "MULT", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LangX.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangXParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(LangXParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LangXParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8336L) != 0)) {
				{
				{
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PRINT || _la==ID) {
					{
					setState(10);
					stat();
					}
				}

				setState(13);
				match(NEWLINE);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends StatContext {
		public TerminalNode PRINT() { return getToken(LangXParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitPrint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(LangXParser.ID, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAssign(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(ID);
				setState(20);
				match(T__0);
				setState(21);
				expr0();
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(PRINT);
				setState(23);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr0Context extends ParserRuleContext {
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	 
		public Expr0Context() { }
		public void copyFrom(Expr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single0Context extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Single0Context(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitSingle0(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode ADD() { return getToken(LangXParser.ADD, 0); }
		public AddContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitAdd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode SUB() { return getToken(LangXParser.SUB, 0); }
		public SubContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitSub(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr0);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				expr1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				expr1();
				setState(28);
				match(ADD);
				setState(29);
				expr1();
				}
				break;
			case 3:
				_localctx = new SubContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				expr1();
				setState(32);
				match(SUB);
				setState(33);
				expr1();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single1Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Single1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitSingle1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode MULT() { return getToken(LangXParser.MULT, 0); }
		public MultContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitMult(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr1);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				expr2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				expr2();
				setState(39);
				match(MULT);
				setState(40);
				expr2();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParContext extends Expr2Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ParContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitPar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TointContext extends Expr2Context {
		public TerminalNode TOINT() { return getToken(LangXParser.TOINT, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TointContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterToint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitToint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TorealContext extends Expr2Context {
		public TerminalNode TOREAL() { return getToken(LangXParser.TOREAL, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TorealContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterToreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitToreal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends Expr2Context {
		public TerminalNode REAL() { return getToken(LangXParser.REAL, 0); }
		public RealContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitReal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends Expr2Context {
		public TerminalNode INT() { return getToken(LangXParser.INT, 0); }
		public IntContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangXListener ) ((LangXListener)listener).exitInt(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr2);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				match(REAL);
				}
				break;
			case TOINT:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				match(TOINT);
				setState(47);
				expr2();
				}
				break;
			case TOREAL:
				_localctx = new TorealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(TOREAL);
				setState(49);
				expr2();
				}
				break;
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(T__1);
				setState(51);
				expr0();
				setState(52);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u000e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0003\u0000\f\b\u0000\u0001\u0000\u0005\u0000\u000f\b\u0000\n\u0000"+
		"\f\u0000\u0012\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003+\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u00047\b\u0004\u0001\u0004\u0000\u0000\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0000=\u0000\u0010\u0001\u0000\u0000\u0000"+
		"\u0002\u0018\u0001\u0000\u0000\u0000\u0004#\u0001\u0000\u0000\u0000\u0006"+
		"*\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n\f\u0003\u0002\u0001"+
		"\u0000\u000b\n\u0001\u0000\u0000\u0000\u000b\f\u0001\u0000\u0000\u0000"+
		"\f\r\u0001\u0000\u0000\u0000\r\u000f\u0005\r\u0000\u0000\u000e\u000b\u0001"+
		"\u0000\u0000\u0000\u000f\u0012\u0001\u0000\u0000\u0000\u0010\u000e\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0001\u0001"+
		"\u0000\u0000\u0000\u0012\u0010\u0001\u0000\u0000\u0000\u0013\u0014\u0005"+
		"\u0007\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015\u0019\u0003"+
		"\u0004\u0002\u0000\u0016\u0017\u0005\u0004\u0000\u0000\u0017\u0019\u0005"+
		"\u0007\u0000\u0000\u0018\u0013\u0001\u0000\u0000\u0000\u0018\u0016\u0001"+
		"\u0000\u0000\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a$\u0003\u0006"+
		"\u0003\u0000\u001b\u001c\u0003\u0006\u0003\u0000\u001c\u001d\u0005\u000b"+
		"\u0000\u0000\u001d\u001e\u0003\u0006\u0003\u0000\u001e$\u0001\u0000\u0000"+
		"\u0000\u001f \u0003\u0006\u0003\u0000 !\u0005\n\u0000\u0000!\"\u0003\u0006"+
		"\u0003\u0000\"$\u0001\u0000\u0000\u0000#\u001a\u0001\u0000\u0000\u0000"+
		"#\u001b\u0001\u0000\u0000\u0000#\u001f\u0001\u0000\u0000\u0000$\u0005"+
		"\u0001\u0000\u0000\u0000%+\u0003\b\u0004\u0000&\'\u0003\b\u0004\u0000"+
		"\'(\u0005\f\u0000\u0000()\u0003\b\u0004\u0000)+\u0001\u0000\u0000\u0000"+
		"*%\u0001\u0000\u0000\u0000*&\u0001\u0000\u0000\u0000+\u0007\u0001\u0000"+
		"\u0000\u0000,7\u0005\t\u0000\u0000-7\u0005\b\u0000\u0000./\u0005\u0005"+
		"\u0000\u0000/7\u0003\b\u0004\u000001\u0005\u0006\u0000\u000017\u0003\b"+
		"\u0004\u000023\u0005\u0002\u0000\u000034\u0003\u0004\u0002\u000045\u0005"+
		"\u0003\u0000\u000057\u0001\u0000\u0000\u00006,\u0001\u0000\u0000\u0000"+
		"6-\u0001\u0000\u0000\u00006.\u0001\u0000\u0000\u000060\u0001\u0000\u0000"+
		"\u000062\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u0000\u0006\u000b"+
		"\u0010\u0018#*6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}