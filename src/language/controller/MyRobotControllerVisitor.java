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
}
