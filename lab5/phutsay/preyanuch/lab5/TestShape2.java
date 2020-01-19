/**
 * This is TestShape2 class that's created for run Rectangle class and Circle class, which extends Shape class.
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 16/1/2020
 */

package phutsay.preyanuch.lab5;

public class TestShape2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("First rectangle Area = " + r1.getArea() + " Perimeter = " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(2.0, 3.0, "Pink", true);
        System.out.println(r2);
        System.out.println("Second rectangle Area = " + r2.getArea() + " Perimeter = " + r2.getPerimeter());

        Shape s1;
        s1 = new Circle(2.0, "Red", false);
        System.out.println("Circle : Area = " + s1.getArea() + " Perimeter = " + s1.getPerimeter());
       
        ((Circle) s1).setRadius(4.2);//set radius' s1Circle
        System.out.println("Circle has radius " + ((Circle) s1).getRadius());

        s1 = new Rectangle(3.0, 2.5, "Purple", true);
        System.out.println("Rectangle : Area = " + s1.getArea() + " Perimeter = " + s1.getPerimeter());//return new radius' s1Circle, use get method.
        
        ((Rectangle) s1).setWidth(8.1);//set width' s1Rectangle
        System.out.println("Rectangle has width of " + ((Rectangle) s1).getWidth() + " and height of "
                + ((Rectangle) s1).getLength());//
    }
}