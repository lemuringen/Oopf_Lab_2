package geometri;

import java.awt.*;


public class Oval extends GeometricalShape{
    
    /** Width of the Oval.*/
    private int width;
    /** Height of the Oval.*/
    private int height;
   
    /**
     * Constructor for the Oval.
     * @param x X-coordinate for the left uppermost corner of the narrowest possible Rectangle surrounding the Oval.
     * @param y Y-coordinate for the left uppermost corner of the narrowest possible Rectangle surrounding the Oval.
     * @param width Width of the Oval.
     * @param height Height of the Oval.
     * @param color Color of the Oval.
     */
    public Oval(int x, int y, int width, int height, Color color) throws IllegalPositionException {
        super(x, y, color);
        if (x < 0 || y < 0) {
            throw new IllegalPositionException("Can't place on negative coordinate(s)");
        }
        this.width = width;
        this.height = height;
    }
    
    /**
     * Constructor for the Oval.
     * @param f GeometricalForm used for x and y coordinates.
     * @param width Width of the Oval.
     * @param height Height of the Oval.
     * @param color Color of the Oval.
     */
    public Oval(GeometricalForm f, int width, int height, Color color) {
        super(f.getX(), f.getY(), color);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public int getArea() {
        return (int)(width * height * Math.PI);
    }
    
    @Override
    public void fill(Graphics g) {
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.width, this.height);
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
        return (int)(2 * Math.PI * Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)) / 2));
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 5;
        result = prime * result + width;
        result = prime * result + height;
        result = prime * result +  color.hashCode();
        return result;
    }
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Oval)) return false;
        if (this == o) return true;

        Oval other = (Oval) o;
        if (this.width != other.getWidth()) return false;
        if (this.height != other.getHeight()) return false;
        if (this.area != other.getArea()) return false;
        if (this.perimeter != other.getPerimeter()) return false;
        if (this.color.hashCode() != other.getColor().hashCode()) return false;
        return true;
    }
}
