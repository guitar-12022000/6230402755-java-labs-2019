/**
 This program is created for drive class 
 that contains a main method in Moveable class and Drawabl class.
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 16/1/2020
 */

package phutsay.preyanuch.lab5;

public class TestShape3 {
    public static void main(String[] args) {
        DrawableRectangle r1 = new DrawableRectangle();
        System.out.println("First drawable rectangle " + r1);
        System.out.println(r1.draw());
        r1.moveUp(3);
        r1.moveRight(2);
        System.out.println("After move 3 up and 2 to the right " + r1.draw());

        DrawableCircle c1 = new DrawableCircle(2, 3, 5, "Red", true);
        System.out.println("First drawable circle " + c1);
        System.out.println(c1.draw());
        c1.moveDown(3);
        c1.moveLeft(2);
        System.out.println("After move 3 down and 2 to the left" + c1.draw());
    }
}