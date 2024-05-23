// Generated from LangX.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, EQUALS=4, NOTEQUALS=5, GREATERTHAN=6, LESSTHAN=7, 
		GREATER=8, LESS=9, BOOL=10, AND=11, OR=12, XOR=13, NEG=14, READ=15, PRINT=16, 
		TOINT=17, TOREAL=18, ID=19, REAL=20, INT=21, SUB=22, ADD=23, MULT=24, 
		DIV=25, NEWLINE=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "EQUALS", "NOTEQUALS", "GREATERTHAN", "LESSTHAN", 
			"GREATER", "LESS", "BOOL", "AND", "OR", "XOR", "NEG", "READ", "PRINT", 
			"TOINT", "TOREAL", "ID", "REAL", "INT", "SUB", "ADD", "MULT", "DIV", 
			"NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", 
			null, "'&&'", "'||'", "'^'", "'!'", "'read'", "'print'", "'(int)'", "'(real)'", 
			null, null, null, "'-'", "'+'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "EQUALS", "NOTEQUALS", "GREATERTHAN", "LESSTHAN", 
			"GREATER", "LESS", "BOOL", "AND", "OR", "XOR", "NEG", "READ", "PRINT", 
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


	public LangXLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LangX.g4"; }

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
		case 26:
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
		"\u0004\u0000\u001b\u00a9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tW\b\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0004\u0012|\b\u0012\u000b\u0012\f\u0012}\u0001\u0013"+
		"\u0003\u0013\u0081\b\u0013\u0001\u0013\u0004\u0013\u0084\b\u0013\u000b"+
		"\u0013\f\u0013\u0085\u0001\u0013\u0001\u0013\u0004\u0013\u008a\b\u0013"+
		"\u000b\u0013\f\u0013\u008b\u0001\u0014\u0003\u0014\u008f\b\u0014\u0001"+
		"\u0014\u0004\u0014\u0092\b\u0014\u000b\u0014\f\u0014\u0093\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0003\u0019\u009f\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0004\u001a\u00a4\b\u001a\u000b\u001a\f\u001a\u00a5\u0001"+
		"\u001a\u0001\u001a\u0000\u0000\u001b\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
		"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b\u0001"+
		"\u0000\u0002\u0002\u0000AZaz\u0002\u0000\t\t  \u00b1\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00017\u0001\u0000\u0000\u0000\u00039\u0001\u0000"+
		"\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007=\u0001\u0000\u0000\u0000"+
		"\t@\u0001\u0000\u0000\u0000\u000bC\u0001\u0000\u0000\u0000\rF\u0001\u0000"+
		"\u0000\u0000\u000fI\u0001\u0000\u0000\u0000\u0011K\u0001\u0000\u0000\u0000"+
		"\u0013V\u0001\u0000\u0000\u0000\u0015X\u0001\u0000\u0000\u0000\u0017["+
		"\u0001\u0000\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001b`\u0001\u0000"+
		"\u0000\u0000\u001db\u0001\u0000\u0000\u0000\u001fg\u0001\u0000\u0000\u0000"+
		"!m\u0001\u0000\u0000\u0000#s\u0001\u0000\u0000\u0000%{\u0001\u0000\u0000"+
		"\u0000\'\u0080\u0001\u0000\u0000\u0000)\u008e\u0001\u0000\u0000\u0000"+
		"+\u0095\u0001\u0000\u0000\u0000-\u0097\u0001\u0000\u0000\u0000/\u0099"+
		"\u0001\u0000\u0000\u00001\u009b\u0001\u0000\u0000\u00003\u009e\u0001\u0000"+
		"\u0000\u00005\u00a3\u0001\u0000\u0000\u000078\u0005=\u0000\u00008\u0002"+
		"\u0001\u0000\u0000\u00009:\u0005(\u0000\u0000:\u0004\u0001\u0000\u0000"+
		"\u0000;<\u0005)\u0000\u0000<\u0006\u0001\u0000\u0000\u0000=>\u0005=\u0000"+
		"\u0000>?\u0005=\u0000\u0000?\b\u0001\u0000\u0000\u0000@A\u0005!\u0000"+
		"\u0000AB\u0005=\u0000\u0000B\n\u0001\u0000\u0000\u0000CD\u0005>\u0000"+
		"\u0000DE\u0005=\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005<\u0000"+
		"\u0000GH\u0005=\u0000\u0000H\u000e\u0001\u0000\u0000\u0000IJ\u0005>\u0000"+
		"\u0000J\u0010\u0001\u0000\u0000\u0000KL\u0005<\u0000\u0000L\u0012\u0001"+
		"\u0000\u0000\u0000MN\u0005t\u0000\u0000NO\u0005r\u0000\u0000OP\u0005u"+
		"\u0000\u0000PW\u0005e\u0000\u0000QR\u0005f\u0000\u0000RS\u0005a\u0000"+
		"\u0000ST\u0005l\u0000\u0000TU\u0005s\u0000\u0000UW\u0005e\u0000\u0000"+
		"VM\u0001\u0000\u0000\u0000VQ\u0001\u0000\u0000\u0000W\u0014\u0001\u0000"+
		"\u0000\u0000XY\u0005&\u0000\u0000YZ\u0005&\u0000\u0000Z\u0016\u0001\u0000"+
		"\u0000\u0000[\\\u0005|\u0000\u0000\\]\u0005|\u0000\u0000]\u0018\u0001"+
		"\u0000\u0000\u0000^_\u0005^\u0000\u0000_\u001a\u0001\u0000\u0000\u0000"+
		"`a\u0005!\u0000\u0000a\u001c\u0001\u0000\u0000\u0000bc\u0005r\u0000\u0000"+
		"cd\u0005e\u0000\u0000de\u0005a\u0000\u0000ef\u0005d\u0000\u0000f\u001e"+
		"\u0001\u0000\u0000\u0000gh\u0005p\u0000\u0000hi\u0005r\u0000\u0000ij\u0005"+
		"i\u0000\u0000jk\u0005n\u0000\u0000kl\u0005t\u0000\u0000l \u0001\u0000"+
		"\u0000\u0000mn\u0005(\u0000\u0000no\u0005i\u0000\u0000op\u0005n\u0000"+
		"\u0000pq\u0005t\u0000\u0000qr\u0005)\u0000\u0000r\"\u0001\u0000\u0000"+
		"\u0000st\u0005(\u0000\u0000tu\u0005r\u0000\u0000uv\u0005e\u0000\u0000"+
		"vw\u0005a\u0000\u0000wx\u0005l\u0000\u0000xy\u0005)\u0000\u0000y$\u0001"+
		"\u0000\u0000\u0000z|\u0007\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~&\u0001\u0000\u0000\u0000\u007f\u0081\u0005-\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0001\u0000\u0000\u0000\u0082\u0084\u000209\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0005.\u0000\u0000\u0088\u008a\u000209"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c(\u0001\u0000\u0000\u0000\u008d\u008f\u0005-\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0091\u0001\u0000\u0000\u0000\u0090\u0092\u000209\u0000\u0091\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094*\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005-\u0000\u0000\u0096,\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005+\u0000\u0000\u0098.\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0005*\u0000\u0000\u009a0\u0001\u0000\u0000\u0000\u009b\u009c\u0005/"+
		"\u0000\u0000\u009c2\u0001\u0000\u0000\u0000\u009d\u009f\u0005\r\u0000"+
		"\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\n\u0000\u0000"+
		"\u00a14\u0001\u0000\u0000\u0000\u00a2\u00a4\u0007\u0001\u0000\u0000\u00a3"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0006\u001a\u0000\u0000\u00a8"+
		"6\u0001\u0000\u0000\u0000\n\u0000V}\u0080\u0085\u008b\u008e\u0093\u009e"+
		"\u00a5\u0001\u0001\u001a\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}