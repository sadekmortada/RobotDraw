// Generated from C:/Users/smmo_/IdeaProjects/robotgame_starter/src/language/controller\RobotController.g4 by ANTLR 4.8
package language.controller;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RobotControllerParser}.
 */
public interface RobotControllerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RobotControllerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RobotControllerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RobotControllerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RobotControllerParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(RobotControllerParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(RobotControllerParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#logStatement}.
	 * @param ctx the parse tree
	 */
	void enterLogStatement(RobotControllerParser.LogStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#logStatement}.
	 * @param ctx the parse tree
	 */
	void exitLogStatement(RobotControllerParser.LogStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#changeColorStatement}.
	 * @param ctx the parse tree
	 */
	void enterChangeColorStatement(RobotControllerParser.ChangeColorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#changeColorStatement}.
	 * @param ctx the parse tree
	 */
	void exitChangeColorStatement(RobotControllerParser.ChangeColorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void enterMoveStatement(RobotControllerParser.MoveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#moveStatement}.
	 * @param ctx the parse tree
	 */
	void exitMoveStatement(RobotControllerParser.MoveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpStatement(RobotControllerParser.JumpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpStatement(RobotControllerParser.JumpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#rotateStatement}.
	 * @param ctx the parse tree
	 */
	void enterRotateStatement(RobotControllerParser.RotateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#rotateStatement}.
	 * @param ctx the parse tree
	 */
	void exitRotateStatement(RobotControllerParser.RotateStatementContext ctx);
}