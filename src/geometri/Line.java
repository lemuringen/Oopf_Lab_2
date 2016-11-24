package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Line extends GeometricalShape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line(int x1, int y1, int x2, int y2, Color color) throws IllegalPositionException {
        super((x1>x2?x1:x2), (y1>y2?y1:y2), color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;


    }

    public Line(GeometricalForm f1, GeometricalForm f2, Color color) {
        super((f1.getX()>f2.getX()?f1.getX():f2.getX()), (f1.getY()>f2.getY()?f1.getY():f2.getY()), color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


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

}
