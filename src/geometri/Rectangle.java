package geometri;

import java.awt.*;

public class Rectangle extends GeometricalShape {
    
    /** Width of the Rectangle.*/
    private int width;
    /** Height of the Rectangle.*/
    private int height;
    
    /**
     * Constructor for the Rectangle.
     * @param x Placement of the Rectangle on the X-axis.
     * @param y Placement of the Rectangle on the Y-axis.
     * @param width Width of the Rectangle.
     * @param height Height of the Rectangle.
     * @param color Color of the Rectangle.
     */
    public Rectangle(int x, int y, int width, int height, Color color) throws IllegalPositionException {
        super(x, y, color);
        if (x < 0 || y < 0) {
            throw new IllegalPositionException("Can't place on negative coordinate(s)");
        }
        this.width = width;
        this.height = height;
    }
    
    /**
     * Constructor for the Rectangle.
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
        g.setColor(this.color);
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
    public int hashCode() {
        int prime = 19;
        int result = 3;
        result = prime * result + width;
        result = prime * result + height;
        result = prime * result +  color.hashCode();
        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle)) return false;
        if (this == o) return true;

        Rectangle other = (Rectangle) o;
        if (this.width != other.getWidth()) return false;
        if (this.height != other.getHeight()) return false;
        if (this.area != other.getArea()) return false;
        if (this.perimeter != other.getPerimeter()) return false;
        if (this.color.hashCode() != other.getColor().hashCode()) return false;
        return true;
    }
}
