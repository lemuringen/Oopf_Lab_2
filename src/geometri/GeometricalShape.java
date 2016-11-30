package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-22.
 */
public abstract class GeometricalShape implements GeometricalForm {
    /**
     * Placement of the GeometricalShape on the X-axis.
     */
    protected int x;
    /**
     * Placement of the GeometricalShape on the Y-axis.
     */
    protected int y;
    /**
     * Area of the GeometricalShape.
     */
    protected final int area;
    /**
     * Perimeter of the GeometricalShape.
     */
    protected final int perimeter;
    /**
     * Color  the GeometricalShape.
     */
    protected final Color color;

    /**
     * Constructor for the GeometricalShape
     *
     * @param x     Placement of the GeometricalShape on the Y-axis.
     * @param y     Placement of the GeometricalShape on the Y-axis.
     * @param color Color  the GeometricalShape.
     */
    GeometricalShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.area = getArea();
        this.perimeter = getPerimeter();
        this.color = color;

    }

    public abstract int getArea();

    public int compareTo(GeometricalForm f) {
        if (this.area < f.getArea()) {
            return -1;
        }
        if (this.area > f.getArea()) {
            return 1;
        }
        // Area not greater than nor lesser than, must be equal
        if (this.perimeter < f.getPerimeter()) {
            return -1;
        }
        if (this.perimeter > f.getPerimeter()) {
            return 1;
        }
        return 0;
    }

    public abstract void fill(Graphics g);

    public Color getColor() {
        return this.color;
    }

    public abstract int getWidth();

    public abstract int getHeight();

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract int getPerimeter();

    public void move(int dx, int dy)
            throws IllegalPositionException {
        int xTmp = dx + this.x;
        int yTmp = dy + this.y;
        if (xTmp < 0 || yTmp < 0) {
            throw new IllegalPositionException("Can't move to negative coordinate(s)");
        }
        this.x = xTmp;
        this.y = yTmp;
    }

    public void place(int x, int y)
            throws IllegalPositionException {
        if (x < 0 || y < 0) {
            throw new IllegalPositionException("Can't place on negative coordinate(s)");
        }
        this.x = x;
        this.y = y;
    }
}

