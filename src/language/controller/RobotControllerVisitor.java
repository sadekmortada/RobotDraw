// Generated from C:/Users/smmo_/Desktop/Robot Drawing Tool/src/language/controller\RobotController.g4 by ANTLR 4.8
package language.controller;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RobotControllerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RobotControllerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(RobotControllerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(RobotControllerParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#moveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMoveStatement(RobotControllerParser.MoveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#rotateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotateStatement(RobotControllerParser.RotateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(RobotControllerParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#logStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogStatement(RobotControllerParser.LogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#changeColorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeColorStatement(RobotControllerParser.ChangeColorStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStatement(RobotControllerParser.JumpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#clearStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearStatement(RobotControllerParser.ClearStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#undoStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUndoStatement(RobotControllerParser.UndoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#movePixelsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMovePixelsStatement(RobotControllerParser.MovePixelsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#jumpPixelsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpPixelsStatement(RobotControllerParser.JumpPixelsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#squareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquareStatement(RobotControllerParser.SquareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#rotateDegreesStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRotateDegreesStatement(RobotControllerParser.RotateDegreesStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link RobotControllerParser#circleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCircleStatement(RobotControllerParser.CircleStatementContext ctx);
}