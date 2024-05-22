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
		T__0=1, T__1=2, T__2=3, READ=4, PRINT=5, TOINT=6, TOREAL=7, ID=8, REAL=9, 
		INT=10, SUB=11, ADD=12, MULT=13, DIV=14, NEWLINE=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "READ", "PRINT", "TOINT", "TOREAL", "ID", "REAL", 
			"INT", "SUB", "ADD", "MULT", "DIV", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'read'", "'print'", "'(int)'", "'(real)'", 
			null, null, null, "'-'", "'+'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "READ", "PRINT", "TOINT", "TOREAL", "ID", "REAL", 
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
		case 15:
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
		"\u0004\u0000\u0010n\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0004\u0007A\b\u0007\u000b\u0007\f\u0007"+
		"B\u0001\b\u0003\bF\b\b\u0001\b\u0004\bI\b\b\u000b\b\f\bJ\u0001\b\u0001"+
		"\b\u0004\bO\b\b\u000b\b\f\bP\u0001\t\u0003\tT\b\t\u0001\t\u0004\tW\b\t"+
		"\u000b\t\f\tX\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\u000e\u0003\u000ed\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0004\u000fi\b\u000f\u000b\u000f\f\u000fj\u0001\u000f\u0001"+
		"\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0002\u0002"+
		"\u0000AZaz\u0002\u0000\t\t  u\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001"+
		"\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001"+
		"\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001"+
		"\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000\u0000"+
		"\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000\u0000"+
		"\t,\u0001\u0000\u0000\u0000\u000b2\u0001\u0000\u0000\u0000\r8\u0001\u0000"+
		"\u0000\u0000\u000f@\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000\u0000"+
		"\u0013S\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017\\"+
		"\u0001\u0000\u0000\u0000\u0019^\u0001\u0000\u0000\u0000\u001b`\u0001\u0000"+
		"\u0000\u0000\u001dc\u0001\u0000\u0000\u0000\u001fh\u0001\u0000\u0000\u0000"+
		"!\"\u0005=\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005(\u0000"+
		"\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005)\u0000\u0000&\u0006\u0001"+
		"\u0000\u0000\u0000\'(\u0005r\u0000\u0000()\u0005e\u0000\u0000)*\u0005"+
		"a\u0000\u0000*+\u0005d\u0000\u0000+\b\u0001\u0000\u0000\u0000,-\u0005"+
		"p\u0000\u0000-.\u0005r\u0000\u0000./\u0005i\u0000\u0000/0\u0005n\u0000"+
		"\u000001\u0005t\u0000\u00001\n\u0001\u0000\u0000\u000023\u0005(\u0000"+
		"\u000034\u0005i\u0000\u000045\u0005n\u0000\u000056\u0005t\u0000\u0000"+
		"67\u0005)\u0000\u00007\f\u0001\u0000\u0000\u000089\u0005(\u0000\u0000"+
		"9:\u0005r\u0000\u0000:;\u0005e\u0000\u0000;<\u0005a\u0000\u0000<=\u0005"+
		"l\u0000\u0000=>\u0005)\u0000\u0000>\u000e\u0001\u0000\u0000\u0000?A\u0007"+
		"\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000"+
		"B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0010\u0001\u0000"+
		"\u0000\u0000DF\u0005-\u0000\u0000ED\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FH\u0001\u0000\u0000\u0000GI\u000209\u0000HG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0005.\u0000\u0000MO\u000209"+
		"\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PN\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0012\u0001\u0000\u0000\u0000"+
		"RT\u0005-\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000"+
		"TV\u0001\u0000\u0000\u0000UW\u000209\u0000VU\u0001\u0000\u0000\u0000W"+
		"X\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005-\u0000\u0000[\u0016\u0001"+
		"\u0000\u0000\u0000\\]\u0005+\u0000\u0000]\u0018\u0001\u0000\u0000\u0000"+
		"^_\u0005*\u0000\u0000_\u001a\u0001\u0000\u0000\u0000`a\u0005/\u0000\u0000"+
		"a\u001c\u0001\u0000\u0000\u0000bd\u0005\r\u0000\u0000cb\u0001\u0000\u0000"+
		"\u0000cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0005\n\u0000"+
		"\u0000f\u001e\u0001\u0000\u0000\u0000gi\u0007\u0001\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lm\u0006\u000f\u0000"+
		"\u0000m \u0001\u0000\u0000\u0000\t\u0000BEJPSXcj\u0001\u0001\u000f\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}