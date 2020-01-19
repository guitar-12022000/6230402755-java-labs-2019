/**
 * Class Rectangle inherited from Shape
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 16/1/2020
 */

package phutsay.preyanuch.lab5;

class Rectangle extends Shape {
  protected double width;
  protected double length;

  public Rectangle() {//constructor1
    super();
    this.width = 1.0;
    this.length = 2.0;
  }

  public Rectangle(double width, double length) {//constructor2
    super();
    this.width = width;
    this.length = length;
  }

  public Rectangle(double width, double length, String color, boolean filled) {//constructor3
    super(color, filled);
    this.width = width;
    this.length = length;
  }

  public double getWidth() {//method for return width from constructor2 or constructor3
    return width;
  }

  public void setWidth(double width) {//method for set width that's gotten from constructor2 or constructor3
    this.width = width;
  }

  public double getLength() {//method for return length from constructor2 or constructor3
    return length;
  }

  public void setLength(double length) {//method for set length that's gotten from constructor2 or constructor3
  }

  public double getArea() {// abstract method must implement all in subclass not parent class(Shape)
    return Math.round((width * length * 100.0) / 100.0);
  }

  public double getPerimeter() {// abstract method must implement all in subclass not parent class(Shape)
    double perimet = 2 * (length + width);
    return Math.round((perimet * 100.0) / 100.0);
  }

  public String toString() {
    return "Color:" + getColor() + ", Filled:" + isFilled() + ", width:" + getWidth() + ", lenght:" + getLength();
  }
}

