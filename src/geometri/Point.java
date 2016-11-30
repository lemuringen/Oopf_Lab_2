package geometri;

import java.awt.*;


public class Point extends GeometricalShape {

    /**
     * Constructor for the Point.
     * @param x Placement of the Point on the X-axis.
     * @param y Placement of the Point on the Y-axis.
     * @param color Color of the Point.
     */
    public Point(int x, int y, Color color) throws IllegalPositionException {
        super(x, y, color);
        if (x < 0 || y < 0) {
            throw new IllegalPositionException("Can't place on negative coordinate(s)");
        }
    }
    
    /**
     * Constructor for the Point.
     * @param f GeometricalForm used for x and y coordinates.
     * @param color Color of the Point.
     */
    public Point(GeometricalForm f, Color color)  {
        super(f.getX(), f.getY(), color);
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void fill(Graphics g) {
        g.setColor(color);
        g.drawOval(this.x, this.y, 1, 1);
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
    public int hashCode() {
        int prime = 1;
        int result = 1;
        result = prime * result +  color.hashCode();
        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) return false;
        if (this == o) return true;
        Point other = (Point) o;
        if (this.color.hashCode() != other.getColor().hashCode()) return false;
        return true;
    }
}
