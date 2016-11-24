package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Square extends GeometricalShape {
    final private int side;

    public Square(int x, int y, int side, Color color) throws IllegalPositionException {
        super(x, y, color);
        this.side = side;
    }

    public Square(GeometricalForm f, int side, Color color) {
        super(f.getX(), f.getY(), color);
        this.side = side;
    }
    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void fill(Graphics g) {
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
