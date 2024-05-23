// Generated from /home/greenhoody/Desktop/JFIK/langprotype/LangX.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangXLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, EQUALS=4, NOTEQUALS=5, GREATERTHAN=6, LESSTHAN=7, 
		GREATER=8, LESS=9, BOOLOP=10, BOOL=11, AND=12, OR=13, XOR=14, NEG=15, 
		READ=16, PRINT=17, TOINT=18, TOREAL=19, ID=20, REAL=21, INT=22, SUB=23, 
		ADD=24, MULT=25, DIV=26, NEWLINE=27, WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "EQUALS", "NOTEQUALS", "GREATERTHAN", "LESSTHAN", 
			"GREATER", "LESS", "BOOLOP", "BOOL", "AND", "OR", "XOR", "NEG", "READ", 
			"PRINT", "TOINT", "TOREAL", "ID", "REAL", "INT", "SUB", "ADD", "MULT", 
			"DIV", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", 
			null, null, "'&&'", "'||'", "'^'", "'!'", "'read'", "'print'", "'(int)'", 
			"'(real)'", null, null, null, "'-'", "'+'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "EQUALS", "NOTEQUALS", "GREATERTHAN", "LESSTHAN", 
			"GREATER", "LESS", "BOOLOP", "BOOL", "AND", "OR", "XOR", "NEG", "READ", 
			"PRINT", "TOINT", "TOREAL", "ID", "REAL", "INT", "SUB", "ADD", "MULT", 
			"DIV", "NEWLINE", "WS"
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
		case 27:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00b3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\5\13V\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fa\n"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\6\25\u0086\n\25\r\25\16\25\u0087\3"+
		"\26\5\26\u008b\n\26\3\26\6\26\u008e\n\26\r\26\16\26\u008f\3\26\3\26\6"+
		"\26\u0094\n\26\r\26\16\26\u0095\3\27\5\27\u0099\n\27\3\27\6\27\u009c\n"+
		"\27\r\27\16\27\u009d\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\5\34"+
		"\u00a9\n\34\3\34\3\34\3\35\6\35\u00ae\n\35\r\35\16\35\u00af\3\35\3\35"+
		"\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36\3\2\4\4\2C\\c|\4\2\13\13\"\"\2\u00be\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2"+
		"\tA\3\2\2\2\13D\3\2\2\2\rG\3\2\2\2\17J\3\2\2\2\21M\3\2\2\2\23O\3\2\2\2"+
		"\25U\3\2\2\2\27`\3\2\2\2\31b\3\2\2\2\33e\3\2\2\2\35h\3\2\2\2\37j\3\2\2"+
		"\2!l\3\2\2\2#q\3\2\2\2%w\3\2\2\2\'}\3\2\2\2)\u0085\3\2\2\2+\u008a\3\2"+
		"\2\2-\u0098\3\2\2\2/\u009f\3\2\2\2\61\u00a1\3\2\2\2\63\u00a3\3\2\2\2\65"+
		"\u00a5\3\2\2\2\67\u00a8\3\2\2\29\u00ad\3\2\2\2;<\7?\2\2<\4\3\2\2\2=>\7"+
		"*\2\2>\6\3\2\2\2?@\7+\2\2@\b\3\2\2\2AB\7?\2\2BC\7?\2\2C\n\3\2\2\2DE\7"+
		"#\2\2EF\7?\2\2F\f\3\2\2\2GH\7@\2\2HI\7?\2\2I\16\3\2\2\2JK\7>\2\2KL\7?"+
		"\2\2L\20\3\2\2\2MN\7@\2\2N\22\3\2\2\2OP\7>\2\2P\24\3\2\2\2QV\5\31\r\2"+
		"RV\5\33\16\2SV\5\35\17\2TV\5\37\20\2UQ\3\2\2\2UR\3\2\2\2US\3\2\2\2UT\3"+
		"\2\2\2V\26\3\2\2\2WX\7v\2\2XY\7t\2\2YZ\7w\2\2Za\7g\2\2[\\\7h\2\2\\]\7"+
		"c\2\2]^\7n\2\2^_\7u\2\2_a\7g\2\2`W\3\2\2\2`[\3\2\2\2a\30\3\2\2\2bc\7("+
		"\2\2cd\7(\2\2d\32\3\2\2\2ef\7~\2\2fg\7~\2\2g\34\3\2\2\2hi\7`\2\2i\36\3"+
		"\2\2\2jk\7#\2\2k \3\2\2\2lm\7t\2\2mn\7g\2\2no\7c\2\2op\7f\2\2p\"\3\2\2"+
		"\2qr\7r\2\2rs\7t\2\2st\7k\2\2tu\7p\2\2uv\7v\2\2v$\3\2\2\2wx\7*\2\2xy\7"+
		"k\2\2yz\7p\2\2z{\7v\2\2{|\7+\2\2|&\3\2\2\2}~\7*\2\2~\177\7t\2\2\177\u0080"+
		"\7g\2\2\u0080\u0081\7c\2\2\u0081\u0082\7n\2\2\u0082\u0083\7+\2\2\u0083"+
		"(\3\2\2\2\u0084\u0086\t\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088*\3\2\2\2\u0089\u008b\7"+
		"/\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u008e\4\62;\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\7\60\2\2\u0092"+
		"\u0094\4\62;\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096,\3\2\2\2\u0097\u0099\7/\2\2\u0098\u0097"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u009c\4\62;\2\u009b"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e.\3\2\2\2\u009f\u00a0\7/\2\2\u00a0\60\3\2\2\2\u00a1\u00a2\7"+
		"-\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4\64\3\2\2\2\u00a5\u00a6"+
		"\7\61\2\2\u00a6\66\3\2\2\2\u00a7\u00a9\7\17\2\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\f\2\2\u00ab8\3\2\2\2"+
		"\u00ac\u00ae\t\3\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\35\2\2"+
		"\u00b2:\3\2\2\2\r\2U`\u0087\u008a\u008f\u0095\u0098\u009d\u00a8\u00af"+
		"\3\3\35\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}