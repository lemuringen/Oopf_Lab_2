package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Line implements GeometricalForm {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;

    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = c;
    }

    public Line(GeometricalForm f1, GeometricalForm f2, Color c) {
        this.x1 = f1.getX();
        this.y1 = f1.getY();
        this.x2 = f2.getX();
        this.y2 = f2.getY();
        this.color = c;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int compareTo(GeometricalForm f) {
        return 0;
    }

    @Override
    public void fill(Graphics g) {

    }

    @Override
    public Color getColor() {
        return null;
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
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void move(int dx, int dy) throws IllegalPositionException {

    }

    @Override
    public int getPerimeter() {
        return 0;
    }

    @Override
    public void place(int x, int y) throws IllegalPositionException {

    }
}
