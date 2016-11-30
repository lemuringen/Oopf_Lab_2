package geometri;

import java.awt.*;

public class Circle extends GeometricalShape {
    
    /** Diameter of the circle */
    private int diameter;

    /**
     * Constructor for the Circle.
     * @param x X-cordinate for the left uppermost corner of the narrowest possible Rectangle surrounding the Circle.
     * @param y Y-cordinate for the left uppermost corner of the narrowest possible Rectangle surrounding the Circle.
     * @param diameter Diameter of the Circle.
     * @param color Color of the Point.
     */
    public Circle(int x, int y, int diameter, Color color) throws IllegalPositionException {
        super(x, y, color);
        this.diameter = diameter;
        if (x < 0 || y < 0) {
            throw new IllegalPositionException("Can't place on negative coordinate(s)");
        }
    }
    
    /**
     * Constructor for the Circle.
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
        return (int)(Math.pow(getRadius(), 2) * Math.PI);
    }
    
    @Override
    public void fill(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.diameter, this.diameter);
    }
    
    @Override
    public int getWidth() {
        return diameter;
    }
    
    @Override
    public int getHeight() {
        return diameter;
    }
    
    @Override
    public int getPerimeter() {
        return (int)(2 * Math.PI * getRadius());
    }
    
    /**
     * Calculates the radius of the Circle.
     * 
     * @return the radius of the Circle.
     */
    public double getRadius() {
        return this.diameter / 2;
    }
    
    /**
     * Getter for the diameter of the Circle.
     *
     * @return the diameter of the Circle.
     */
    public int getDiameter() {
        return diameter;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle)) return false;
        if (this == o) return true;

        Circle other = (Circle) o;
        if (this.diameter != other.getDiameter()) return false;
        if (this.color.hashCode() != other.getColor().hashCode()) return false;
        return true;
    }
    @Override
    public int hashCode() {
        int prime = 13;
        int result = 9;
        result = prime * result + diameter;
        result = prime * result +  color.hashCode();
        return result;
    }
}
