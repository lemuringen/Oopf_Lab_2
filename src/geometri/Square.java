package geometri;

import java.awt.*;

public class Square extends GeometricalShape {

    /**
     * Side of the Square.
     */
    private int side;

    /**
     * Constructor for the Square.
     *
     * @param x     Placement of the Square on the X-axis.
     * @param y     Placement of the Square on the Y-axis.
     * @param side  Side of the Square.
     * @param color Color of the Square.
     */
    public Square(int x, int y, int side, Color color) throws IllegalPositionException {
        super(x, y, color);
        if (x < 0 || y < 0) {
            throw new IllegalPositionException("Can't place on negative coordinate(s)");
        }
        this.side = side;
    }

    /**
     * Constructor for the Square.
     *
     * @param f     GeometricalForm used for x and y coordinates.
     * @param side  Side of the Square.
     * @param color Color of the Square.
     */
    public Square(GeometricalForm f, int side, Color color) {
        super(f.getX(), f.getY(), color);
        this.side = side;
    }

    @Override
    public void fill(Graphics g) {
        g.fillRect(x, y, side, side);
    }

    @Override
    public int getArea() {
        return (side * side);
    }


    @Override
    public int getWidth() {
        return side;
    }

    @Override
    public int getHeight() {
        return side;
    }

    @Override
    public int getPerimeter() {
        return (4 * side);
    }

    /**
     * Get side of the Square.
     *
     * @return the side of the Square.
     */
    public int getSide() {
        return this.side;
    }

    @Override
    public int hashCode() {
        int prime = 17;
        int result = 9;
        result = prime * result + side;
        result = prime * result + color.hashCode();
        return result;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Square)) return false;
        if (this == o) return true;

        Square other = (Square) o;
        if (this.side != other.getSide()) return false;
        if (this.area != other.getArea()) return false;
        if (this.perimeter != other.getPerimeter()) return false;
        if (this.color.hashCode() != other.getColor().hashCode()) return false;
        return true;
    }
}
