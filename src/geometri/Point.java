package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Point extends GeometricalShape {
    private int x;
    private int y;
    private int area;
    private int perimeter;
    private Color color;

    public Point(int x, int y, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
        this.area = getArea();
        this.perimeter = getPerimeter();
        this.color = c;
    }

    public Point(GeometricalForm f, Color c) throws IllegalPositionException {
        this(f.getX(), f.getY(), c);
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
    public void place(int x, int y) throws IllegalPositionException {

    }

    @Override
    public int hashCode(){
        return 0;
    }
}
