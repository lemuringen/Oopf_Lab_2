package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Line extends GeometricalShape {
    private int height;
    private int width;

    /**
     * Constructor for Line.
     *
     * @param x1    Placement of the start of the Line on the X-axis.
     * @param y1    Placement of the start of the Line on the Y-axis.
     * @param x2    Placement of the end of the Line on the Y-axis.
     * @param y2    Placement of the end of the Line on the Y-axis.
     * @param color Color of the Point.
     */
    public Line(int x1, int y1, int x2, int y2, Color color) throws IllegalPositionException {
        super((x1 < x2 ? x1 : x2), (y1 < y2 ? y1 : y2), color);
        this.height = Math.abs(y2-y1);
        this.width = Math.abs(x2-x1);
    }

    /**
     * Constructor for the Line.
     *
     * @param f1    GeometricalForm used for the x and y start coordinates.
     * @param f2    GeometricalForm used for the x and y end coordinates.
     * @param color Color of the Point.
     */
    public Line(GeometricalForm f1, GeometricalForm f2, Color color) {
        super((f1.getX() > f2.getX() ? f1.getX() : f2.getX()), (f1.getY() > f2.getY() ? f1.getY() : f2.getY()), color);
        this.height = Math.abs(f2.getY()-f1.getY());
        this.width = Math.abs(f2.getX()-f2.getX());
    }
    /** Get the area of the Line.
     * @return Returns 0 as line area.
     */
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
    public int hashCode() {
        return 0;
    }

    /**
     * @param o Object for comparison, objects compared by area first and perimeter second.
     * @return True if all attributes and type is the same, regardless of position.
     */
    @Override
    public boolean equals(Object o) {
        return false;
    }

}
