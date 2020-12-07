package language.controller;

import game.GameController;

public class MyRobotControllerVisitor extends RobotControllerBaseVisitor {
    private GameController controller;
    public MyRobotControllerVisitor(GameController controller){
        this.controller=controller;
    }
    @Override
    public Object visitMoveStatement(RobotControllerParser.MoveStatementContext ctx){
        controller.move();
        return super.visitMoveStatement(ctx);
    }
    @Override
    public Object visitJumpStatement(RobotControllerParser.JumpStatementContext ctx){
        controller.jump();
        return super.visitJumpStatement(ctx);
    }
    @Override
    public Object visitRotateStatement(RobotControllerParser.RotateStatementContext ctx){
        controller.rotate();
        return  super.visitRotateStatement(ctx);
    }
    @Override
    public Object visitChangeColorStatement(RobotControllerParser.ChangeColorStatementContext ctx){
        controller.changeColor(ctx.STRING().getText());
        return super.visitChangeColorStatement(ctx);
    }
    @Override
    public Object visitLoopStatement(RobotControllerParser.LoopStatementContext ctx) {
        Object result = null;
        for (int i = 0; i < Integer.parseInt(ctx.INT().getText()); i++) {
            for (RobotControllerParser.StatementContext stm : ctx.statement()) {
                result = visit(stm);
            }
        }
        return result;
    }
    @Override
    public Object visitLogStatement(RobotControllerParser.LogStatementContext ctx) {
        controller.displayMessage(ctx.STRING().getText());
        return super.visitLogStatement(ctx);
    }
    @Override
    public Object visitClearStatement(RobotControllerParser.ClearStatementContext ctx){
        controller.clear();
        return super.visitClearStatement(ctx);
    }

    @Override
    public Object visitMovePixelsStatement(RobotControllerParser.MovePixelsStatementContext ctx){
        controller.move_p(Integer.parseInt(ctx.INT().getText()));
        return super.visitMovePixelsStatement(ctx);
    }
    @Override
    public Object visitJumpPixelsStatement(RobotControllerParser.JumpPixelsStatementContext ctx){
        controller.jump_p(Integer.parseInt(ctx.INT().getText()));
        return super.visitJumpPixelsStatement(ctx);
    }

    @Override
    public Object visitUndoStatement(RobotControllerParser.UndoStatementContext ctx) {
        controller.undo();
        return super.visitUndoStatement(ctx);
    }

    @Override
    public Object visitSquareStatement(RobotControllerParser.SquareStatementContext ctx){
        controller.square(Integer.parseInt(ctx.INT().getText()));
        return super.visitSquareStatement(ctx);
    }
    @Override
    public Object visitRotateDegreesStatement(RobotControllerParser.RotateDegreesStatementContext ctx){
        controller.rotate_d(Integer.parseInt(ctx.INT().getText()));
        return super.visitRotateDegreesStatement(ctx);
    }
    @Override
    public Object visitCircleStatement(RobotControllerParser.CircleStatementContext ctx){
        controller.circle(Integer.parseInt(ctx.INT().getText()));
        return super.visitCircleStatement(ctx);
    }
}
