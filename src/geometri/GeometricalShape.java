package geometri;

import java.awt.*;

/**
 * Created by JesperU on 2016-11-22.
 */
public abstract class GeometricalShape implements GeometricalForm {
    protected int x;
    protected int y;
    public int getArea(){
        return 0;
    };

    /**
     * The method <tt>compareTo</tt> compares the area and perimeter of the forms
     * to decide if the given geometrical form is less or greater
     * than this object. If they have the same area, the
     * perimeter decides.
     *
     * @param f The geometrical form to compare with.
     * @return An integer smaller than 0 if this form
    is smaller than the form given as argument,
     *         0 if the sizes are equal, and a positive integer
    otherwise.
     */
    public int compareTo( GeometricalForm f ){
        return 0;
    }
    /**
     * Fill the area of the form at the position of the form
     * with the color of the form.
     *
     * @param g A graphic pen to draw with.
     */
    public abstract void fill( Graphics g );

    /**
     * Get the colour of this form.
     *
     * @return the colour of this form.
     */

    public Color getColor(){
        return null;
    }

    /**
     * Get the width of the surrounding rectangle of this form.
     *
     * @return the width.
     */
    public abstract  int getWidth();

    /**
     * Get the height of the surrounding rectangle of this form.
     *
     * @return the x coordinate.
     */
    public abstract int getHeight();

    /**
     * Get the x coordinate of the position of this form.
     *
     * @return the x coordinate.
     */
    public int getX(){
        return x;
    }

    /**
     * Get the y coordinate of the position of this form.
     *
     * @return the y coordinate.
     */
    public int getY(){
        return y;
    }

    /**
     * Move the form the given distances.
     * Check if the new coordinates are legal and
     * if they are, set the position to the new coordinates.
     * Otherwise an <tt>IllegalPositionException</tt> is thrown.
     * Origo is (0,0) and only positive coordinates are legal.
     *
     * @param dx move the form dx points to the right.
     * @param dy move the form dy points down.
     * @throws IllegalPositionException if any coordinate becomes negative.
     */
    public void move( int dx, int dy )
            throws IllegalPositionException{

    }

    /**
     * Get the perimeter of this form rounded
     * to closest integer.
     *
     * @return the computed perimeter.
     */
    public abstract int getPerimeter();

    /**
     * Place the form on given coordinates.
     * Check if the coordinates are legal.
     * Origo is (0,0) and only positive
     * coordinates are legal.
     * If they are legal, update the position with the new coordinates.
     * Otherwise an <tt>IllegalPositionException</tt> is thrown.
     *
     * @param x Distance right from origo.
     * @param y Distance down from origo.
     * @throws <tt>IllegalPositionException</tt> if any coordinate is negative.
     */
    public void place( int x, int y )
            throws IllegalPositionException{
    }
    public boolean equals(Object o){
        return false;
    }



} // interface GeometricalForm


