/**
 * Arthor: Preyanuch   Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 12/1/2020
 */

package phutsay.preyanuch.lab4;

import phutsay.preyanuch.lab4.StudentAndTeach.*;

public class TestPersonV3 {
    public static void main(String[] args) {
        Teacher onizuka = new Teacher("Onizuka", 185, 80, "1998-07-07", "social study", 15000);
        Student zuckerberg = new Student("Zuckerberg", 180, 25, "1984-05-14", "Computer Engineering", 4.00);
        System.out.println(onizuka);
        System.out.println(zuckerberg);
        onizuka.howOld();
        zuckerberg.howOld();
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
        PersonV2 mickey = new PersonV2("Mickey Mouse", 60, 25, "1982-01-01");
        System.out.println(mickey);
        mickey = new Student("Mickey Mouse", 60, 25, "1982-01-01", "Animation", 3.0);
        System.out.println(mickey);
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
        mickey.compareAge(onizuka);
    }
}