package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Oval extends GeometricalShape{
    private int width;
    private int height;
    /**
     * Constructor for Oval
     * @param x X-coordinate for the left uppermost corner of the narrowest possible Rectangle surrounding the Oval.
     * @param y Y-coordinate for the left uppermost corner of the narrowest possible Rectangle surrounding the Oval.
     * @param width Width of the Oval.
     * @param height Height of the Oval.
     * @param color Color of the Oval.
     */
    public Oval(int x, int y, int width, int height, Color color) throws IllegalPositionException {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }
    /**
     * Constructor for the Oval
     * @param f GeometricalForm used for x and y coordinates.
     * @param width Width of the Oval.
     * @param height Height of the Oval.
     * @param color Color of the Oval.
     */
    public Oval(GeometricalForm f, int width, int height, Color color) {
        super(f.getX(), f.getY(), color);
        this.width = width;
        this.height = height;
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
    /**
     * @param o Object for comparison, objects compared by area first and perimeter second.
     * @return True if all attributes and type is the same, regardless of position.
     */
    @Override
    public boolean equals(Object o){
        return false;
    }
}