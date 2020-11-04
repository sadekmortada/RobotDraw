package game;
import java.awt.*;
import java.util.*;
import java.util.List;

public class Model {
    private int screenX=800, screenY=600, playerSize=25;
    private Coordinates current = new Coordinates(200, 200), previous=new Coordinates(200,200);
    private int angle = 0;
    private HashMap<Coordinates,Coordinates> lines = new HashMap<>();

    public void movePlayer() {
        current.x += 15*Math.cos(((float)angle/180)*Math.PI);
        current.y += 15*Math.sin(((float)angle/180)*Math.PI);
        validateMove(current);
    }

    public void jumpPlayer() {
        current.x += 15*Math.cos(Math.toRadians(angle));
        current.y += 15*Math.sin(Math.toRadians(angle));
        validateJump(current);
    }
    public void rotatePlayer() {
        angle+=90;
        angle %= 360;
    }


    public void changeColor(String colorID) {
        switch(colorID.split("\"")[1]){
            case "gray":
                current.color=Color.GRAY;
                break;
            case "red":
            current.color=Color.RED;
            break;
            case "green":
                current.color=Color.GREEN;
                break;
            case "blue":
                current.color=Color.BLUE;
                break;
            case "yellow":
                current.color=Color.YELLOW;
                break;
            case "cyan":
                current.color=Color.CYAN;
                break;
            case"orange":
                current.color=Color.ORANGE;
                break;
            case"magenta":
                current.color=Color.MAGENTA;
                break;
            case"pink":
                current.color=Color.PINK;
                break;
            default:
                current.color=Color.BLACK;
        }
        lines.put(Coordinates.clone(previous),Coordinates.clone(current));
    }
    private void validateMove(Coordinates current){
        if (current.x <=10 || current.x >= screenX-10 || current.y <= 20 || current.y >= screenY-10) {
            System.out.println("Invalid move");
            // we can log a message here
            current.x = previous.x;
            current.y = previous.y;
            return;
        }
        if(!previous.equals(current)) {
            lines.put(Coordinates.clone(previous),Coordinates.clone(current));
        }
    }

    private void validateJump(Coordinates current){
        if (current.x <=10 || current.x >= screenX-10 || current.y <= 20 || current.y >= screenY-10) {
            System.out.println("Invalid jump");
            // we can log a message here
            current.x = previous.x;
            current.y = previous.y;
            return;
        }
    }

    public int getCurrentX() { return current.x;}
    public int getCurrentY() {return current.y;}

    public HashMap<Coordinates, Coordinates> getLines() { return lines; }
    public int getPlayerSize() {return playerSize;}
    public int getAngle() { return angle; }
    public int getScreenX() { return screenX; }
    public int getScreenY() { return screenY; }

    public void currentToPrevious() {
        previous.x=current.x;
        previous.y=current.y;
        previous.color=current.color;
    }

}