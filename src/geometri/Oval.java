package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-16.
 */
public class Oval extends GeometricalShape{
    private int width;
    private int height;

    public Oval(int x, int y, int width, int height, Color color) throws IllegalPositionException {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public Oval(GeometricalForm f, int width, int height, Color color) {
        super(f.getX(), f.getY(), color);
        this.width = width;
        this.height = height;
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
    public int hashCode(){
        return 0;
    }

}