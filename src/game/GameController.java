package game;

import jdk.internal.util.xml.impl.Input;
import language.controller.MyRobotControllerVisitor;
import language.controller.RobotControllerLexer;
import language.controller.RobotControllerParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;
import java.io.*;
import java.util.Scanner;

public class GameController {

    private Model model;
    private View view;

    public static GameController gameController;
    private GameController() {
        gameController=this;
        model = new Model();
        view = new View(model);
        parseControllerFile();
    }

    public void move() {
        model.movePlayer();
        process();
    }
    public void jump() {
        model.jumpPlayer();
        process();
    }
    public void rotate() {
        model.rotatePlayer();
        process();
    }

    public void changeColor(String color){
        model.changeColor(color);
    }

    public void process(){
        view.refresh();
        try { Thread.sleep(100); }
        catch (InterruptedException ignored) {}
    }

    public void displayMessage(String message) {
        view.displayMessage(message);
    }

    public static void main(String[] args) {
        new GameController();
    }

    private void parseControllerFile() {//TODO edit
        try {
            InputStream fileStream= new FileInputStream("res\\sample.robot");
            ANTLRInputStream inputStream = new ANTLRInputStream(fileStream);
            RobotControllerLexer lexer = new RobotControllerLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RobotControllerParser parser = new RobotControllerParser(tokens);
            RobotControllerParser.ProgramContext tree = parser.program();
            MyRobotControllerVisitor visitor = new MyRobotControllerVisitor(this);
            visitor.visit(tree);
        }
        catch (IOException ignored) { }
    }

}