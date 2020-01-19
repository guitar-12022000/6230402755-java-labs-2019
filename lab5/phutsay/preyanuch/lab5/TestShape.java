/**
 * This is TestShape class that's created for run Circle class that's extends Shape class.
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 16/1/2020
 */

package phutsay.preyanuch.lab5;

class TestShape {
    public static void main(String[] args) {
        Circle c1 = new Circle();// from constructor1 in Circle class, c1 have radius = 1.0,
        System.out.println(c1);
        System.out.println("Circle 1 : Area = " + c1.getArea() + " Perimeter = " + c1.getPerimeter());

        if (c1.isFilled())
            System.out.println("Circle is filled.");
        else
            System.out.println("Circle is Not filled");

        Circle c2 = new Circle(2.0);//from constructor in Circle class
        System.out.println(c2);
        System.out.println("Circle 2 : Area = " + c2.getArea() + " Perimeter = " + c2.getPerimeter());

        Circle c3 = new Circle(3, "Red", true);//from constructor in Circle class
        System.out.println(c3);
        System.out.println("Circle 3 : Area = " + c3.getArea() + " Perimeter = " + c3.getPerimeter());
        if (c3.isFilled())
            System.out.println("Circle is filled.");
        else
            System.out.println("Circle is Not filled");
    }
}
