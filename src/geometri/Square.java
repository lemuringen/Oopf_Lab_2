package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Square extends GeometricalShape {
    final private int side;

    /**
     * Constructor for Square
     * @param x Placement of the Square on the X-axis.
     * @param y Placement of the Square on the Y-axis.
     * @param side Side of the Square.
     * @param color Color of the Square.
     */

    public Square(int x, int y, int side, Color color) throws IllegalPositionException {
        super(x, y, color);
        this.side = side;
    }

    /**
     * Constructor for the Square
     * @param f GeometricalForm used for x and y coordinates.
     * @param side Side of the Square.
     * @param color Color of the Square.
     */
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
    /**
     *
     * @param o Object for comparison, objects compared by area first and perimeter second.
     * @return True if all attributes and type is the same, regardless of position.
     */
    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

}
