package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Rectangle extends GeometricalShape {
    private int width;
    private int height;
    /**
     * Constructor for Rectangle
     * @param x Placement of the Rectangle on the X-axis.
     * @param y Placement of the Rectangle on the Y-axis.
     * @param width Width of the Rectangle.
     * @param height Height of the Rectangle.
     * @param color Color of the Rectangle.
     */
    public Rectangle(int x, int y, int width, int height, Color color) throws IllegalPositionException {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }
    /**
     * Constructor for the Rectangle
     * @param f GeometricalForm used for x and y coordinates.
     * @param width Width of the Rectangle.
     * @param height Height of the Rectangle.
     * @param color Color of the Rectangle.
     */
    public Rectangle(GeometricalForm f, int width, int height, Color color) {
        super(f.getX(), f.getY(), color);
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return (width * height);
    }

    @Override
    public void fill(Graphics g) {
        g.fillRect(x, y, width, height);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }
    @Override
    public int getPerimeter() {
        return ((2 * width) + (2 * height));
    }
    
    @Override
    public int hashCode(){
        return 0;
    }

}
