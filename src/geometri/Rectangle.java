package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Rectangle extends GeometricalShape {
    private int x;
    private int y;
    private int width;
    private int height;
    private int area;
    private int perimeter;

    private Color color;

    public Rectangle(int x, int y, int width, int height, Color c) throws IllegalPositionException {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.area = getArea();
        this.perimeter = getPerimeter();
        this.color = c;
    }

    public Rectangle(GeometricalForm f, int width, int height, Color c) throws IllegalPositionException {
        this(f.getX(), f.getY(), width, height, c);


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
    public boolean equals(Object o){
        return false;
    }
    @Override
    public int hashCode(){
        return 0;
    }

}
