package geometri;

import java.awt.*;


public class Line extends GeometricalShape {

    /**
     * Height of the surrounding Rectangle.
     */
    private int height;
    /**
     * Width of the surrounding Rectangle.
     */
    private int width;
    /**
     * Positive or negative gradient of the line.
     */
    private boolean gradientIsPositive;

    /**
     * Constructor for the Line.
     *
     * @param x1    Placement of the start of the Line on the X-axis.
     * @param y1    Placement of the start of the Line on the Y-axis.
     * @param x2    Placement of the end of the Line on the Y-axis.
     * @param y2    Placement of the end of the Line on the Y-axis.
     * @param color Color of the Point.
     */
    public Line(int x1, int y1, int x2, int y2, Color color) throws IllegalPositionException {
        super((x1 < x2 ? x1 : x2), (y1 < y2 ? y1 : y2), color);
        this.height = Math.abs(y2 - y1);
        this.width = Math.abs(x2 - x1);
        calculateGradientIsPositive(x1, y1, x2, y2);
        if (x < 0 || y < 0) {
            throw new IllegalPositionException("Can't place on negative coordinate(s)");
        }
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
        this.height = Math.abs(f2.getY() - f1.getY());
        this.width = Math.abs(f2.getX() - f2.getX());
        calculateGradientIsPositive(f1.getX(), f1.getY(), f2.getX(), f2.getY());
    }

    private void calculateGradientIsPositive(int x1, int y1, int x2, int y2) {
        if (x1 < x2) {
            if (y1 < y2) {
                this.gradientIsPositive = true;
            } else {
                this.gradientIsPositive = false;
            }
        } else {
            if (y1 < y2) {
                this.gradientIsPositive = false;
            } else {
                this.gradientIsPositive = true;
            }
        }
    }

    /**
     * Get the boolean gradient value of the Line.
     *
     * @return Returns true if the gradient of the line is positive.
     */
    public boolean getGradientIsPositive() {
        return gradientIsPositive;
    }

    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public void fill(Graphics g) {
        int x1 = this.x;
        int x2 = this.x + width;
        int y1;
        int y2;
        if (gradientIsPositive = false) {
            y1 = this.y + height;
            y2 = this.y;
        } else {
            y1 = this.y;
            y2 = this.y + height;
        }
        g.setColor(color);
        g.drawLine(x1, y1, x2, y2);
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
        return (int) Math.sqrt((Math.pow(width, 2)) + (Math.pow(height, 2)));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Line)) return false;
        if (this == o) return true;

        Line other = (Line) o;
        if (this.width != other.getWidth()) return false;
        if (this.height != other.getHeight()) return false;
        if (this.gradientIsPositive != other.getGradientIsPositive()) return false;
        if (this.color.hashCode() != other.getColor().hashCode()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int prime = 37;
        int result = 7;
        result = prime * result + width;
        result = prime * result + height;
        result = prime * result + height;
        result = prime * result + ((gradientIsPositive == false) ? 0 : 1);
        return result;
    }
}
