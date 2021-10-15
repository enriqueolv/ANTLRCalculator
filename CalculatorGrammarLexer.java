// Generated from CalculatorGrammar.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, FLOAT=5, EXPONENT=6, MUL=7, DIV=8, ADD=9, 
		SUB=10, POW=11, LOG10=12, LN=13, COS=14, TAN=15, SIN=16, ACOS=17, ASIN=18, 
		ATAN=19, SQRT=20, PI=21, E=22, ID=23, INT=24, NEWLINE=25, WS=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "FLOAT", "EXPONENT", "MUL", "DIV", "ADD", 
			"SUB", "POW", "LOG10", "LN", "COS", "TAN", "SIN", "ACOS", "ASIN", "ATAN", 
			"SQRT", "PI", "E", "ID", "INT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'clear'", "'('", "')'", null, null, "'*'", "'/'", "'+'", 
			"'-'", "'^'", "'log'", "'ln'", "'cos'", "'tan'", "'sin'", "'acos'", "'asin'", 
			"'atan'", "'sqrt'", null, "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "FLOAT", "EXPONENT", "MUL", "DIV", "ADD", 
			"SUB", "POW", "LOG10", "LN", "COS", "TAN", "SIN", "ACOS", "ASIN", "ATAN", 
			"SQRT", "PI", "E", "ID", "INT", "NEWLINE", "WS"
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


	public CalculatorGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CalculatorGrammar.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\6\6E\n\6\r\6\16\6F\3\6\6\6J\n\6\r\6\16\6K\3\6\3\6\7\6P\n\6\f"+
		"\6\16\6S\13\6\3\6\5\6V\n\6\3\6\3\6\6\6Z\n\6\r\6\16\6[\3\6\5\6_\n\6\3\6"+
		"\6\6b\n\6\r\6\16\6c\3\6\5\6g\n\6\3\7\3\7\5\7k\n\7\3\7\6\7n\n\7\r\7\16"+
		"\7o\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\6\30\u00a9\n\30"+
		"\r\30\16\30\u00aa\3\31\6\31\u00ae\n\31\r\31\16\31\u00af\3\32\5\32\u00b3"+
		"\n\32\3\32\3\32\5\32\u00b7\n\32\3\33\6\33\u00ba\n\33\r\33\16\33\u00bb"+
		"\3\33\3\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\3\2\7\4\2GGgg\4\2--//\4\2C\\c|\3\2\62;\4\2\13\13\"\"\2\u00cf\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3\2\2\2\7?\3\2\2\2"+
		"\tA\3\2\2\2\13f\3\2\2\2\rh\3\2\2\2\17q\3\2\2\2\21s\3\2\2\2\23u\3\2\2\2"+
		"\25w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33\177\3\2\2\2\35\u0082\3\2\2\2\37"+
		"\u0086\3\2\2\2!\u008a\3\2\2\2#\u008e\3\2\2\2%\u0093\3\2\2\2\'\u0098\3"+
		"\2\2\2)\u009d\3\2\2\2+\u00a2\3\2\2\2-\u00a5\3\2\2\2/\u00a8\3\2\2\2\61"+
		"\u00ad\3\2\2\2\63\u00b6\3\2\2\2\65\u00b9\3\2\2\2\678\7?\2\28\4\3\2\2\2"+
		"9:\7e\2\2:;\7n\2\2;<\7g\2\2<=\7c\2\2=>\7t\2\2>\6\3\2\2\2?@\7*\2\2@\b\3"+
		"\2\2\2AB\7+\2\2B\n\3\2\2\2CE\4\62;\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3"+
		"\2\2\2Gg\3\2\2\2HJ\4\62;\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3"+
		"\2\2\2MQ\7\60\2\2NP\4\62;\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU"+
		"\3\2\2\2SQ\3\2\2\2TV\5\r\7\2UT\3\2\2\2UV\3\2\2\2Vg\3\2\2\2WY\7\60\2\2"+
		"XZ\4\62;\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2]_\5\r\7"+
		"\2^]\3\2\2\2^_\3\2\2\2_g\3\2\2\2`b\4\62;\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2"+
		"\2cd\3\2\2\2de\3\2\2\2eg\5\r\7\2fD\3\2\2\2fI\3\2\2\2fW\3\2\2\2fa\3\2\2"+
		"\2g\f\3\2\2\2hj\t\2\2\2ik\t\3\2\2ji\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\4\62"+
		";\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p\16\3\2\2\2qr\7,\2\2r\20\3"+
		"\2\2\2st\7\61\2\2t\22\3\2\2\2uv\7-\2\2v\24\3\2\2\2wx\7/\2\2x\26\3\2\2"+
		"\2yz\7`\2\2z\30\3\2\2\2{|\7n\2\2|}\7q\2\2}~\7i\2\2~\32\3\2\2\2\177\u0080"+
		"\7n\2\2\u0080\u0081\7p\2\2\u0081\34\3\2\2\2\u0082\u0083\7e\2\2\u0083\u0084"+
		"\7q\2\2\u0084\u0085\7u\2\2\u0085\36\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088"+
		"\7c\2\2\u0088\u0089\7p\2\2\u0089 \3\2\2\2\u008a\u008b\7u\2\2\u008b\u008c"+
		"\7k\2\2\u008c\u008d\7p\2\2\u008d\"\3\2\2\2\u008e\u008f\7c\2\2\u008f\u0090"+
		"\7e\2\2\u0090\u0091\7q\2\2\u0091\u0092\7u\2\2\u0092$\3\2\2\2\u0093\u0094"+
		"\7c\2\2\u0094\u0095\7u\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097"+
		"&\3\2\2\2\u0098\u0099\7c\2\2\u0099\u009a\7v\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7p\2\2\u009c(\3\2\2\2\u009d\u009e\7u\2\2\u009e\u009f\7s\2\2\u009f"+
		"\u00a0\7t\2\2\u00a0\u00a1\7v\2\2\u00a1*\3\2\2\2\u00a2\u00a3\7r\2\2\u00a3"+
		"\u00a4\7k\2\2\u00a4,\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6.\3\2\2\2\u00a7\u00a9"+
		"\t\4\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\60\3\2\2\2\u00ac\u00ae\t\5\2\2\u00ad\u00ac\3\2\2"+
		"\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\62"+
		"\3\2\2\2\u00b1\u00b3\7\17\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2"+
		"\u00b3\u00b4\3\2\2\2\u00b4\u00b7\7\f\2\2\u00b5\u00b7\7=\2\2\u00b6\u00b2"+
		"\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\64\3\2\2\2\u00b8\u00ba\t\6\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\33\2\2\u00be\66\3\2\2\2\22\2FK"+
		"QU[^cfjo\u00aa\u00af\u00b2\u00b6\u00bb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}