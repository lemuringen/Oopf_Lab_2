package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Line extends GeometricalShape {
    private int height;
    private int width;
    private boolean gradient; 

    /**
     * Constructor for the Line.
     * @param x1 Placement of the start of the Line on the X-axis.
     * @param y1 Placement of the start of the Line on the Y-axis.
     * @param x2 Placement of the end of the Line on the Y-axis.
     * @param y2 Placement of the end of the Line on the Y-axis.
     * @param color Color of the Point.
     */
    public Line(int x1, int y1, int x2, int y2, Color color) throws IllegalPositionException {
        super((x1 < x2 ? x1 : x2), (y1 < y2 ? y1 : y2), color);
        this.height = Math.abs(y2-y1);
        this.width = Math.abs(x2-x1);
        if (y1 <= y2) {
            this.gradient = true;
        } else {
            this.gradient = false;
        }
    }

    /**
     * Constructor for the Line.
     * @param f1 GeometricalForm used for the x and y start coordinates.
     * @param f2 GeometricalForm used for the x and y end coordinates.
     * @param color Color of the Point.
     */
    public Line(GeometricalForm f1, GeometricalForm f2, Color color) {
        super((f1.getX() > f2.getX() ? f1.getX() : f2.getX()), (f1.getY() > f2.getY() ? f1.getY() : f2.getY()), color);
        this.height = Math.abs(f2.getY()-f1.getY());
        this.width = Math.abs(f2.getX()-f2.getX());
        if (y1 <= y2) {
            this.gradient = true;
        } else {
            this.gradient = false;
        }
    }
    
    @Override
    public int getArea() {
        return 0;
    }
    
    @Override
    public void fill(Graphics g) {
        g.setColor(color);
        int x1 = this.x;
        int x2 = this.x + width;
        int y1;
        int y2;
        if (gradient = true) {
            y1 = this.y + height;
            y2 = this.y;
        } else {
            y1 = this.y;
            y2 = this.y + height;
        }
        drawLine(x1, y1, x2, y2)
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
        return Math.sqrt((Math.pow(width, 2)) + (Math.pow(height, 2)));
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
}
