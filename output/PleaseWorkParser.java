// Generated from PleaseWork.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PleaseWorkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, FUNCTION=4, ENDFUNCTION=5, IF=6, THEN=7, ENDIF=8, 
		EQUALS=9, NOTEQUALS=10, GREATERTHAN=11, LESSTHAN=12, GREATER=13, LESS=14, 
		BOOL=15, AND=16, OR=17, XOR=18, NEG=19, READ=20, PRINT=21, TOINT=22, TOREAL=23, 
		ID=24, REAL=25, INT=26, SUB=27, ADD=28, MULT=29, DIV=30, NEWLINE=31, WS=32;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_blockif = 2, RULE_function = 3, RULE_stat = 4, 
		RULE_expr0 = 5, RULE_expr1 = 6, RULE_expr2 = 7, RULE_compare = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "blockif", "function", "stat", "expr0", "expr1", "expr2", 
			"compare"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' = '", "'('", "')'", "'function'", "'endfunction'", "'if'", "'then'", 
			"'endif'", "' == '", "' != '", "' >= '", "' <= '", "' > '", "' < '", 
			null, "' && '", "' || '", "' ^ '", "'!'", "'read '", "'print '", "'(int)'", 
			"'(real)'", null, null, null, "' - '", "' + '", "' * '", "' / '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "FUNCTION", "ENDFUNCTION", "IF", "THEN", "ENDIF", 
			"EQUALS", "NOTEQUALS", "GREATERTHAN", "LESSTHAN", "GREATER", "LESS", 
			"BOOL", "AND", "OR", "XOR", "NEG", "READ", "PRINT", "TOINT", "TOREAL", 
			"ID", "REAL", "INT", "SUB", "ADD", "MULT", "DIV", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "PleaseWork.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PleaseWorkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(PleaseWorkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PleaseWorkParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2167406672L) != 0)) {
				{
				{
				setState(20);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case READ:
				case PRINT:
				case ID:
					{
					setState(18);
					stat();
					}
					break;
				case FUNCTION:
					{
					setState(19);
					function();
					}
					break;
				case NEWLINE:
					break;
				default:
					break;
				}
				setState(22);
				match(NEWLINE);
				}
				}
				setState(27);
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
	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(PleaseWorkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PleaseWorkParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2167406656L) != 0)) {
				{
				{
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 19923008L) != 0)) {
					{
					setState(28);
					stat();
					}
				}

				setState(31);
				match(NEWLINE);
				}
				}
				setState(36);
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
	public static class BlockifContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterBlockif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitBlockif(this);
		}
	}

	public final BlockifContext blockif() throws RecognitionException {
		BlockifContext _localctx = new BlockifContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blockif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			block();
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(PleaseWorkParser.FUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(FUNCTION);
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
		public TerminalNode PRINT() { return getToken(PleaseWorkParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(PleaseWorkParser.ID, 0); }
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitPrint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends StatContext {
		public TerminalNode READ() { return getToken(PleaseWorkParser.READ, 0); }
		public TerminalNode ID() { return getToken(PleaseWorkParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitRead(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends StatContext {
		public TerminalNode IF() { return getToken(PleaseWorkParser.IF, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode THEN() { return getToken(PleaseWorkParser.THEN, 0); }
		public BlockifContext blockif() {
			return getRuleContext(BlockifContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(PleaseWorkParser.ENDIF, 0); }
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitIf(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(PleaseWorkParser.ID, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitAssign(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stat);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(ID);
				setState(42);
				match(T__0);
				setState(43);
				expr0(0);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(IF);
				setState(45);
				expr0(0);
				setState(46);
				match(THEN);
				setState(47);
				blockif();
				setState(48);
				match(ENDIF);
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(PRINT);
				setState(51);
				match(ID);
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				match(READ);
				setState(53);
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
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitSingle0(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddContext extends Expr0Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode ADD() { return getToken(PleaseWorkParser.ADD, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public AddContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitAdd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegContext extends Expr0Context {
		public TerminalNode NEG() { return getToken(PleaseWorkParser.NEG, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public NegContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitNeg(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubContext extends Expr0Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public TerminalNode SUB() { return getToken(PleaseWorkParser.SUB, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public SubContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrContext extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode OR() { return getToken(PleaseWorkParser.OR, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public OrContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndContext extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode AND() { return getToken(PleaseWorkParser.AND, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AndContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class XorContext extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode XOR() { return getToken(PleaseWorkParser.XOR, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public XorContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitXor(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		return expr0(0);
	}

	private Expr0Context expr0(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr0Context _localctx = new Expr0Context(_ctx, _parentState);
		Expr0Context _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr0, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(57);
				match(NEG);
				setState(58);
				expr1(0);
				}
				break;
			case 2:
				{
				_localctx = new AndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				expr1(0);
				setState(60);
				match(AND);
				setState(61);
				expr0(4);
				}
				break;
			case 3:
				{
				_localctx = new OrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				expr1(0);
				setState(64);
				match(OR);
				setState(65);
				expr0(3);
				}
				break;
			case 4:
				{
				_localctx = new XorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				expr1(0);
				setState(68);
				match(XOR);
				setState(69);
				expr0(2);
				}
				break;
			case 5:
				{
				_localctx = new Single0Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				expr1(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new Expr0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(74);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(75);
						match(ADD);
						setState(76);
						expr1(0);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new Expr0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(77);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(78);
						match(SUB);
						setState(79);
						expr1(0);
						}
						break;
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
	public static class DivContext extends Expr1Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode DIV() { return getToken(PleaseWorkParser.DIV, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public DivContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitDiv(this);
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
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitSingle1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends Expr1Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode MULT() { return getToken(PleaseWorkParser.MULT, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public MultContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitMult(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		return expr1(0);
	}

	private Expr1Context expr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr1Context _localctx = new Expr1Context(_ctx, _parentState);
		Expr1Context _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Single1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(86);
			expr2();
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(94);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new Expr1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(88);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(89);
						match(MULT);
						setState(90);
						expr2();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new Expr1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(91);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(92);
						match(DIV);
						setState(93);
						expr2();
						}
						break;
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitPar(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TointContext extends Expr2Context {
		public TerminalNode TOINT() { return getToken(PleaseWorkParser.TOINT, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TointContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterToint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitToint(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends Expr2Context {
		public TerminalNode BOOL() { return getToken(PleaseWorkParser.BOOL, 0); }
		public BoolContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitBool(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TorealContext extends Expr2Context {
		public TerminalNode TOREAL() { return getToken(PleaseWorkParser.TOREAL, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TorealContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterToreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitToreal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends Expr2Context {
		public TerminalNode REAL() { return getToken(PleaseWorkParser.REAL, 0); }
		public RealContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitReal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends Expr2Context {
		public TerminalNode ID() { return getToken(PleaseWorkParser.ID, 0); }
		public IdContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitId(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends Expr2Context {
		public TerminalNode INT() { return getToken(PleaseWorkParser.INT, 0); }
		public IntContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitInt(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr2);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(REAL);
				}
				break;
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(BOOL);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(ID);
				}
				break;
			case TOINT:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(TOINT);
				setState(104);
				expr2();
				}
				break;
			case TOREAL:
				_localctx = new TorealContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				match(TOREAL);
				setState(106);
				expr2();
				}
				break;
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				match(T__1);
				setState(108);
				expr0(0);
				setState(109);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompareContext extends ParserRuleContext {
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
	 
		public CompareContext() { }
		public void copyFrom(CompareContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessthanContext extends CompareContext {
		public TerminalNode LESSTHAN() { return getToken(PleaseWorkParser.LESSTHAN, 0); }
		public LessthanContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterLessthan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitLessthan(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsContext extends CompareContext {
		public TerminalNode EQUALS() { return getToken(PleaseWorkParser.EQUALS, 0); }
		public EqualsContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitEquals(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotequalsContext extends CompareContext {
		public TerminalNode NOTEQUALS() { return getToken(PleaseWorkParser.NOTEQUALS, 0); }
		public NotequalsContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterNotequals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitNotequals(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterthanContext extends CompareContext {
		public TerminalNode GREATERTHAN() { return getToken(PleaseWorkParser.GREATERTHAN, 0); }
		public GreaterthanContext(CompareContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterGreaterthan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitGreaterthan(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compare);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALS:
				_localctx = new EqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(EQUALS);
				}
				break;
			case NOTEQUALS:
				_localctx = new NotequalsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(NOTEQUALS);
				}
				break;
			case GREATERTHAN:
				_localctx = new GreaterthanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				match(GREATERTHAN);
				}
				break;
			case LESSTHAN:
				_localctx = new LessthanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(116);
				match(LESSTHAN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr0_sempred((Expr0Context)_localctx, predIndex);
		case 6:
			return expr1_sempred((Expr1Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr0_sempred(Expr0Context _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean expr1_sempred(Expr1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 x\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007"+
		"\b\u0001\u0000\u0001\u0000\u0003\u0000\u0015\b\u0000\u0001\u0000\u0005"+
		"\u0000\u0018\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0001\u0003\u0001"+
		"\u001e\b\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"7\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"I\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005Q\b\u0005\n\u0005\f\u0005T\t\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006_\b\u0006\n\u0006\f\u0006b\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007p\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bv\b\b\u0001"+
		"\b\u0000\u0002\n\f\t\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0000\u0000"+
		"\u0087\u0000\u0019\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000"+
		"\u0004%\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000\b6\u0001"+
		"\u0000\u0000\u0000\nH\u0001\u0000\u0000\u0000\fU\u0001\u0000\u0000\u0000"+
		"\u000eo\u0001\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012\u0015"+
		"\u0003\b\u0004\u0000\u0013\u0015\u0003\u0006\u0003\u0000\u0014\u0012\u0001"+
		"\u0000\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0014\u0015\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0005"+
		"\u001f\u0000\u0000\u0017\u0014\u0001\u0000\u0000\u0000\u0018\u001b\u0001"+
		"\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0003\b\u0004\u0000\u001d\u001c\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f!\u0005\u001f\u0000\u0000 \u001d\u0001\u0000\u0000\u0000"+
		"!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#\u0003\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0003"+
		"\u0002\u0001\u0000&\u0005\u0001\u0000\u0000\u0000\'(\u0005\u0004\u0000"+
		"\u0000(\u0007\u0001\u0000\u0000\u0000)*\u0005\u0018\u0000\u0000*+\u0005"+
		"\u0001\u0000\u0000+7\u0003\n\u0005\u0000,-\u0005\u0006\u0000\u0000-.\u0003"+
		"\n\u0005\u0000./\u0005\u0007\u0000\u0000/0\u0003\u0004\u0002\u000001\u0005"+
		"\b\u0000\u000017\u0001\u0000\u0000\u000023\u0005\u0015\u0000\u000037\u0005"+
		"\u0018\u0000\u000045\u0005\u0014\u0000\u000057\u0005\u0018\u0000\u0000"+
		"6)\u0001\u0000\u0000\u00006,\u0001\u0000\u0000\u000062\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u000089\u0006\u0005"+
		"\uffff\uffff\u00009:\u0005\u0013\u0000\u0000:I\u0003\f\u0006\u0000;<\u0003"+
		"\f\u0006\u0000<=\u0005\u0010\u0000\u0000=>\u0003\n\u0005\u0004>I\u0001"+
		"\u0000\u0000\u0000?@\u0003\f\u0006\u0000@A\u0005\u0011\u0000\u0000AB\u0003"+
		"\n\u0005\u0003BI\u0001\u0000\u0000\u0000CD\u0003\f\u0006\u0000DE\u0005"+
		"\u0012\u0000\u0000EF\u0003\n\u0005\u0002FI\u0001\u0000\u0000\u0000GI\u0003"+
		"\f\u0006\u0000H8\u0001\u0000\u0000\u0000H;\u0001\u0000\u0000\u0000H?\u0001"+
		"\u0000\u0000\u0000HC\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000"+
		"IR\u0001\u0000\u0000\u0000JK\n\u0007\u0000\u0000KL\u0005\u001c\u0000\u0000"+
		"LQ\u0003\f\u0006\u0000MN\n\u0006\u0000\u0000NO\u0005\u001b\u0000\u0000"+
		"OQ\u0003\f\u0006\u0000PJ\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000"+
		"QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000S\u000b\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UV\u0006"+
		"\u0006\uffff\uffff\u0000VW\u0003\u000e\u0007\u0000W`\u0001\u0000\u0000"+
		"\u0000XY\n\u0002\u0000\u0000YZ\u0005\u001d\u0000\u0000Z_\u0003\u000e\u0007"+
		"\u0000[\\\n\u0001\u0000\u0000\\]\u0005\u001e\u0000\u0000]_\u0003\u000e"+
		"\u0007\u0000^X\u0001\u0000\u0000\u0000^[\u0001\u0000\u0000\u0000_b\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"a\r\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cp\u0005\u001a\u0000"+
		"\u0000dp\u0005\u0019\u0000\u0000ep\u0005\u000f\u0000\u0000fp\u0005\u0018"+
		"\u0000\u0000gh\u0005\u0016\u0000\u0000hp\u0003\u000e\u0007\u0000ij\u0005"+
		"\u0017\u0000\u0000jp\u0003\u000e\u0007\u0000kl\u0005\u0002\u0000\u0000"+
		"lm\u0003\n\u0005\u0000mn\u0005\u0003\u0000\u0000np\u0001\u0000\u0000\u0000"+
		"oc\u0001\u0000\u0000\u0000od\u0001\u0000\u0000\u0000oe\u0001\u0000\u0000"+
		"\u0000of\u0001\u0000\u0000\u0000og\u0001\u0000\u0000\u0000oi\u0001\u0000"+
		"\u0000\u0000ok\u0001\u0000\u0000\u0000p\u000f\u0001\u0000\u0000\u0000"+
		"qv\u0005\t\u0000\u0000rv\u0005\n\u0000\u0000sv\u0005\u000b\u0000\u0000"+
		"tv\u0005\f\u0000\u0000uq\u0001\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000v\u0011\u0001\u0000"+
		"\u0000\u0000\f\u0014\u0019\u001d\"6HPR^`ou";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}