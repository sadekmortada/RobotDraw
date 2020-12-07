// Generated from C:/Users/smmo_/Desktop/Robot Drawing Tool/src/language/controller\RobotController.g4 by ANTLR 4.8
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
	 * Enter a parse tree produced by {@link RobotControllerParser#rotateStatement}.
	 * @param ctx the parse tree
	 */
	void enterRotateStatement(RobotControllerParser.RotateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#rotateStatement}.
	 * @param ctx the parse tree
	 */
	void exitRotateStatement(RobotControllerParser.RotateStatementContext ctx);
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
	 * Enter a parse tree produced by {@link RobotControllerParser#clearStatement}.
	 * @param ctx the parse tree
	 */
	void enterClearStatement(RobotControllerParser.ClearStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#clearStatement}.
	 * @param ctx the parse tree
	 */
	void exitClearStatement(RobotControllerParser.ClearStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#undoStatement}.
	 * @param ctx the parse tree
	 */
	void enterUndoStatement(RobotControllerParser.UndoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#undoStatement}.
	 * @param ctx the parse tree
	 */
	void exitUndoStatement(RobotControllerParser.UndoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#movePixelsStatement}.
	 * @param ctx the parse tree
	 */
	void enterMovePixelsStatement(RobotControllerParser.MovePixelsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#movePixelsStatement}.
	 * @param ctx the parse tree
	 */
	void exitMovePixelsStatement(RobotControllerParser.MovePixelsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#jumpPixelsStatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpPixelsStatement(RobotControllerParser.JumpPixelsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#jumpPixelsStatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpPixelsStatement(RobotControllerParser.JumpPixelsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#squareStatement}.
	 * @param ctx the parse tree
	 */
	void enterSquareStatement(RobotControllerParser.SquareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#squareStatement}.
	 * @param ctx the parse tree
	 */
	void exitSquareStatement(RobotControllerParser.SquareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#rotateDegreesStatement}.
	 * @param ctx the parse tree
	 */
	void enterRotateDegreesStatement(RobotControllerParser.RotateDegreesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#rotateDegreesStatement}.
	 * @param ctx the parse tree
	 */
	void exitRotateDegreesStatement(RobotControllerParser.RotateDegreesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RobotControllerParser#circleStatement}.
	 * @param ctx the parse tree
	 */
	void enterCircleStatement(RobotControllerParser.CircleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RobotControllerParser#circleStatement}.
	 * @param ctx the parse tree
	 */
	void exitCircleStatement(RobotControllerParser.CircleStatementContext ctx);
}