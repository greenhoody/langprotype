// Generated from PleaseWork.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PleaseWorkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IF=4, THEN=5, ENDIF=6, EQUALS=7, NOTEQUALS=8, 
		GREATERTHAN=9, LESSTHAN=10, GREATER=11, LESS=12, BOOL=13, AND=14, OR=15, 
		XOR=16, NEG=17, READ=18, PRINT=19, LOOP=20, ENDLOOP=21, TOINT=22, TOREAL=23, 
		ID=24, REAL=25, INT=26, SUB=27, ADD=28, MULT=29, DIV=30, NEWLINE=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "IF", "THEN", "ENDIF", "EQUALS", "NOTEQUALS", 
			"GREATERTHAN", "LESSTHAN", "GREATER", "LESS", "BOOL", "AND", "OR", "XOR", 
			"NEG", "READ", "PRINT", "LOOP", "ENDLOOP", "TOINT", "TOREAL", "ID", "REAL", 
			"INT", "SUB", "ADD", "MULT", "DIV", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' = '", "'('", "')'", "'if'", "'then'", "'endif'", "' == '", "' != '", 
			"' >= '", "' <= '", "' > '", "' < '", null, "' && '", "' || '", "' ^ '", 
			"'!'", "'read '", "'print '", "'loop '", "'endloop'", "'(int)'", "'(real)'", 
			null, null, null, "' - '", "' + '", "' * '", "' / '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IF", "THEN", "ENDIF", "EQUALS", "NOTEQUALS", 
			"GREATERTHAN", "LESSTHAN", "GREATER", "LESS", "BOOL", "AND", "OR", "XOR", 
			"NEG", "READ", "PRINT", "LOOP", "ENDLOOP", "TOINT", "TOREAL", "ID", "REAL", 
			"INT", "SUB", "ADD", "MULT", "DIV", "NEWLINE", "WS"
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


	public PleaseWorkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PleaseWork.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 31:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000 \u00ed\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f}\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u00b8\b\u0017\u000b"+
		"\u0017\f\u0017\u00b9\u0001\u0018\u0003\u0018\u00bd\b\u0018\u0001\u0018"+
		"\u0004\u0018\u00c0\b\u0018\u000b\u0018\f\u0018\u00c1\u0001\u0018\u0001"+
		"\u0018\u0004\u0018\u00c6\b\u0018\u000b\u0018\f\u0018\u00c7\u0001\u0019"+
		"\u0003\u0019\u00cb\b\u0019\u0001\u0019\u0004\u0019\u00ce\b\u0019\u000b"+
		"\u0019\f\u0019\u00cf\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0003\u001e\u00e3\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0004"+
		"\u001f\u00e8\b\u001f\u000b\u001f\f\u001f\u00e9\u0001\u001f\u0001\u001f"+
		"\u0000\u0000 \u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f"+
		"? \u0001\u0000\u0002\u0002\u0000AZaz\u0002\u0000\t\t  \u00f5\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000"+
		"\u0000\u0000?\u0001\u0000\u0000\u0000\u0001A\u0001\u0000\u0000\u0000\u0003"+
		"E\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000\u0000\u0007I\u0001"+
		"\u0000\u0000\u0000\tL\u0001\u0000\u0000\u0000\u000bQ\u0001\u0000\u0000"+
		"\u0000\rW\u0001\u0000\u0000\u0000\u000f\\\u0001\u0000\u0000\u0000\u0011"+
		"a\u0001\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000\u0015k\u0001"+
		"\u0000\u0000\u0000\u0017o\u0001\u0000\u0000\u0000\u0019|\u0001\u0000\u0000"+
		"\u0000\u001b~\u0001\u0000\u0000\u0000\u001d\u0083\u0001\u0000\u0000\u0000"+
		"\u001f\u0088\u0001\u0000\u0000\u0000!\u008c\u0001\u0000\u0000\u0000#\u008e"+
		"\u0001\u0000\u0000\u0000%\u0094\u0001\u0000\u0000\u0000\'\u009b\u0001"+
		"\u0000\u0000\u0000)\u00a1\u0001\u0000\u0000\u0000+\u00a9\u0001\u0000\u0000"+
		"\u0000-\u00af\u0001\u0000\u0000\u0000/\u00b7\u0001\u0000\u0000\u00001"+
		"\u00bc\u0001\u0000\u0000\u00003\u00ca\u0001\u0000\u0000\u00005\u00d1\u0001"+
		"\u0000\u0000\u00007\u00d5\u0001\u0000\u0000\u00009\u00d9\u0001\u0000\u0000"+
		"\u0000;\u00dd\u0001\u0000\u0000\u0000=\u00e2\u0001\u0000\u0000\u0000?"+
		"\u00e7\u0001\u0000\u0000\u0000AB\u0005 \u0000\u0000BC\u0005=\u0000\u0000"+
		"CD\u0005 \u0000\u0000D\u0002\u0001\u0000\u0000\u0000EF\u0005(\u0000\u0000"+
		"F\u0004\u0001\u0000\u0000\u0000GH\u0005)\u0000\u0000H\u0006\u0001\u0000"+
		"\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005f\u0000\u0000K\b\u0001\u0000"+
		"\u0000\u0000LM\u0005t\u0000\u0000MN\u0005h\u0000\u0000NO\u0005e\u0000"+
		"\u0000OP\u0005n\u0000\u0000P\n\u0001\u0000\u0000\u0000QR\u0005e\u0000"+
		"\u0000RS\u0005n\u0000\u0000ST\u0005d\u0000\u0000TU\u0005i\u0000\u0000"+
		"UV\u0005f\u0000\u0000V\f\u0001\u0000\u0000\u0000WX\u0005 \u0000\u0000"+
		"XY\u0005=\u0000\u0000YZ\u0005=\u0000\u0000Z[\u0005 \u0000\u0000[\u000e"+
		"\u0001\u0000\u0000\u0000\\]\u0005 \u0000\u0000]^\u0005!\u0000\u0000^_"+
		"\u0005=\u0000\u0000_`\u0005 \u0000\u0000`\u0010\u0001\u0000\u0000\u0000"+
		"ab\u0005 \u0000\u0000bc\u0005>\u0000\u0000cd\u0005=\u0000\u0000de\u0005"+
		" \u0000\u0000e\u0012\u0001\u0000\u0000\u0000fg\u0005 \u0000\u0000gh\u0005"+
		"<\u0000\u0000hi\u0005=\u0000\u0000ij\u0005 \u0000\u0000j\u0014\u0001\u0000"+
		"\u0000\u0000kl\u0005 \u0000\u0000lm\u0005>\u0000\u0000mn\u0005 \u0000"+
		"\u0000n\u0016\u0001\u0000\u0000\u0000op\u0005 \u0000\u0000pq\u0005<\u0000"+
		"\u0000qr\u0005 \u0000\u0000r\u0018\u0001\u0000\u0000\u0000st\u0005t\u0000"+
		"\u0000tu\u0005r\u0000\u0000uv\u0005u\u0000\u0000v}\u0005e\u0000\u0000"+
		"wx\u0005f\u0000\u0000xy\u0005a\u0000\u0000yz\u0005l\u0000\u0000z{\u0005"+
		"s\u0000\u0000{}\u0005e\u0000\u0000|s\u0001\u0000\u0000\u0000|w\u0001\u0000"+
		"\u0000\u0000}\u001a\u0001\u0000\u0000\u0000~\u007f\u0005 \u0000\u0000"+
		"\u007f\u0080\u0005&\u0000\u0000\u0080\u0081\u0005&\u0000\u0000\u0081\u0082"+
		"\u0005 \u0000\u0000\u0082\u001c\u0001\u0000\u0000\u0000\u0083\u0084\u0005"+
		" \u0000\u0000\u0084\u0085\u0005|\u0000\u0000\u0085\u0086\u0005|\u0000"+
		"\u0000\u0086\u0087\u0005 \u0000\u0000\u0087\u001e\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0005 \u0000\u0000\u0089\u008a\u0005^\u0000\u0000\u008a\u008b"+
		"\u0005 \u0000\u0000\u008b \u0001\u0000\u0000\u0000\u008c\u008d\u0005!"+
		"\u0000\u0000\u008d\"\u0001\u0000\u0000\u0000\u008e\u008f\u0005r\u0000"+
		"\u0000\u008f\u0090\u0005e\u0000\u0000\u0090\u0091\u0005a\u0000\u0000\u0091"+
		"\u0092\u0005d\u0000\u0000\u0092\u0093\u0005 \u0000\u0000\u0093$\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005p\u0000\u0000\u0095\u0096\u0005r\u0000"+
		"\u0000\u0096\u0097\u0005i\u0000\u0000\u0097\u0098\u0005n\u0000\u0000\u0098"+
		"\u0099\u0005t\u0000\u0000\u0099\u009a\u0005 \u0000\u0000\u009a&\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005l\u0000\u0000\u009c\u009d\u0005o\u0000"+
		"\u0000\u009d\u009e\u0005o\u0000\u0000\u009e\u009f\u0005p\u0000\u0000\u009f"+
		"\u00a0\u0005 \u0000\u0000\u00a0(\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		"e\u0000\u0000\u00a2\u00a3\u0005n\u0000\u0000\u00a3\u00a4\u0005d\u0000"+
		"\u0000\u00a4\u00a5\u0005l\u0000\u0000\u00a5\u00a6\u0005o\u0000\u0000\u00a6"+
		"\u00a7\u0005o\u0000\u0000\u00a7\u00a8\u0005p\u0000\u0000\u00a8*\u0001"+
		"\u0000\u0000\u0000\u00a9\u00aa\u0005(\u0000\u0000\u00aa\u00ab\u0005i\u0000"+
		"\u0000\u00ab\u00ac\u0005n\u0000\u0000\u00ac\u00ad\u0005t\u0000\u0000\u00ad"+
		"\u00ae\u0005)\u0000\u0000\u00ae,\u0001\u0000\u0000\u0000\u00af\u00b0\u0005"+
		"(\u0000\u0000\u00b0\u00b1\u0005r\u0000\u0000\u00b1\u00b2\u0005e\u0000"+
		"\u0000\u00b2\u00b3\u0005a\u0000\u0000\u00b3\u00b4\u0005l\u0000\u0000\u00b4"+
		"\u00b5\u0005)\u0000\u0000\u00b5.\u0001\u0000\u0000\u0000\u00b6\u00b8\u0007"+
		"\u0000\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba0\u0001\u0000\u0000\u0000\u00bb\u00bd\u0005-\u0000"+
		"\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00c0\u000209\u0000\u00bf"+
		"\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005.\u0000\u0000\u00c4\u00c6"+
		"\u000209\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c82\u0001\u0000\u0000\u0000\u00c9\u00cb\u0005-\u0000\u0000"+
		"\u00ca\u00c9\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ce\u000209\u0000\u00cd\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d04\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0005 \u0000\u0000\u00d2\u00d3\u0005-\u0000"+
		"\u0000\u00d3\u00d4\u0005 \u0000\u0000\u00d46\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005 \u0000\u0000\u00d6\u00d7\u0005+\u0000\u0000\u00d7\u00d8\u0005"+
		" \u0000\u0000\u00d88\u0001\u0000\u0000\u0000\u00d9\u00da\u0005 \u0000"+
		"\u0000\u00da\u00db\u0005*\u0000\u0000\u00db\u00dc\u0005 \u0000\u0000\u00dc"+
		":\u0001\u0000\u0000\u0000\u00dd\u00de\u0005 \u0000\u0000\u00de\u00df\u0005"+
		"/\u0000\u0000\u00df\u00e0\u0005 \u0000\u0000\u00e0<\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e3\u0005\r\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e5\u0005\n\u0000\u0000\u00e5>\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e8\u0007\u0001\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0006\u001f\u0000\u0000\u00ec@\u0001\u0000\u0000\u0000\n\u0000"+
		"|\u00b9\u00bc\u00c1\u00c7\u00ca\u00cf\u00e2\u00e9\u0001\u0001\u001f\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}