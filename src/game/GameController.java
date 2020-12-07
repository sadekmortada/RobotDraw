package game;

import language.controller.MyRobotControllerVisitor;
import language.controller.RobotControllerLexer;
import language.controller.RobotControllerParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class GameController {

    private Model model;
    private View view;
    private static Scanner scanner=new Scanner(System.in);
    public static GameController gameController;
    private GameController() {
        model = new Model();
        view = new View(model);
        gameController=this;
//        parseControllerFile(); //we commented this, its for reading from file
        parseInputStatements(); //this is to read from command prompt
    }

    public void move() {
        model.movePlayer();
        view.refresh();
        try { Thread.sleep(100); }
        catch (InterruptedException ignored) {}
    }
    public void jump() {
        model.jumpPlayer();
        view.refresh();
        try { Thread.sleep(100); }
        catch (InterruptedException ignored) {}
    }
    public void rotate() {
        model.rotatePlayer();
        view.refresh();
        try { Thread.sleep(100); }
        catch (InterruptedException ignored) {}
    }

    public void clear() {
        model.clearPlayer();
        view.refresh();
        try { Thread.sleep(100); }
        catch (InterruptedException ignored) {}
    }
    public void undo() {
        model.undo();
        view.refresh();
        try { Thread.sleep(100); }
        catch (InterruptedException ignored) {}
    }
    public void move_p(int mp) {
        model.movePixelsPlayer(mp);
        view.refresh();
        try { Thread.sleep(100); }
        catch (InterruptedException ignored) {}
    }
    public void jump_p(int mp) {
        model.jumpPixelsPlayer(mp);
        view.refresh();
        try { Thread.sleep(100); }
        catch (InterruptedException ignored) {}
    }
    public void rotate_d(int rd) {
        model.rotateDegreesPlayer(rd);
        view.refresh();
        try { Thread.sleep(100); }
        catch (InterruptedException ignored) {}
    }

    public void square(int S) {
        for(int i=0; i<=3; i++) {
            model.movePixelsPlayer(S);
            model.rotatePlayer();
            view.refresh();
            try { Thread.sleep(120); }
            catch (InterruptedException ignored) {}
        }
    }
    public void circle(int r) {
        for(int i=0; i<45; i++) {
            model.movePixelsPlayer((int)Math.round(Math.toRadians(8)*r));
            model.rotateDegreesPlayer(8);

            view.refresh();
            try { Thread.sleep(30); }
            catch (InterruptedException ignored) {}
        }
    }

    public void changeColor(String color){
        model.changeColor(color);
    }

    public void displayMessage(String message) {
        view.displayMessage(message);
    }

    public static void main(String[] args) {
        new GameController();
    }

    private void parseControllerFile() { //this reads from file
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
    private void parseInputStatements() { //this reads from command prompt
        //Here we created the variables before the while loop for avoiding creation of many variables in each while loop cycle
        ANTLRInputStream inputStream;
        RobotControllerLexer lexer;
        CommonTokenStream tokens;
        RobotControllerParser parser;
        RobotControllerParser.StatementContext tree;
        MyRobotControllerVisitor visitor;
        while(true) {
            inputStream = new ANTLRInputStream(scanner.nextLine());
            lexer = new RobotControllerLexer(inputStream);
            tokens = new CommonTokenStream(lexer);
            parser = new RobotControllerParser(tokens);
            tree = parser.statement();
            visitor = new MyRobotControllerVisitor(this);
            visitor.visit(tree);
        }
    }
}