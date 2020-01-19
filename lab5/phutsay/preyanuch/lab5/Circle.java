/**
 * Class Circle is a class that extends Shape class.(Subclass)
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 16/1/2020
 */

package phutsay.preyanuch.lab5;

public class Circle extends Shape {
    protected double radius;

    public Circle() {//constructor1
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {//constructor2
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {//constructor
        super(color, filled);//call color and filled from Shape class
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {// abstract method must implement all in subclass not parent class(Shape)
        double area = Math.PI * Math.pow(radius, 2);
        return Math.round(area * 100.0) / 100.0;
    }

    public double getPerimeter() {// abstract method must implement all in subclass not parent class(Shape)
        double perimeter = 2 * Math.PI * radius;
        return Math.round(perimeter * 100.0) / 100.0;
    }

    public String toString() {//convert to string
        return "Color:" + color + ", Filled:" + filled + ", radius:" + radius;
    }

}
