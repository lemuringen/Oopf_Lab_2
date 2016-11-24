package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Point extends GeometricalShape {

    /**
     * Constructor for Point
     * @param x Placement of the Point on the X-axis.
     * @param y Placement of the Point on the Y-axis.
     * @param color Color of the Point.
     */
    public Point(int x, int y, Color color) throws IllegalPositionException {
        super(x, y, color);
    }
    /**
     * Constructor for the Point
     * @param f GeometricalForm used for x and y coordinates.
     * @param color Color of the Point.
     */
    public Point(GeometricalForm f, Color color)  {
        super(f.getX(), f.getY(), color);
    }

    /** Get the area of the Point.
     * @return Returns 0 as line point.
     */
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

    /**
     * @param o Object for comparison, objects compared by area first and perimeter second.
     * @return True if all attributes and type is the same, regardless of position.
     */
    @Override
    public boolean equals(Object o){
        return false;
    }
}
