// Generated from //wsl.localhost/Ubuntu/home/gamman/repos/if/langprotype/PleaseWork.g4 by ANTLR 4.13.1
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
		BOOL=15, AND=16, OR=17, XOR=18, NEG=19, READ=20, PRINT=21, LOOP=22, ENDLOOP=23, 
		TOINT=24, TOREAL=25, ID=26, REAL=27, INT=28, SUB=29, ADD=30, MULT=31, 
		DIV=32, NEWLINE=33, WS=34;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_blockif = 2, RULE_fblock = 3, RULE_lblock = 4, 
		RULE_function = 5, RULE_fparam = 6, RULE_stat = 7, RULE_expr0 = 8, RULE_expr1 = 9, 
		RULE_expr2 = 10, RULE_compare = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "blockif", "fblock", "lblock", "function", "fparam", 
			"stat", "expr0", "expr1", "expr2", "compare"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' = '", "'('", "')'", "'function'", "'endfunction'", "'if'", "' then'", 
			"'endif'", "' == '", "' != '", "' >= '", "' <= '", "' > '", "' < '", 
			null, "' && '", "' || '", "' ^ '", "'!'", "'read '", "'print '", "'loop '", 
			"'endloop'", "'(int)'", "'(real)'", null, null, null, "' - '", "' + '", 
			"' * '", "' / '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "FUNCTION", "ENDFUNCTION", "IF", "THEN", "ENDIF", 
			"EQUALS", "NOTEQUALS", "GREATERTHAN", "LESSTHAN", "GREATER", "LESS", 
			"BOOL", "AND", "OR", "XOR", "NEG", "READ", "PRINT", "LOOP", "ENDLOOP", 
			"TOINT", "TOREAL", "ID", "REAL", "INT", "SUB", "ADD", "MULT", "DIV", 
			"NEWLINE", "WS"
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8664383568L) != 0)) {
				{
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case READ:
				case PRINT:
				case LOOP:
				case ID:
					{
					setState(24);
					stat();
					}
					break;
				case FUNCTION:
					{
					setState(25);
					function();
					}
					break;
				case NEWLINE:
					break;
				default:
					break;
				}
				setState(28);
				match(NEWLINE);
				}
				}
				setState(33);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8664383552L) != 0)) {
				{
				{
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 74448960L) != 0)) {
					{
					setState(34);
					stat();
					}
				}

				setState(37);
				match(NEWLINE);
				}
				}
				setState(42);
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
	}

	public final BlockifContext blockif() throws RecognitionException {
		BlockifContext _localctx = new BlockifContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blockif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
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
	public static class FblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
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
	public static class LblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lblock; }
	}

	public final LblockContext lblock() throws RecognitionException {
		LblockContext _localctx = new LblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
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
		public FparamContext fparam() {
			return getRuleContext(FparamContext.class,0);
		}
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public TerminalNode ENDFUNCTION() { return getToken(PleaseWorkParser.ENDFUNCTION, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(FUNCTION);
			setState(50);
			fparam();
			setState(51);
			fblock();
			setState(52);
			match(ENDFUNCTION);
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
	public static class FparamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PleaseWorkParser.ID, 0); }
		public FparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparam; }
	}

	public final FparamContext fparam() throws RecognitionException {
		FparamContext _localctx = new FparamContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ID);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadContext extends StatContext {
		public TerminalNode READ() { return getToken(PleaseWorkParser.READ, 0); }
		public TerminalNode ID() { return getToken(PleaseWorkParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends StatContext {
		public TerminalNode LOOP() { return getToken(PleaseWorkParser.LOOP, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public LblockContext lblock() {
			return getRuleContext(LblockContext.class,0);
		}
		public TerminalNode ENDLOOP() { return getToken(PleaseWorkParser.ENDLOOP, 0); }
		public LoopContext(StatContext ctx) { copyFrom(ctx); }
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(PleaseWorkParser.ID, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stat);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOP:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(LOOP);
				setState(57);
				expr0(0);
				setState(58);
				lblock();
				setState(59);
				match(ENDLOOP);
				}
				break;
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(ID);
				setState(62);
				match(T__0);
				setState(63);
				expr0(0);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(IF);
				setState(65);
				expr0(0);
				setState(66);
				match(THEN);
				setState(67);
				blockif();
				setState(68);
				match(ENDIF);
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(PRINT);
				setState(71);
				match(ID);
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				match(READ);
				setState(73);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegContext extends Expr0Context {
		public TerminalNode NEG() { return getToken(PleaseWorkParser.NEG, 0); }
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public NegContext(Expr0Context ctx) { copyFrom(ctx); }
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
	}

	public final Expr0Context expr0() throws RecognitionException {
		return expr0(0);
	}

	private Expr0Context expr0(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr0Context _localctx = new Expr0Context(_ctx, _parentState);
		Expr0Context _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr0, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				match(NEG);
				setState(78);
				expr1(0);
				}
				break;
			case 2:
				{
				_localctx = new AndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				expr1(0);
				setState(80);
				match(AND);
				setState(81);
				expr0(4);
				}
				break;
			case 3:
				{
				_localctx = new OrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				expr1(0);
				setState(84);
				match(OR);
				setState(85);
				expr0(3);
				}
				break;
			case 4:
				{
				_localctx = new XorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				expr1(0);
				setState(88);
				match(XOR);
				setState(89);
				expr0(2);
				}
				break;
			case 5:
				{
				_localctx = new Single0Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				expr1(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(100);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new Expr0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(94);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(95);
						match(ADD);
						setState(96);
						expr1(0);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new Expr0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(97);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(98);
						match(SUB);
						setState(99);
						expr1(0);
						}
						break;
					}
					} 
				}
				setState(104);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Single1Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Single1Context(Expr1Context ctx) { copyFrom(ctx); }
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
	}

	public final Expr1Context expr1() throws RecognitionException {
		return expr1(0);
	}

	private Expr1Context expr1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr1Context _localctx = new Expr1Context(_ctx, _parentState);
		Expr1Context _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Single1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(106);
			expr2();
			}
			_ctx.stop = _input.LT(-1);
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(114);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new Expr1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(108);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(109);
						match(MULT);
						setState(110);
						expr2();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new Expr1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(111);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(112);
						match(DIV);
						setState(113);
						expr2();
						}
						break;
					}
					} 
				}
				setState(118);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TointContext extends Expr2Context {
		public TerminalNode TOINT() { return getToken(PleaseWorkParser.TOINT, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TointContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends Expr2Context {
		public TerminalNode BOOL() { return getToken(PleaseWorkParser.BOOL, 0); }
		public BoolContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TorealContext extends Expr2Context {
		public TerminalNode TOREAL() { return getToken(PleaseWorkParser.TOREAL, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public TorealContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends Expr2Context {
		public TerminalNode REAL() { return getToken(PleaseWorkParser.REAL, 0); }
		public RealContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends Expr2Context {
		public TerminalNode ID() { return getToken(PleaseWorkParser.ID, 0); }
		public IdContext(Expr2Context ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends Expr2Context {
		public TerminalNode INT() { return getToken(PleaseWorkParser.INT, 0); }
		public IntContext(Expr2Context ctx) { copyFrom(ctx); }
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr2);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(REAL);
				}
				break;
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(BOOL);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
				match(ID);
				}
				break;
			case TOINT:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(123);
				match(TOINT);
				setState(124);
				expr2();
				}
				break;
			case TOREAL:
				_localctx = new TorealContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(125);
				match(TOREAL);
				setState(126);
				expr2();
				}
				break;
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(127);
				match(T__1);
				setState(128);
				expr0(0);
				setState(129);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsContext extends CompareContext {
		public TerminalNode EQUALS() { return getToken(PleaseWorkParser.EQUALS, 0); }
		public EqualsContext(CompareContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotequalsContext extends CompareContext {
		public TerminalNode NOTEQUALS() { return getToken(PleaseWorkParser.NOTEQUALS, 0); }
		public NotequalsContext(CompareContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterthanContext extends CompareContext {
		public TerminalNode GREATERTHAN() { return getToken(PleaseWorkParser.GREATERTHAN, 0); }
		public GreaterthanContext(CompareContext ctx) { copyFrom(ctx); }
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compare);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALS:
				_localctx = new EqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(EQUALS);
				}
				break;
			case NOTEQUALS:
				_localctx = new NotequalsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(NOTEQUALS);
				}
				break;
			case GREATERTHAN:
				_localctx = new GreaterthanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(GREATERTHAN);
				}
				break;
			case LESSTHAN:
				_localctx = new LessthanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
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
		case 8:
			return expr0_sempred((Expr0Context)_localctx, predIndex);
		case 9:
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
		"\u0004\u0001\"\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0000\u0005\u0000\u001e"+
		"\b\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0001\u0003\u0001$\b\u0001\u0001"+
		"\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007K\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\b]\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\be\b\b\n\b\f\bh\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\ts\b\t\n\t\f\tv\t\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0084\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u008a\b\u000b\u0001\u000b\u0000\u0002\u0010\u0012\f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000\u0099\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004+\u0001\u0000"+
		"\u0000\u0000\u0006-\u0001\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000"+
		"\n1\u0001\u0000\u0000\u0000\f6\u0001\u0000\u0000\u0000\u000eJ\u0001\u0000"+
		"\u0000\u0000\u0010\\\u0001\u0000\u0000\u0000\u0012i\u0001\u0000\u0000"+
		"\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u0089\u0001\u0000\u0000"+
		"\u0000\u0018\u001b\u0003\u000e\u0007\u0000\u0019\u001b\u0003\n\u0005\u0000"+
		"\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u0019\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0005!\u0000\u0000\u001d\u001a\u0001\u0000\u0000\u0000\u001e"+
		"!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000\"$\u0003\u000e\u0007\u0000#\"\u0001\u0000\u0000\u0000#$\u0001\u0000"+
		"\u0000\u0000$%\u0001\u0000\u0000\u0000%\'\u0005!\u0000\u0000&#\u0001\u0000"+
		"\u0000\u0000\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001"+
		"\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000+,\u0003\u0002\u0001\u0000,\u0005\u0001\u0000\u0000\u0000-.\u0003"+
		"\u0002\u0001\u0000.\u0007\u0001\u0000\u0000\u0000/0\u0003\u0002\u0001"+
		"\u00000\t\u0001\u0000\u0000\u000012\u0005\u0004\u0000\u000023\u0003\f"+
		"\u0006\u000034\u0003\u0006\u0003\u000045\u0005\u0005\u0000\u00005\u000b"+
		"\u0001\u0000\u0000\u000067\u0005\u001a\u0000\u00007\r\u0001\u0000\u0000"+
		"\u000089\u0005\u0016\u0000\u00009:\u0003\u0010\b\u0000:;\u0003\b\u0004"+
		"\u0000;<\u0005\u0017\u0000\u0000<K\u0001\u0000\u0000\u0000=>\u0005\u001a"+
		"\u0000\u0000>?\u0005\u0001\u0000\u0000?K\u0003\u0010\b\u0000@A\u0005\u0006"+
		"\u0000\u0000AB\u0003\u0010\b\u0000BC\u0005\u0007\u0000\u0000CD\u0003\u0004"+
		"\u0002\u0000DE\u0005\b\u0000\u0000EK\u0001\u0000\u0000\u0000FG\u0005\u0015"+
		"\u0000\u0000GK\u0005\u001a\u0000\u0000HI\u0005\u0014\u0000\u0000IK\u0005"+
		"\u001a\u0000\u0000J8\u0001\u0000\u0000\u0000J=\u0001\u0000\u0000\u0000"+
		"J@\u0001\u0000\u0000\u0000JF\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000K\u000f\u0001\u0000\u0000\u0000LM\u0006\b\uffff\uffff\u0000MN\u0005"+
		"\u0013\u0000\u0000N]\u0003\u0012\t\u0000OP\u0003\u0012\t\u0000PQ\u0005"+
		"\u0010\u0000\u0000QR\u0003\u0010\b\u0004R]\u0001\u0000\u0000\u0000ST\u0003"+
		"\u0012\t\u0000TU\u0005\u0011\u0000\u0000UV\u0003\u0010\b\u0003V]\u0001"+
		"\u0000\u0000\u0000WX\u0003\u0012\t\u0000XY\u0005\u0012\u0000\u0000YZ\u0003"+
		"\u0010\b\u0002Z]\u0001\u0000\u0000\u0000[]\u0003\u0012\t\u0000\\L\u0001"+
		"\u0000\u0000\u0000\\O\u0001\u0000\u0000\u0000\\S\u0001\u0000\u0000\u0000"+
		"\\W\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]f\u0001\u0000\u0000"+
		"\u0000^_\n\u0007\u0000\u0000_`\u0005\u001e\u0000\u0000`e\u0003\u0012\t"+
		"\u0000ab\n\u0006\u0000\u0000bc\u0005\u001d\u0000\u0000ce\u0003\u0012\t"+
		"\u0000d^\u0001\u0000\u0000\u0000da\u0001\u0000\u0000\u0000eh\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0011"+
		"\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000ij\u0006\t\uffff\uffff"+
		"\u0000jk\u0003\u0014\n\u0000kt\u0001\u0000\u0000\u0000lm\n\u0002\u0000"+
		"\u0000mn\u0005\u001f\u0000\u0000ns\u0003\u0014\n\u0000op\n\u0001\u0000"+
		"\u0000pq\u0005 \u0000\u0000qs\u0003\u0014\n\u0000rl\u0001\u0000\u0000"+
		"\u0000ro\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000u\u0013\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000w\u0084\u0005\u001c\u0000\u0000x\u0084\u0005"+
		"\u001b\u0000\u0000y\u0084\u0005\u000f\u0000\u0000z\u0084\u0005\u001a\u0000"+
		"\u0000{|\u0005\u0018\u0000\u0000|\u0084\u0003\u0014\n\u0000}~\u0005\u0019"+
		"\u0000\u0000~\u0084\u0003\u0014\n\u0000\u007f\u0080\u0005\u0002\u0000"+
		"\u0000\u0080\u0081\u0003\u0010\b\u0000\u0081\u0082\u0005\u0003\u0000\u0000"+
		"\u0082\u0084\u0001\u0000\u0000\u0000\u0083w\u0001\u0000\u0000\u0000\u0083"+
		"x\u0001\u0000\u0000\u0000\u0083y\u0001\u0000\u0000\u0000\u0083z\u0001"+
		"\u0000\u0000\u0000\u0083{\u0001\u0000\u0000\u0000\u0083}\u0001\u0000\u0000"+
		"\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0084\u0015\u0001\u0000\u0000"+
		"\u0000\u0085\u008a\u0005\t\u0000\u0000\u0086\u008a\u0005\n\u0000\u0000"+
		"\u0087\u008a\u0005\u000b\u0000\u0000\u0088\u008a\u0005\f\u0000\u0000\u0089"+
		"\u0085\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u0017\u0001\u0000\u0000\u0000\f\u001a\u001f#(J\\dfrt\u0083\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}