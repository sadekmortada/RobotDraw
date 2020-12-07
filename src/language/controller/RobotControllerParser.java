// Generated from C:/Users/smmo_/Desktop/Robot Drawing Tool/src/language/controller\RobotController.g4 by ANTLR 4.8
package language.controller;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RobotControllerParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MOVE=1, JUMP=2, ROTATE=3, LOOP=4, LOG=5, COLOR=6, UNDO=7, CLEAR=8, JUMPPIXELS=9, 
		MOVEPIXELS=10, SQUARE=11, ROTATEDEGREES=12, CIRCLE=13, LPAREN=14, RPAREN=15, 
		LCURLY=16, RCURLY=17, INT=18, STRING=19, EOS=20, WS=21, COMMENT=22, LINE_COMMENT=23;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_moveStatement = 2, RULE_rotateStatement = 3, 
		RULE_loopStatement = 4, RULE_logStatement = 5, RULE_changeColorStatement = 6, 
		RULE_jumpStatement = 7, RULE_clearStatement = 8, RULE_undoStatement = 9, 
		RULE_movePixelsStatement = 10, RULE_jumpPixelsStatement = 11, RULE_squareStatement = 12, 
		RULE_rotateDegreesStatement = 13, RULE_circleStatement = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "moveStatement", "rotateStatement", "loopStatement", 
			"logStatement", "changeColorStatement", "jumpStatement", "clearStatement", 
			"undoStatement", "movePixelsStatement", "jumpPixelsStatement", "squareStatement", 
			"rotateDegreesStatement", "circleStatement"
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

	@Override
	public String getGrammarFileName() { return "RobotController.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RobotControllerParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOVE) | (1L << JUMP) | (1L << ROTATE) | (1L << LOOP) | (1L << LOG) | (1L << COLOR) | (1L << UNDO) | (1L << CLEAR) | (1L << JUMPPIXELS) | (1L << MOVEPIXELS) | (1L << SQUARE) | (1L << ROTATEDEGREES) | (1L << CIRCLE))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public MoveStatementContext moveStatement() {
			return getRuleContext(MoveStatementContext.class,0);
		}
		public RotateStatementContext rotateStatement() {
			return getRuleContext(RotateStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public LogStatementContext logStatement() {
			return getRuleContext(LogStatementContext.class,0);
		}
		public ChangeColorStatementContext changeColorStatement() {
			return getRuleContext(ChangeColorStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public ClearStatementContext clearStatement() {
			return getRuleContext(ClearStatementContext.class,0);
		}
		public MovePixelsStatementContext movePixelsStatement() {
			return getRuleContext(MovePixelsStatementContext.class,0);
		}
		public SquareStatementContext squareStatement() {
			return getRuleContext(SquareStatementContext.class,0);
		}
		public RotateDegreesStatementContext rotateDegreesStatement() {
			return getRuleContext(RotateDegreesStatementContext.class,0);
		}
		public CircleStatementContext circleStatement() {
			return getRuleContext(CircleStatementContext.class,0);
		}
		public JumpPixelsStatementContext jumpPixelsStatement() {
			return getRuleContext(JumpPixelsStatementContext.class,0);
		}
		public UndoStatementContext undoStatement() {
			return getRuleContext(UndoStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVE:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				moveStatement();
				}
				break;
			case ROTATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				rotateStatement();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				loopStatement();
				}
				break;
			case LOG:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				logStatement();
				}
				break;
			case COLOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				changeColorStatement();
				}
				break;
			case JUMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				jumpStatement();
				}
				break;
			case CLEAR:
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				clearStatement();
				}
				break;
			case MOVEPIXELS:
				enterOuterAlt(_localctx, 8);
				{
				setState(42);
				movePixelsStatement();
				}
				break;
			case SQUARE:
				enterOuterAlt(_localctx, 9);
				{
				setState(43);
				squareStatement();
				}
				break;
			case ROTATEDEGREES:
				enterOuterAlt(_localctx, 10);
				{
				setState(44);
				rotateDegreesStatement();
				}
				break;
			case CIRCLE:
				enterOuterAlt(_localctx, 11);
				{
				setState(45);
				circleStatement();
				}
				break;
			case JUMPPIXELS:
				enterOuterAlt(_localctx, 12);
				{
				setState(46);
				jumpPixelsStatement();
				}
				break;
			case UNDO:
				enterOuterAlt(_localctx, 13);
				{
				setState(47);
				undoStatement();
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

	public static class MoveStatementContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(RobotControllerParser.MOVE, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public MoveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterMoveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitMoveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitMoveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveStatementContext moveStatement() throws RecognitionException {
		MoveStatementContext _localctx = new MoveStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_moveStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(MOVE);
			setState(51);
			match(EOS);
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

	public static class RotateStatementContext extends ParserRuleContext {
		public TerminalNode ROTATE() { return getToken(RobotControllerParser.ROTATE, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public RotateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterRotateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitRotateStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitRotateStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotateStatementContext rotateStatement() throws RecognitionException {
		RotateStatementContext _localctx = new RotateStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rotateStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ROTATE);
			setState(54);
			match(EOS);
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

	public static class LoopStatementContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(RobotControllerParser.LOOP, 0); }
		public TerminalNode LCURLY() { return getToken(RobotControllerParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(RobotControllerParser.RCURLY, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(RobotControllerParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_loopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(LOOP);
			{
			setState(57);
			match(LPAREN);
			setState(58);
			match(INT);
			setState(59);
			match(RPAREN);
			}
			setState(61);
			match(LCURLY);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				statement();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOVE) | (1L << JUMP) | (1L << ROTATE) | (1L << LOOP) | (1L << LOG) | (1L << COLOR) | (1L << UNDO) | (1L << CLEAR) | (1L << JUMPPIXELS) | (1L << MOVEPIXELS) | (1L << SQUARE) | (1L << ROTATEDEGREES) | (1L << CIRCLE))) != 0) );
			setState(67);
			match(RCURLY);
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

	public static class LogStatementContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(RobotControllerParser.LOG, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(RobotControllerParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public LogStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterLogStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitLogStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitLogStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogStatementContext logStatement() throws RecognitionException {
		LogStatementContext _localctx = new LogStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(LOG);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(70);
				match(LPAREN);
				setState(71);
				match(STRING);
				setState(72);
				match(RPAREN);
				}
			}

			setState(75);
			match(EOS);
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

	public static class ChangeColorStatementContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(RobotControllerParser.COLOR, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(RobotControllerParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public ChangeColorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_changeColorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterChangeColorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitChangeColorStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitChangeColorStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChangeColorStatementContext changeColorStatement() throws RecognitionException {
		ChangeColorStatementContext _localctx = new ChangeColorStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_changeColorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(COLOR);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(78);
				match(LPAREN);
				setState(79);
				match(STRING);
				setState(80);
				match(RPAREN);
				}
			}

			setState(83);
			match(EOS);
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode JUMP() { return getToken(RobotControllerParser.JUMP, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_jumpStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(JUMP);
			setState(86);
			match(EOS);
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

	public static class ClearStatementContext extends ParserRuleContext {
		public TerminalNode CLEAR() { return getToken(RobotControllerParser.CLEAR, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public ClearStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clearStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterClearStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitClearStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitClearStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearStatementContext clearStatement() throws RecognitionException {
		ClearStatementContext _localctx = new ClearStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_clearStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(CLEAR);
			setState(89);
			match(EOS);
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

	public static class UndoStatementContext extends ParserRuleContext {
		public TerminalNode UNDO() { return getToken(RobotControllerParser.UNDO, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public UndoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterUndoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitUndoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitUndoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UndoStatementContext undoStatement() throws RecognitionException {
		UndoStatementContext _localctx = new UndoStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_undoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(UNDO);
			setState(92);
			match(EOS);
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

	public static class MovePixelsStatementContext extends ParserRuleContext {
		public TerminalNode MOVEPIXELS() { return getToken(RobotControllerParser.MOVEPIXELS, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(RobotControllerParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public MovePixelsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_movePixelsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterMovePixelsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitMovePixelsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitMovePixelsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovePixelsStatementContext movePixelsStatement() throws RecognitionException {
		MovePixelsStatementContext _localctx = new MovePixelsStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_movePixelsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(MOVEPIXELS);
			{
			setState(95);
			match(LPAREN);
			setState(96);
			match(INT);
			setState(97);
			match(RPAREN);
			}
			setState(99);
			match(EOS);
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

	public static class JumpPixelsStatementContext extends ParserRuleContext {
		public TerminalNode JUMPPIXELS() { return getToken(RobotControllerParser.JUMPPIXELS, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(RobotControllerParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public JumpPixelsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpPixelsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterJumpPixelsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitJumpPixelsStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitJumpPixelsStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpPixelsStatementContext jumpPixelsStatement() throws RecognitionException {
		JumpPixelsStatementContext _localctx = new JumpPixelsStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jumpPixelsStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(JUMPPIXELS);
			{
			setState(102);
			match(LPAREN);
			setState(103);
			match(INT);
			setState(104);
			match(RPAREN);
			}
			setState(106);
			match(EOS);
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

	public static class SquareStatementContext extends ParserRuleContext {
		public TerminalNode SQUARE() { return getToken(RobotControllerParser.SQUARE, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(RobotControllerParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public SquareStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_squareStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterSquareStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitSquareStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitSquareStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SquareStatementContext squareStatement() throws RecognitionException {
		SquareStatementContext _localctx = new SquareStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_squareStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(SQUARE);
			{
			setState(109);
			match(LPAREN);
			setState(110);
			match(INT);
			setState(111);
			match(RPAREN);
			}
			setState(113);
			match(EOS);
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

	public static class RotateDegreesStatementContext extends ParserRuleContext {
		public TerminalNode ROTATEDEGREES() { return getToken(RobotControllerParser.ROTATEDEGREES, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(RobotControllerParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public RotateDegreesStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotateDegreesStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterRotateDegreesStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitRotateDegreesStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitRotateDegreesStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotateDegreesStatementContext rotateDegreesStatement() throws RecognitionException {
		RotateDegreesStatementContext _localctx = new RotateDegreesStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_rotateDegreesStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ROTATEDEGREES);
			{
			setState(116);
			match(LPAREN);
			setState(117);
			match(INT);
			setState(118);
			match(RPAREN);
			}
			setState(120);
			match(EOS);
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

	public static class CircleStatementContext extends ParserRuleContext {
		public TerminalNode CIRCLE() { return getToken(RobotControllerParser.CIRCLE, 0); }
		public TerminalNode EOS() { return getToken(RobotControllerParser.EOS, 0); }
		public TerminalNode LPAREN() { return getToken(RobotControllerParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(RobotControllerParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(RobotControllerParser.RPAREN, 0); }
		public CircleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_circleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).enterCircleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RobotControllerListener ) ((RobotControllerListener)listener).exitCircleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RobotControllerVisitor ) return ((RobotControllerVisitor<? extends T>)visitor).visitCircleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CircleStatementContext circleStatement() throws RecognitionException {
		CircleStatementContext _localctx = new CircleStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_circleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(CIRCLE);
			{
			setState(123);
			match(LPAREN);
			setState(124);
			match(INT);
			setState(125);
			match(RPAREN);
			}
			setState(127);
			match(EOS);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0084\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6B\n\6\r\6\16\6"+
		"C\3\6\3\6\3\7\3\7\3\7\3\7\5\7L\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bT\n\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\2\2\u0084\2!\3\2\2"+
		"\2\4\62\3\2\2\2\6\64\3\2\2\2\b\67\3\2\2\2\n:\3\2\2\2\fG\3\2\2\2\16O\3"+
		"\2\2\2\20W\3\2\2\2\22Z\3\2\2\2\24]\3\2\2\2\26`\3\2\2\2\30g\3\2\2\2\32"+
		"n\3\2\2\2\34u\3\2\2\2\36|\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3"+
		"\2\2\2#$\3\2\2\2$\3\3\2\2\2%\63\5\6\4\2&\63\5\b\5\2\'\63\5\n\6\2(\63\5"+
		"\f\7\2)\63\5\16\b\2*\63\5\20\t\2+\63\5\22\n\2,\63\5\26\f\2-\63\5\32\16"+
		"\2.\63\5\34\17\2/\63\5\36\20\2\60\63\5\30\r\2\61\63\5\24\13\2\62%\3\2"+
		"\2\2\62&\3\2\2\2\62\'\3\2\2\2\62(\3\2\2\2\62)\3\2\2\2\62*\3\2\2\2\62+"+
		"\3\2\2\2\62,\3\2\2\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2"+
		"\62\61\3\2\2\2\63\5\3\2\2\2\64\65\7\3\2\2\65\66\7\26\2\2\66\7\3\2\2\2"+
		"\678\7\5\2\289\7\26\2\29\t\3\2\2\2:;\7\6\2\2;<\7\20\2\2<=\7\24\2\2=>\7"+
		"\21\2\2>?\3\2\2\2?A\7\22\2\2@B\5\4\3\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2C"+
		"D\3\2\2\2DE\3\2\2\2EF\7\23\2\2F\13\3\2\2\2GK\7\7\2\2HI\7\20\2\2IJ\7\25"+
		"\2\2JL\7\21\2\2KH\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\26\2\2N\r\3\2\2\2OS"+
		"\7\b\2\2PQ\7\20\2\2QR\7\25\2\2RT\7\21\2\2SP\3\2\2\2ST\3\2\2\2TU\3\2\2"+
		"\2UV\7\26\2\2V\17\3\2\2\2WX\7\4\2\2XY\7\26\2\2Y\21\3\2\2\2Z[\7\n\2\2["+
		"\\\7\26\2\2\\\23\3\2\2\2]^\7\t\2\2^_\7\26\2\2_\25\3\2\2\2`a\7\f\2\2ab"+
		"\7\20\2\2bc\7\24\2\2cd\7\21\2\2de\3\2\2\2ef\7\26\2\2f\27\3\2\2\2gh\7\13"+
		"\2\2hi\7\20\2\2ij\7\24\2\2jk\7\21\2\2kl\3\2\2\2lm\7\26\2\2m\31\3\2\2\2"+
		"no\7\r\2\2op\7\20\2\2pq\7\24\2\2qr\7\21\2\2rs\3\2\2\2st\7\26\2\2t\33\3"+
		"\2\2\2uv\7\16\2\2vw\7\20\2\2wx\7\24\2\2xy\7\21\2\2yz\3\2\2\2z{\7\26\2"+
		"\2{\35\3\2\2\2|}\7\17\2\2}~\7\20\2\2~\177\7\24\2\2\177\u0080\7\21\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0082\7\26\2\2\u0082\37\3\2\2\2\7#\62CKS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}