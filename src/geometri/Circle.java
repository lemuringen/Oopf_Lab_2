package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Circle extends GeometricalShape {
    
    final private int diameter;

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
        g.fillOval(this.x, this.y, this.diameter, this.diameter)
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
     * Calculates the radius of the Circle
     * @return Returns the radius of the Circle.
     */
    public double getRadius() {
        return this.diameter / 2;
    }
    
    /**
     * Getter for the diameter of the Circle
     * @return Returns the diameter of the Circle.
     */
    public int getDiameter() {
        return diameter;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
}
