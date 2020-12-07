package game;

import java.awt.*;

public class Coordinates {
    public int x;
    public int y;
    public Color color;
    public Coordinates(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        if (obj instanceof Coordinates)
            return ((Coordinates) obj).x == x && ((Coordinates) obj).y == y;

        return super.equals(obj);
    }
}
