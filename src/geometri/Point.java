package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Point extends GeometricalShape {


    public Point(int x, int y, Color color) throws IllegalPositionException {
        super(x, y, color);
    }

    public Point(GeometricalForm f, Color color)  {
        super(f.getX(), f.getY(), color);
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
    public void place(int x, int y) throws IllegalPositionException {

    }

    @Override
    public int hashCode(){
        return 0;
    }
}
