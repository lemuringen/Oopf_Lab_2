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
    
    /**
     * Calculates the area of the Square
     * @return area of the Square.
     */
    @Override
    public int getArea() {
        return (side * side);
    }

    @Override
    public void fill(Graphics g) {
        g.fillOval(x, y, side, side);
    }
    
    @Override
    public int getWidth() {
        return side;
    }

    @Override
    public int getHeight() {
        return side;
    }
    
    /**
     * Calculates the perimeter of the Square
     * @return perimeter of the Square.
     */
    @Override
    public int getPerimeter() {
        return (4 * side);
    }
    
    @Override
    public int hashCode() {
        return 0;
    }

}
