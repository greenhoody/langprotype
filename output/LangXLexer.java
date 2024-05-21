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
		T__0=1, T__1=2, T__2=3, PRINT=4, TOINT=5, TOREAL=6, ID=7, REAL=8, INT=9, 
		SUB=10, ADD=11, MULT=12, DIV=13, NEWLINE=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "PRINT", "TOINT", "TOREAL", "ID", "REAL", "INT", 
			"SUB", "ADD", "MULT", "DIV", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'print'", "'(int)'", "'(real)'", null, null, 
			null, "'-'", "'+'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PRINT", "TOINT", "TOREAL", "ID", "REAL", "INT", 
			"SUB", "ADD", "MULT", "DIV", "NEWLINE", "WS"
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
		case 14:
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
		"\u0004\u0000\u000fg\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0004\u0006:\b\u0006\u000b\u0006\f\u0006;\u0001\u0007"+
		"\u0003\u0007?\b\u0007\u0001\u0007\u0004\u0007B\b\u0007\u000b\u0007\f\u0007"+
		"C\u0001\u0007\u0001\u0007\u0004\u0007H\b\u0007\u000b\u0007\f\u0007I\u0001"+
		"\b\u0003\bM\b\b\u0001\b\u0004\bP\b\b\u000b\b\f\bQ\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0003\r]\b"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0004\u000eb\b\u000e\u000b\u000e\f\u000e"+
		"c\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000\u0002"+
		"\u0002\u0000AZaz\u0002\u0000\t\t  n\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001\u001f"+
		"\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000\u0000\u0005#\u0001\u0000"+
		"\u0000\u0000\u0007%\u0001\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000"+
		"\u000b1\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f>\u0001"+
		"\u0000\u0000\u0000\u0011L\u0001\u0000\u0000\u0000\u0013S\u0001\u0000\u0000"+
		"\u0000\u0015U\u0001\u0000\u0000\u0000\u0017W\u0001\u0000\u0000\u0000\u0019"+
		"Y\u0001\u0000\u0000\u0000\u001b\\\u0001\u0000\u0000\u0000\u001da\u0001"+
		"\u0000\u0000\u0000\u001f \u0005=\u0000\u0000 \u0002\u0001\u0000\u0000"+
		"\u0000!\"\u0005(\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0005)"+
		"\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005p\u0000\u0000&\'\u0005"+
		"r\u0000\u0000\'(\u0005i\u0000\u0000()\u0005n\u0000\u0000)*\u0005t\u0000"+
		"\u0000*\b\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,-\u0005i\u0000"+
		"\u0000-.\u0005n\u0000\u0000./\u0005t\u0000\u0000/0\u0005)\u0000\u0000"+
		"0\n\u0001\u0000\u0000\u000012\u0005(\u0000\u000023\u0005r\u0000\u0000"+
		"34\u0005e\u0000\u000045\u0005a\u0000\u000056\u0005l\u0000\u000067\u0005"+
		")\u0000\u00007\f\u0001\u0000\u0000\u00008:\u0007\u0000\u0000\u000098\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<\u000e\u0001\u0000\u0000\u0000=?\u0005-\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000"+
		"\u0000\u0000@B\u000209\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EG\u0005.\u0000\u0000FH\u000209\u0000GF\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000J\u0010\u0001\u0000\u0000\u0000KM\u0005-\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0001\u0000\u0000\u0000"+
		"NP\u000209\u0000ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q"+
		"O\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0012\u0001\u0000"+
		"\u0000\u0000ST\u0005-\u0000\u0000T\u0014\u0001\u0000\u0000\u0000UV\u0005"+
		"+\u0000\u0000V\u0016\u0001\u0000\u0000\u0000WX\u0005*\u0000\u0000X\u0018"+
		"\u0001\u0000\u0000\u0000YZ\u0005/\u0000\u0000Z\u001a\u0001\u0000\u0000"+
		"\u0000[]\u0005\r\u0000\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0005\n\u0000\u0000_\u001c\u0001"+
		"\u0000\u0000\u0000`b\u0007\u0001\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000ef\u0006\u000e\u0000\u0000f\u001e\u0001"+
		"\u0000\u0000\u0000\t\u0000;>CILQ\\c\u0001\u0001\u000e\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}