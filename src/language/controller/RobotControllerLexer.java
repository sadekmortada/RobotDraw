// Generated from C:/Users/smmo_/IdeaProjects/robotgame_starter/src/language/controller\RobotController.g4 by ANTLR 4.8
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
		MOVE=1, JUMP=2, ROTATE=3, LOOP=4, LOG=5, COLOR=6, LPAREN=7, RPAREN=8, 
		LCURLY=9, RCURLY=10, INT=11, STRING=12, EOS=13, WS=14, COMMENT=15, LINE_COMMENT=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MOVE", "JUMP", "ROTATE", "LOOP", "LOG", "COLOR", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "INT", "STRING", "EOS", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'move'", "'jump'", "'rotate'", "'loop'", "'log'", "'color'", "'('", 
			"')'", "'{'", "'}'", null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MOVE", "JUMP", "ROTATE", "LOOP", "LOG", "COLOR", "LPAREN", "RPAREN", 
			"LCURLY", "RCURLY", "INT", "STRING", "EOS", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\6\fM\n\f\r\f\16\fN\3\r\3\r\7\rS\n\r\f\r\16\rV\13\r\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20d\n\20\f"+
		"\20\16\20g\13\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21r\n"+
		"\21\f\21\16\21u\13\21\3\21\3\21\3e\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\5\3\2\62;\4\2\f"+
		"\f\17\17\5\2\13\f\17\17\"\"\2{\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5(\3\2\2\2\7-\3\2\2\2\t\64\3\2\2\2\13"+
		"9\3\2\2\2\r=\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27"+
		"L\3\2\2\2\31P\3\2\2\2\33Y\3\2\2\2\35[\3\2\2\2\37_\3\2\2\2!m\3\2\2\2#$"+
		"\7o\2\2$%\7q\2\2%&\7x\2\2&\'\7g\2\2\'\4\3\2\2\2()\7l\2\2)*\7w\2\2*+\7"+
		"o\2\2+,\7r\2\2,\6\3\2\2\2-.\7t\2\2./\7q\2\2/\60\7v\2\2\60\61\7c\2\2\61"+
		"\62\7v\2\2\62\63\7g\2\2\63\b\3\2\2\2\64\65\7n\2\2\65\66\7q\2\2\66\67\7"+
		"q\2\2\678\7r\2\28\n\3\2\2\29:\7n\2\2:;\7q\2\2;<\7i\2\2<\f\3\2\2\2=>\7"+
		"e\2\2>?\7q\2\2?@\7n\2\2@A\7q\2\2AB\7t\2\2B\16\3\2\2\2CD\7*\2\2D\20\3\2"+
		"\2\2EF\7+\2\2F\22\3\2\2\2GH\7}\2\2H\24\3\2\2\2IJ\7\177\2\2J\26\3\2\2\2"+
		"KM\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\30\3\2\2\2PT\7$\2"+
		"\2QS\n\3\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2"+
		"\2WX\7$\2\2X\32\3\2\2\2YZ\7=\2\2Z\34\3\2\2\2[\\\t\4\2\2\\]\3\2\2\2]^\b"+
		"\17\2\2^\36\3\2\2\2_`\7\61\2\2`a\7,\2\2ae\3\2\2\2bd\13\2\2\2cb\3\2\2\2"+
		"dg\3\2\2\2ef\3\2\2\2ec\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7,\2\2ij\7\61\2\2"+
		"jk\3\2\2\2kl\b\20\2\2l \3\2\2\2mn\7\61\2\2no\7\61\2\2os\3\2\2\2pr\n\3"+
		"\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\b\21"+
		"\2\2w\"\3\2\2\2\7\2NTes\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}