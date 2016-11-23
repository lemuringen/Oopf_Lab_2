package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Circle extends GeometricalShape {
    private int x;
    private int y;
    private int diameter;
    private int area;
    private int perimeter;
    private Color color;


    public Circle(int x, int y, int diameter, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.area = getArea();
        this.perimeter = getPerimeter();
        this.color = c;

    }

    public Circle(GeometricalForm f, int diameter, Color c) throws IllegalPositionException {
        this(f.getX(), f.getY(), diameter, c);
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
