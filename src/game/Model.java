package game;
import java.awt.*;
import java.util.*;

public class Model {
    private int screenX=800, screenY=600, playerSize=25;
    private Coordinates current = new Coordinates(200, 200,Color.BLACK), previous=new Coordinates(200,200, Color.BLACK);
    private int angle = 0;
    private LinkedHashMap<Coordinates,Coordinates> lines = new LinkedHashMap<>();

    public void movePlayer() {
        current.x += Math.round(15*Math.cos(Math.toRadians(angle)));
        current.y += Math.round(15*Math.sin(Math.toRadians(angle)));
        validateMove(current);
    }

    public void jumpPlayer() {
        current.x += Math.round(15*Math.cos(Math.toRadians(angle)));
        current.y += Math.round(15*Math.sin(Math.toRadians(angle)));
        validateJump(current);
    }

    public void rotatePlayer() {
        angle+=90;
        angle %= 360;
    }

    public void clearPlayer() {
        lines.clear();
    }
    public void undo(){
        ArrayList<Coordinates> list = new ArrayList<>(lines.keySet());
        lines.remove(list.get(list.size()-1));
    }
    public void movePixelsPlayer(int mp) {
        current.x += Math.round(mp * Math.cos(Math.toRadians(angle)));
        current.y += Math.round(mp * Math.sin(Math.toRadians(angle)));
        validateMove(current);
    }
    public void jumpPixelsPlayer(int mp) {
        current.x += Math.round(mp*Math.cos(Math.toRadians(angle)));
        current.y += Math.round(mp*Math.sin(Math.toRadians(angle)));
        validateJump(current);
    }
    public void rotateDegreesPlayer(int rd) {
        angle+=rd;
        angle %= 360;
    }

    public void changeColor(String colorID) {
        colorID = colorID.split("\"")[1];
        if (colorID.equals("blue")) { current.color = Color.blue; return;}
        if (colorID.equals("red")) { current.color = Color.red; return;}
        if (colorID.equals("cyan")) { current.color = Color.cyan; return;}
        if (colorID.equals("darkGray")) { current.color = Color.darkGray; return;}
        if (colorID.equals("gray")) { current.color = Color.gray; return;}
        if (colorID.equals("green")) { current.color = Color.green; return;}
        if (colorID.equals("lightGray")) { current.color = Color.lightGray; return;}
        if (colorID.equals("magenta")) { current.color = Color.magenta; return;}
        if (colorID.equals("orange")) { current.color = Color.orange; return;}
        if (colorID.equals("pink")) { current.color = Color.pink; return;}
        if (colorID.equals("white")) { current.color = Color.white; return;}
        if (colorID.equals("yellow")) { current.color = Color.yellow; return;}
        if (colorID.equals("black")) { current.color = Color.black; return;}
        System.out.println("Invalid color");
        previous.color = current.color;
        lines.put(new Coordinates(previous.x,previous.y,previous.color), new Coordinates(current.x,current.y,current.color));
    }

    private void validateMove(Coordinates current){
        if (current.x <=10 || current.x >= screenX-10 || current.y <= 20 || current.y >= screenY-10) {
            //System.out.println("Invalid move!");
            GameController.gameController.displayMessage("Invalid move!");
            current.x = previous.x;
            current.y = previous.y;
            return;
        }
        if(!previous.equals(current)) {
            lines.put(new Coordinates(previous.x,previous.y,previous.color),new Coordinates(current.x,current.y,current.color));
            previous.x=current.x;
            previous.y=current.y;
            previous.color=current.color;
        }
    }

    private void validateJump(Coordinates current){
        if (current.x <=10 || current.x >= screenX-10 || current.y <= 20 || current.y >= screenY-10) {
            //System.out.println("Invalid jump!");
            GameController.gameController.displayMessage("Invalid jump!");
            current.x = previous.x;
            current.y = previous.y;
            return;
        }
        if(!previous.equals(current)) {
            previous.x=current.x;
            previous.y=current.y;
            previous.color=current.color;
        }
    }

    public int getCurrentX() { return current.x;}
    public int getCurrentY() {return current.y;}

    public HashMap<Coordinates, Coordinates> getLines() { return lines; }
    public int getPlayerSize() {return playerSize;}
    public int getAngle() { return angle; }
    public int getScreenX() { return screenX; }
    public int getScreenY() { return screenY; }


}