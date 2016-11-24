package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Circle extends GeometricalShape {
    private int diameter;

    /**
     * Constructor for Circle.
     * @param x X-cordinate for the left uppermost corner of the narrowest possible Rectangle surrounding the Circle.
     * @param y Y-cordinate for the left uppermost corner of the narrowest possible Rectangle surrounding the Circle.
     * @param diameter Diameter of the Circle.
     * @param color Color of the Point.
     */
    public Circle(int x, int y, int diameter, Color color) throws IllegalPositionException {
        super(x, y, color);
        this.diameter = diameter;
    }
    /**
     * Constructor for the Circle
     * @param f Geometrical form used for x and y coordinates of the left uppermost corner of the narrowest possible Rectangle surrounding the Circle
     * @param diameter Diameter of the Circle.
     * @param color Color of the Circle.
     */
    public Circle(GeometricalForm f, int diameter, Color color) {
        super(f.getX(), f.getY(), color);
        this.diameter = diameter;
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

    public int getDiameter() {
        return 0;
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
