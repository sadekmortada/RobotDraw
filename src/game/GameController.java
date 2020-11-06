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
    private static Scanner scanner = new Scanner(System.in); // to take user command input
    private static FileWriter writer; //to save the command input into the file
    private static File file = new File("res\\user_input.robot"); // to read each time the user command and execute it
    private static String input;
    public static GameController gameController;
    private GameController() {
        gameController=this;
        model = new Model();
        view = new View(model);
//        try { // just to make sure there exists file with such name!
//            file.createNewFile(); } catch (IOException e) { e.printStackTrace(); }
//        parseInput();
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

    public void move(int distance) {
        model.movePlayer(distance);
        process();
    }

    public void rotate(int degrees) {
        model.rotatePlayer(degrees);
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
    public static void parseInput() {
        try {
            input = scanner.nextLine();
            writer = new FileWriter(file);
            writer.write(input);
            writer.close();
            InputStream fileStream= new FileInputStream(file);
            ANTLRInputStream inputStream = new ANTLRInputStream(fileStream);
            RobotControllerLexer lexer = new RobotControllerLexer(inputStream);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RobotControllerParser parser = new RobotControllerParser(tokens);
            RobotControllerParser.ProgramContext tree = parser.program();
            MyRobotControllerVisitor visitor = new MyRobotControllerVisitor(gameController);
            visitor.visit(tree);
        }
        catch (Exception e) { }

    }

}