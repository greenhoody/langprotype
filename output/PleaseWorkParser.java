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
		T__0=1, T__1=2, T__2=3, INT_TYPE=4, REAL_TYPE=5, FLOAT_TYPE=6, BOOL_TYPE=7, 
		FUNCTION=8, ENDFUNCTION=9, IF=10, THEN=11, ENDIF=12, EQUALS=13, NOTEQUALS=14, 
		GREATERTHAN=15, LESSTHAN=16, GREATER=17, LESS=18, BOOL=19, AND=20, OR=21, 
		XOR=22, NEG=23, READ=24, PRINT=25, LOOP=26, ENDLOOP=27, TOINT=28, TOREAL=29, 
		ID=30, REAL=31, FLOAT=32, INT=33, SUB=34, ADD=35, MULT=36, DIV=37, NEWLINE=38, 
		WS=39;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_blockif = 2, RULE_fblock = 3, RULE_lblock = 4, 
		RULE_function = 5, RULE_fname = 6, RULE_datatype = 7, RULE_stat = 8, RULE_expr0 = 9, 
		RULE_expr1 = 10, RULE_expr2 = 11, RULE_compare = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "block", "blockif", "fblock", "lblock", "function", "fname", 
			"datatype", "stat", "expr0", "expr1", "expr2", "compare"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' = '", "'('", "')'", "'int'", "'real'", "'float'", "'bool'", 
			"'function'", "'endfunction'", "'if'", "' then'", "'endif'", "' == '", 
			"' != '", "' >= '", "' <= '", "' > '", "' < '", null, "' && '", "' || '", 
			"' ^ '", "'!'", "'read '", "'print '", "'loop '", "'endloop'", "'(int)'", 
			"'(real)'", null, null, null, null, "' - '", "' + '", "' * '", "' / '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "INT_TYPE", "REAL_TYPE", "FLOAT_TYPE", "BOOL_TYPE", 
			"FUNCTION", "ENDFUNCTION", "IF", "THEN", "ENDIF", "EQUALS", "NOTEQUALS", 
			"GREATERTHAN", "LESSTHAN", "GREATER", "LESS", "BOOL", "AND", "OR", "XOR", 
			"NEG", "READ", "PRINT", "LOOP", "ENDLOOP", "TOINT", "TOREAL", "ID", "REAL", 
			"FLOAT", "INT", "SUB", "ADD", "MULT", "DIV", "NEWLINE", "WS"
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
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276069090544L) != 0)) {
				{
				{
				setState(28);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case READ:
				case PRINT:
				case LOOP:
				case ID:
					{
					setState(26);
					stat();
					}
					break;
				case INT_TYPE:
				case REAL_TYPE:
				case FLOAT_TYPE:
				case BOOL_TYPE:
					{
					setState(27);
					function();
					}
					break;
				case NEWLINE:
					break;
				default:
					break;
				}
				setState(30);
				match(NEWLINE);
				}
				}
				setState(35);
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
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 276069090304L) != 0)) {
				{
				{
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1191183360L) != 0)) {
					{
					setState(36);
					stat();
					}
				}

				setState(39);
				match(NEWLINE);
				}
				}
				setState(44);
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
	public static class FblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterFblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitFblock(this);
		}
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fblock);
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
	public static class LblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public LblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterLblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitLblock(this);
		}
	}

	public final LblockContext lblock() throws RecognitionException {
		LblockContext _localctx = new LblockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(PleaseWorkParser.FUNCTION, 0); }
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PleaseWorkParser.THEN, 0); }
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public TerminalNode ENDFUNCTION() { return getToken(PleaseWorkParser.ENDFUNCTION, 0); }
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
		enterRule(_localctx, 10, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			datatype();
			setState(52);
			match(FUNCTION);
			setState(53);
			fname();
			setState(54);
			match(THEN);
			setState(55);
			fblock();
			setState(56);
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
	public static class FnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PleaseWorkParser.ID, 0); }
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterFname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitFname(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(PleaseWorkParser.INT_TYPE, 0); }
		public TerminalNode REAL_TYPE() { return getToken(PleaseWorkParser.REAL_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(PleaseWorkParser.FLOAT_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(PleaseWorkParser.BOOL_TYPE, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitLoop(this);
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
		enterRule(_localctx, 16, RULE_stat);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOOP:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(LOOP);
				setState(63);
				expr0(0);
				setState(64);
				lblock();
				setState(65);
				match(ENDLOOP);
				}
				break;
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(ID);
				setState(68);
				match(T__0);
				setState(69);
				expr0(0);
				}
				break;
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(IF);
				setState(71);
				expr0(0);
				setState(72);
				match(THEN);
				setState(73);
				blockif();
				setState(74);
				match(ENDIF);
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(PRINT);
				setState(77);
				match(ID);
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(READ);
				setState(79);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr0, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new NegContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				match(NEG);
				setState(84);
				expr1(0);
				}
				break;
			case 2:
				{
				_localctx = new AndContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				expr1(0);
				setState(86);
				match(AND);
				setState(87);
				expr0(4);
				}
				break;
			case 3:
				{
				_localctx = new OrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				expr1(0);
				setState(90);
				match(OR);
				setState(91);
				expr0(3);
				}
				break;
			case 4:
				{
				_localctx = new XorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				expr1(0);
				setState(94);
				match(XOR);
				setState(95);
				expr0(2);
				}
				break;
			case 5:
				{
				_localctx = new Single0Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97);
				expr1(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new AddContext(new Expr0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(100);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(101);
						match(ADD);
						setState(102);
						expr1(0);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new Expr0Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr0);
						setState(103);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(104);
						match(SUB);
						setState(105);
						expr1(0);
						}
						break;
					}
					} 
				}
				setState(110);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Single1Context(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(112);
			expr2();
			}
			_ctx.stop = _input.LT(-1);
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new Expr1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(114);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(115);
						match(MULT);
						setState(116);
						expr2();
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new Expr1Context(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr1);
						setState(117);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(118);
						match(DIV);
						setState(119);
						expr2();
						}
						break;
					}
					} 
				}
				setState(124);
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
	public static class FloatContext extends Expr2Context {
		public TerminalNode FLOAT() { return getToken(PleaseWorkParser.FLOAT, 0); }
		public FloatContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PleaseWorkListener ) ((PleaseWorkListener)listener).exitFloat(this);
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
		enterRule(_localctx, 22, RULE_expr2);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(INT);
				}
				break;
			case FLOAT:
				_localctx = new FloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(FLOAT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(REAL);
				}
				break;
			case BOOL:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(BOOL);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				match(ID);
				}
				break;
			case TOINT:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				match(TOINT);
				setState(131);
				expr2();
				}
				break;
			case TOREAL:
				_localctx = new TorealContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(132);
				match(TOREAL);
				setState(133);
				expr2();
				}
				break;
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(134);
				match(T__1);
				setState(135);
				expr0(0);
				setState(136);
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
		enterRule(_localctx, 24, RULE_compare);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUALS:
				_localctx = new EqualsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(EQUALS);
				}
				break;
			case NOTEQUALS:
				_localctx = new NotequalsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(NOTEQUALS);
				}
				break;
			case GREATERTHAN:
				_localctx = new GreaterthanContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(GREATERTHAN);
				}
				break;
			case LESSTHAN:
				_localctx = new LessthanContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
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
		case 9:
			return expr0_sempred((Expr0Context)_localctx, predIndex);
		case 10:
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
		"\u0004\u0001\'\u0093\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001\u0000"+
		"\u0005\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0001\u0003\u0001"+
		"&\b\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bQ\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tc\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tk\b\t\n\t\f"+
		"\tn\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\ny\b\n\n\n\f\n|\t\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008b\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0091\b\f\u0001\f\u0000\u0002"+
		"\u0012\u0014\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u0000\u0001\u0001\u0000\u0004\u0007\u00a0\u0000!\u0001\u0000\u0000"+
		"\u0000\u0002*\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u0006"+
		"/\u0001\u0000\u0000\u0000\b1\u0001\u0000\u0000\u0000\n3\u0001\u0000\u0000"+
		"\u0000\f:\u0001\u0000\u0000\u0000\u000e<\u0001\u0000\u0000\u0000\u0010"+
		"P\u0001\u0000\u0000\u0000\u0012b\u0001\u0000\u0000\u0000\u0014o\u0001"+
		"\u0000\u0000\u0000\u0016\u008a\u0001\u0000\u0000\u0000\u0018\u0090\u0001"+
		"\u0000\u0000\u0000\u001a\u001d\u0003\u0010\b\u0000\u001b\u001d\u0003\n"+
		"\u0005\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001b\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000"+
		"\u0000\u0000\u001e \u0005&\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"\u0001\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000"+
		"$&\u0003\u0010\b\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\')\u0005&\u0000\u0000(%\u0001\u0000\u0000"+
		"\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+\u0003\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000"+
		"-.\u0003\u0002\u0001\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0003\u0002"+
		"\u0001\u00000\u0007\u0001\u0000\u0000\u000012\u0003\u0002\u0001\u0000"+
		"2\t\u0001\u0000\u0000\u000034\u0003\u000e\u0007\u000045\u0005\b\u0000"+
		"\u000056\u0003\f\u0006\u000067\u0005\u000b\u0000\u000078\u0003\u0006\u0003"+
		"\u000089\u0005\t\u0000\u00009\u000b\u0001\u0000\u0000\u0000:;\u0005\u001e"+
		"\u0000\u0000;\r\u0001\u0000\u0000\u0000<=\u0007\u0000\u0000\u0000=\u000f"+
		"\u0001\u0000\u0000\u0000>?\u0005\u001a\u0000\u0000?@\u0003\u0012\t\u0000"+
		"@A\u0003\b\u0004\u0000AB\u0005\u001b\u0000\u0000BQ\u0001\u0000\u0000\u0000"+
		"CD\u0005\u001e\u0000\u0000DE\u0005\u0001\u0000\u0000EQ\u0003\u0012\t\u0000"+
		"FG\u0005\n\u0000\u0000GH\u0003\u0012\t\u0000HI\u0005\u000b\u0000\u0000"+
		"IJ\u0003\u0004\u0002\u0000JK\u0005\f\u0000\u0000KQ\u0001\u0000\u0000\u0000"+
		"LM\u0005\u0019\u0000\u0000MQ\u0005\u001e\u0000\u0000NO\u0005\u0018\u0000"+
		"\u0000OQ\u0005\u001e\u0000\u0000P>\u0001\u0000\u0000\u0000PC\u0001\u0000"+
		"\u0000\u0000PF\u0001\u0000\u0000\u0000PL\u0001\u0000\u0000\u0000PN\u0001"+
		"\u0000\u0000\u0000Q\u0011\u0001\u0000\u0000\u0000RS\u0006\t\uffff\uffff"+
		"\u0000ST\u0005\u0017\u0000\u0000Tc\u0003\u0014\n\u0000UV\u0003\u0014\n"+
		"\u0000VW\u0005\u0014\u0000\u0000WX\u0003\u0012\t\u0004Xc\u0001\u0000\u0000"+
		"\u0000YZ\u0003\u0014\n\u0000Z[\u0005\u0015\u0000\u0000[\\\u0003\u0012"+
		"\t\u0003\\c\u0001\u0000\u0000\u0000]^\u0003\u0014\n\u0000^_\u0005\u0016"+
		"\u0000\u0000_`\u0003\u0012\t\u0002`c\u0001\u0000\u0000\u0000ac\u0003\u0014"+
		"\n\u0000bR\u0001\u0000\u0000\u0000bU\u0001\u0000\u0000\u0000bY\u0001\u0000"+
		"\u0000\u0000b]\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cl\u0001"+
		"\u0000\u0000\u0000de\n\u0007\u0000\u0000ef\u0005#\u0000\u0000fk\u0003"+
		"\u0014\n\u0000gh\n\u0006\u0000\u0000hi\u0005\"\u0000\u0000ik\u0003\u0014"+
		"\n\u0000jd\u0001\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u0013"+
		"\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000op\u0006\n\uffff\uffff"+
		"\u0000pq\u0003\u0016\u000b\u0000qz\u0001\u0000\u0000\u0000rs\n\u0002\u0000"+
		"\u0000st\u0005$\u0000\u0000ty\u0003\u0016\u000b\u0000uv\n\u0001\u0000"+
		"\u0000vw\u0005%\u0000\u0000wy\u0003\u0016\u000b\u0000xr\u0001\u0000\u0000"+
		"\u0000xu\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0015\u0001\u0000\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000}\u008b\u0005!\u0000\u0000~\u008b\u0005 \u0000"+
		"\u0000\u007f\u008b\u0005\u001f\u0000\u0000\u0080\u008b\u0005\u0013\u0000"+
		"\u0000\u0081\u008b\u0005\u001e\u0000\u0000\u0082\u0083\u0005\u001c\u0000"+
		"\u0000\u0083\u008b\u0003\u0016\u000b\u0000\u0084\u0085\u0005\u001d\u0000"+
		"\u0000\u0085\u008b\u0003\u0016\u000b\u0000\u0086\u0087\u0005\u0002\u0000"+
		"\u0000\u0087\u0088\u0003\u0012\t\u0000\u0088\u0089\u0005\u0003\u0000\u0000"+
		"\u0089\u008b\u0001\u0000\u0000\u0000\u008a}\u0001\u0000\u0000\u0000\u008a"+
		"~\u0001\u0000\u0000\u0000\u008a\u007f\u0001\u0000\u0000\u0000\u008a\u0080"+
		"\u0001\u0000\u0000\u0000\u008a\u0081\u0001\u0000\u0000\u0000\u008a\u0082"+
		"\u0001\u0000\u0000\u0000\u008a\u0084\u0001\u0000\u0000\u0000\u008a\u0086"+
		"\u0001\u0000\u0000\u0000\u008b\u0017\u0001\u0000\u0000\u0000\u008c\u0091"+
		"\u0005\r\u0000\u0000\u008d\u0091\u0005\u000e\u0000\u0000\u008e\u0091\u0005"+
		"\u000f\u0000\u0000\u008f\u0091\u0005\u0010\u0000\u0000\u0090\u008c\u0001"+
		"\u0000\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0019\u0001"+
		"\u0000\u0000\u0000\f\u001c!%*Pbjlxz\u008a\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}