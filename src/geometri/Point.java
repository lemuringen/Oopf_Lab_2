package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Point extends GeometricalShape {

    /**
     * Constructor for the Point.
     * @param x Placement of the Point on the X-axis.
     * @param y Placement of the Point on the Y-axis.
     * @param color Color of the Point.
     */
    public Point(int x, int y, Color color) throws IllegalPositionException {
        super(x, y, color);
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
        g.drawOval(this.x, this.y, 1, 1)
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
}
