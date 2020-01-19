/**
 * DrawableRectangle inherited from Rectangle.
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 16/1/2020
 */

package phutsay.preyanuch.lab5;

public class DrawableRectangle extends Rectangle implements Drawable, Moveable {
    private double x, y;

    public DrawableRectangle() {
        super(); 
        x = 0.0;
        y = 0.0;
    }

    public DrawableRectangle(double x, double y) {
        super(); 
        this.x = x;
        this.y = y;
    }

    public DrawableRectangle(double x, double y, double width, double length, String color, boolean filled) {
        super(width, length, color, filled); 
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x; 
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y; 
    }

    public String toString() {
        return "Color:" + getColor() + ", Filled:" + isFilled() + ", width:" + getWidth() + ", length:" + getLength();
    }

    public void moveUp(int a) {
        y += a;
    } 

    public void moveDown(int a) {
        y -= a;
    }

    public void moveRight(int b) {
        x += b; 
    }

    public void moveLeft(int b) {
        x -= b; 
    }

    public String draw() {
        return "draw a rectangle with top left corner at (" + getX() + "," + getY() + ") with width=" + getWidth()
                + " length=" + getLength();
    }
}