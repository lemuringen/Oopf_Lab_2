package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Line extends GeometricalShape{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int area;
    private int perimeter;
    private Color color;

    public Line(int x1, int y1, int x2, int y2, Color c) throws IllegalPositionException {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.area = getArea();
        this.perimeter = getPerimeter();
        this.color = c;
    }

    public Line(GeometricalForm f1, GeometricalForm f2, Color c) throws IllegalPositionException {
        this(f1.getX(), f1.getY(), f2.getX(), f2.getY(), c);
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
    public int hashCode(){
        return 0;
    }

}
