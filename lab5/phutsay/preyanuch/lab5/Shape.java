/**
 * This is Shape class that's parent's Circle
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 16/1/2020
 */

package phutsay.preyanuch.lab5;

abstract class Shape {// abstract classes cannot be instantiated, but they can be subclassed.

    protected String color;
    protected boolean filled;

    public Shape() {// constructor1
        color = "White";
        filled = false;
    }

    public Shape(String color, boolean filled) { //constructor2
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;

    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();//An abstract method is declared without an implementation

    abstract double getPerimeter();//An abstract method is declared without an implementation

    @Override
    public String toString() {
        return "Color:" + color + ", Filled" + filled;
    }
}
