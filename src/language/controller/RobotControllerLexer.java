// Generated from C:/Users/smmo_/Desktop/Robot Drawing Tool/src/language/controller\RobotController.g4 by ANTLR 4.8
package language.controller;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RobotControllerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MOVE=1, JUMP=2, ROTATE=3, LOOP=4, LOG=5, COLOR=6, UNDO=7, CLEAR=8, JUMPPIXELS=9, 
		MOVEPIXELS=10, SQUARE=11, ROTATEDEGREES=12, CIRCLE=13, LPAREN=14, RPAREN=15, 
		LCURLY=16, RCURLY=17, INT=18, STRING=19, EOS=20, WS=21, COMMENT=22, LINE_COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MOVE", "JUMP", "ROTATE", "LOOP", "LOG", "COLOR", "UNDO", "CLEAR", "JUMPPIXELS", 
			"MOVEPIXELS", "SQUARE", "ROTATEDEGREES", "CIRCLE", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "INT", "STRING", "EOS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'move'", "'jump'", "'rotate'", "'loop'", "'log'", "'color'", "'undo'", 
			"'clear'", "'jump_p'", "'move_p'", "'square'", "'rotate_d'", "'circle'", 
			"'('", "')'", "'{'", "'}'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MOVE", "JUMP", "ROTATE", "LOOP", "LOG", "COLOR", "UNDO", "CLEAR", 
			"JUMPPIXELS", "MOVEPIXELS", "SQUARE", "ROTATEDEGREES", "CIRCLE", "LPAREN", 
			"RPAREN", "LCURLY", "RCURLY", "INT", "STRING", "EOS", "WS", "COMMENT", 
			"LINE_COMMENT"
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


	public RobotControllerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RobotController.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00b6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\6\23\u008b\n\23\r\23\16\23\u008c\3\24\3\24\7"+
		"\24\u0091\n\24\f\24\16\24\u0094\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\7\27\u00a2\n\27\f\27\16\27\u00a5\13\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00b0\n\30\f\30\16\30"+
		"\u00b3\13\30\3\30\3\30\3\u00a3\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\3\2\5\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u00b9\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2"+
		"\2\2\5\66\3\2\2\2\7;\3\2\2\2\tB\3\2\2\2\13G\3\2\2\2\rK\3\2\2\2\17Q\3\2"+
		"\2\2\21V\3\2\2\2\23\\\3\2\2\2\25c\3\2\2\2\27j\3\2\2\2\31q\3\2\2\2\33z"+
		"\3\2\2\2\35\u0081\3\2\2\2\37\u0083\3\2\2\2!\u0085\3\2\2\2#\u0087\3\2\2"+
		"\2%\u008a\3\2\2\2\'\u008e\3\2\2\2)\u0097\3\2\2\2+\u0099\3\2\2\2-\u009d"+
		"\3\2\2\2/\u00ab\3\2\2\2\61\62\7o\2\2\62\63\7q\2\2\63\64\7x\2\2\64\65\7"+
		"g\2\2\65\4\3\2\2\2\66\67\7l\2\2\678\7w\2\289\7o\2\29:\7r\2\2:\6\3\2\2"+
		"\2;<\7t\2\2<=\7q\2\2=>\7v\2\2>?\7c\2\2?@\7v\2\2@A\7g\2\2A\b\3\2\2\2BC"+
		"\7n\2\2CD\7q\2\2DE\7q\2\2EF\7r\2\2F\n\3\2\2\2GH\7n\2\2HI\7q\2\2IJ\7i\2"+
		"\2J\f\3\2\2\2KL\7e\2\2LM\7q\2\2MN\7n\2\2NO\7q\2\2OP\7t\2\2P\16\3\2\2\2"+
		"QR\7w\2\2RS\7p\2\2ST\7f\2\2TU\7q\2\2U\20\3\2\2\2VW\7e\2\2WX\7n\2\2XY\7"+
		"g\2\2YZ\7c\2\2Z[\7t\2\2[\22\3\2\2\2\\]\7l\2\2]^\7w\2\2^_\7o\2\2_`\7r\2"+
		"\2`a\7a\2\2ab\7r\2\2b\24\3\2\2\2cd\7o\2\2de\7q\2\2ef\7x\2\2fg\7g\2\2g"+
		"h\7a\2\2hi\7r\2\2i\26\3\2\2\2jk\7u\2\2kl\7s\2\2lm\7w\2\2mn\7c\2\2no\7"+
		"t\2\2op\7g\2\2p\30\3\2\2\2qr\7t\2\2rs\7q\2\2st\7v\2\2tu\7c\2\2uv\7v\2"+
		"\2vw\7g\2\2wx\7a\2\2xy\7f\2\2y\32\3\2\2\2z{\7e\2\2{|\7k\2\2|}\7t\2\2}"+
		"~\7e\2\2~\177\7n\2\2\177\u0080\7g\2\2\u0080\34\3\2\2\2\u0081\u0082\7*"+
		"\2\2\u0082\36\3\2\2\2\u0083\u0084\7+\2\2\u0084 \3\2\2\2\u0085\u0086\7"+
		"}\2\2\u0086\"\3\2\2\2\u0087\u0088\7\177\2\2\u0088$\3\2\2\2\u0089\u008b"+
		"\t\2\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d&\3\2\2\2\u008e\u0092\7$\2\2\u008f\u0091\n\3\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7$\2\2\u0096"+
		"(\3\2\2\2\u0097\u0098\7=\2\2\u0098*\3\2\2\2\u0099\u009a\t\4\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\b\26\2\2\u009c,\3\2\2\2\u009d\u009e\7\61\2"+
		"\2\u009e\u009f\7,\2\2\u009f\u00a3\3\2\2\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7,\2\2\u00a7\u00a8\7\61"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\27\2\2\u00aa.\3\2\2\2\u00ab\u00ac"+
		"\7\61\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00b1\3\2\2\2\u00ae\u00b0\n\3\2\2"+
		"\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\b\30\2\2"+
		"\u00b5\60\3\2\2\2\7\2\u008c\u0092\u00a3\u00b1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}