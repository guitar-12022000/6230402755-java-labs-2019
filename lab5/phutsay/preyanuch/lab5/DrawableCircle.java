/**
 *  DrawableCircle inherited from Circle and implements Drawable and Movable
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 16/1/2020
 */

package phutsay.preyanuch.lab5;

public class DrawableCircle extends Circle implements Drawable, Moveable {
    private double x;
    private double y;

    public DrawableCircle() {//constructor1
        super();
        this.x = 0.0;
        this.y = 0.0;
    }

    public DrawableCircle(double x, double y) {//constructor2
        super();
        this.x = x;
        this.y = y;
    }

    public DrawableCircle(double x, double y, double radius, String color, boolean filled) {//constructor3
        super(radius, color, filled);
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
        return "Color:" + getColor() + ", Filled:" + isFilled() + ", radius:" + getRadius();
    }

    public void moveUp(int a) {
        y += a;
    }

    public void moveDown(int a) {
        y -= a;
    }

    public void moveLeft(int b) {
        x -= b;
    }

    public void moveRight(int b) {
        x += b;
    }

    public String draw() {
        return "draw a circle with the center at (" + getX() + "," + getY() + ") with radius=" + getRadius();
    }
}
