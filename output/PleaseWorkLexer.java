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
		XOR=16, NEG=17, READ=18, PRINT=19, TOINT=20, TOREAL=21, ID=22, REAL=23, 
		INT=24, SUB=25, ADD=26, MULT=27, DIV=28, NEWLINE=29, WS=30;
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
			"NEG", "READ", "PRINT", "TOINT", "TOREAL", "ID", "REAL", "INT", "SUB", 
			"ADD", "MULT", "DIV", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' = '", "'('", "')'", "'if'", "'then'", "'endif'", "' == '", "' != '", 
			"' >= '", "' <= '", "' > '", "' < '", null, "' && '", "' || '", "' ^ '", 
			"'!'", "'read '", "'print '", "'(int)'", "'(real)'", null, null, null, 
			"' - '", "' + '", "' * '", "' / '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IF", "THEN", "ENDIF", "EQUALS", "NOTEQUALS", 
			"GREATERTHAN", "LESSTHAN", "GREATER", "LESS", "BOOL", "AND", "OR", "XOR", 
			"NEG", "READ", "PRINT", "TOINT", "TOREAL", "ID", "REAL", "INT", "SUB", 
			"ADD", "MULT", "DIV", "NEWLINE", "WS"
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
		case 29:
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
		"\u0004\u0000\u001e\u00db\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fy\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u00a6\b\u0015"+
		"\u000b\u0015\f\u0015\u00a7\u0001\u0016\u0003\u0016\u00ab\b\u0016\u0001"+
		"\u0016\u0004\u0016\u00ae\b\u0016\u000b\u0016\f\u0016\u00af\u0001\u0016"+
		"\u0001\u0016\u0004\u0016\u00b4\b\u0016\u000b\u0016\f\u0016\u00b5\u0001"+
		"\u0017\u0003\u0017\u00b9\b\u0017\u0001\u0017\u0004\u0017\u00bc\b\u0017"+
		"\u000b\u0017\f\u0017\u00bd\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0003\u001c\u00d1\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0004\u001d\u00d6\b\u001d\u000b\u001d\f\u001d\u00d7\u0001\u001d\u0001"+
		"\u001d\u0000\u0000\u001e\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d"+
		";\u001e\u0001\u0000\u0002\u0002\u0000AZaz\u0002\u0000\t\t  \u00e3\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0001="+
		"\u0001\u0000\u0000\u0000\u0003A\u0001\u0000\u0000\u0000\u0005C\u0001\u0000"+
		"\u0000\u0000\u0007E\u0001\u0000\u0000\u0000\tH\u0001\u0000\u0000\u0000"+
		"\u000bM\u0001\u0000\u0000\u0000\rS\u0001\u0000\u0000\u0000\u000fX\u0001"+
		"\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000\u0013b\u0001\u0000\u0000"+
		"\u0000\u0015g\u0001\u0000\u0000\u0000\u0017k\u0001\u0000\u0000\u0000\u0019"+
		"x\u0001\u0000\u0000\u0000\u001bz\u0001\u0000\u0000\u0000\u001d\u007f\u0001"+
		"\u0000\u0000\u0000\u001f\u0084\u0001\u0000\u0000\u0000!\u0088\u0001\u0000"+
		"\u0000\u0000#\u008a\u0001\u0000\u0000\u0000%\u0090\u0001\u0000\u0000\u0000"+
		"\'\u0097\u0001\u0000\u0000\u0000)\u009d\u0001\u0000\u0000\u0000+\u00a5"+
		"\u0001\u0000\u0000\u0000-\u00aa\u0001\u0000\u0000\u0000/\u00b8\u0001\u0000"+
		"\u0000\u00001\u00bf\u0001\u0000\u0000\u00003\u00c3\u0001\u0000\u0000\u0000"+
		"5\u00c7\u0001\u0000\u0000\u00007\u00cb\u0001\u0000\u0000\u00009\u00d0"+
		"\u0001\u0000\u0000\u0000;\u00d5\u0001\u0000\u0000\u0000=>\u0005 \u0000"+
		"\u0000>?\u0005=\u0000\u0000?@\u0005 \u0000\u0000@\u0002\u0001\u0000\u0000"+
		"\u0000AB\u0005(\u0000\u0000B\u0004\u0001\u0000\u0000\u0000CD\u0005)\u0000"+
		"\u0000D\u0006\u0001\u0000\u0000\u0000EF\u0005i\u0000\u0000FG\u0005f\u0000"+
		"\u0000G\b\u0001\u0000\u0000\u0000HI\u0005t\u0000\u0000IJ\u0005h\u0000"+
		"\u0000JK\u0005e\u0000\u0000KL\u0005n\u0000\u0000L\n\u0001\u0000\u0000"+
		"\u0000MN\u0005e\u0000\u0000NO\u0005n\u0000\u0000OP\u0005d\u0000\u0000"+
		"PQ\u0005i\u0000\u0000QR\u0005f\u0000\u0000R\f\u0001\u0000\u0000\u0000"+
		"ST\u0005 \u0000\u0000TU\u0005=\u0000\u0000UV\u0005=\u0000\u0000VW\u0005"+
		" \u0000\u0000W\u000e\u0001\u0000\u0000\u0000XY\u0005 \u0000\u0000YZ\u0005"+
		"!\u0000\u0000Z[\u0005=\u0000\u0000[\\\u0005 \u0000\u0000\\\u0010\u0001"+
		"\u0000\u0000\u0000]^\u0005 \u0000\u0000^_\u0005>\u0000\u0000_`\u0005="+
		"\u0000\u0000`a\u0005 \u0000\u0000a\u0012\u0001\u0000\u0000\u0000bc\u0005"+
		" \u0000\u0000cd\u0005<\u0000\u0000de\u0005=\u0000\u0000ef\u0005 \u0000"+
		"\u0000f\u0014\u0001\u0000\u0000\u0000gh\u0005 \u0000\u0000hi\u0005>\u0000"+
		"\u0000ij\u0005 \u0000\u0000j\u0016\u0001\u0000\u0000\u0000kl\u0005 \u0000"+
		"\u0000lm\u0005<\u0000\u0000mn\u0005 \u0000\u0000n\u0018\u0001\u0000\u0000"+
		"\u0000op\u0005t\u0000\u0000pq\u0005r\u0000\u0000qr\u0005u\u0000\u0000"+
		"ry\u0005e\u0000\u0000st\u0005f\u0000\u0000tu\u0005a\u0000\u0000uv\u0005"+
		"l\u0000\u0000vw\u0005s\u0000\u0000wy\u0005e\u0000\u0000xo\u0001\u0000"+
		"\u0000\u0000xs\u0001\u0000\u0000\u0000y\u001a\u0001\u0000\u0000\u0000"+
		"z{\u0005 \u0000\u0000{|\u0005&\u0000\u0000|}\u0005&\u0000\u0000}~\u0005"+
		" \u0000\u0000~\u001c\u0001\u0000\u0000\u0000\u007f\u0080\u0005 \u0000"+
		"\u0000\u0080\u0081\u0005|\u0000\u0000\u0081\u0082\u0005|\u0000\u0000\u0082"+
		"\u0083\u0005 \u0000\u0000\u0083\u001e\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0005 \u0000\u0000\u0085\u0086\u0005^\u0000\u0000\u0086\u0087\u0005 "+
		"\u0000\u0000\u0087 \u0001\u0000\u0000\u0000\u0088\u0089\u0005!\u0000\u0000"+
		"\u0089\"\u0001\u0000\u0000\u0000\u008a\u008b\u0005r\u0000\u0000\u008b"+
		"\u008c\u0005e\u0000\u0000\u008c\u008d\u0005a\u0000\u0000\u008d\u008e\u0005"+
		"d\u0000\u0000\u008e\u008f\u0005 \u0000\u0000\u008f$\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0005p\u0000\u0000\u0091\u0092\u0005r\u0000\u0000\u0092"+
		"\u0093\u0005i\u0000\u0000\u0093\u0094\u0005n\u0000\u0000\u0094\u0095\u0005"+
		"t\u0000\u0000\u0095\u0096\u0005 \u0000\u0000\u0096&\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005(\u0000\u0000\u0098\u0099\u0005i\u0000\u0000\u0099"+
		"\u009a\u0005n\u0000\u0000\u009a\u009b\u0005t\u0000\u0000\u009b\u009c\u0005"+
		")\u0000\u0000\u009c(\u0001\u0000\u0000\u0000\u009d\u009e\u0005(\u0000"+
		"\u0000\u009e\u009f\u0005r\u0000\u0000\u009f\u00a0\u0005e\u0000\u0000\u00a0"+
		"\u00a1\u0005a\u0000\u0000\u00a1\u00a2\u0005l\u0000\u0000\u00a2\u00a3\u0005"+
		")\u0000\u0000\u00a3*\u0001\u0000\u0000\u0000\u00a4\u00a6\u0007\u0000\u0000"+
		"\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8,\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005-\u0000\u0000\u00aa"+
		"\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ac\u00ae\u000209\u0000\u00ad\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b3\u0005.\u0000\u0000\u00b2\u00b4\u000209"+
		"\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6.\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005-\u0000\u0000\u00b8"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9"+
		"\u00bb\u0001\u0000\u0000\u0000\u00ba\u00bc\u000209\u0000\u00bb\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be0\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005 \u0000\u0000\u00c0\u00c1\u0005-\u0000\u0000"+
		"\u00c1\u00c2\u0005 \u0000\u0000\u00c22\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0005 \u0000\u0000\u00c4\u00c5\u0005+\u0000\u0000\u00c5\u00c6\u0005 "+
		"\u0000\u0000\u00c64\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005 \u0000\u0000"+
		"\u00c8\u00c9\u0005*\u0000\u0000\u00c9\u00ca\u0005 \u0000\u0000\u00ca6"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005 \u0000\u0000\u00cc\u00cd\u0005"+
		"/\u0000\u0000\u00cd\u00ce\u0005 \u0000\u0000\u00ce8\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u0005\r\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d3\u0005\n\u0000\u0000\u00d3:\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d6\u0007\u0001\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0006\u001d\u0000\u0000\u00da<\u0001\u0000\u0000\u0000\n\u0000"+
		"x\u00a7\u00aa\u00af\u00b5\u00b8\u00bd\u00d0\u00d7\u0001\u0001\u001d\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}