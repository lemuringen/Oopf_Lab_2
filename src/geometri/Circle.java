package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Circle implements GeometricalForm {
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
    //https://www.jetbrains.com/help/idea/2016.2/overriding-methods-of-a-superclass.html
    //Override i IntelliJ
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
    @Override
    public boolean equals(Object o){
        return false;
    }
    @Override
    public int hashCode(){
        return 0;
    }
}
