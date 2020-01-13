/** 
 * Arthor: Preyanuch   Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 12/1/2020
 */

package phutsay.preyanuch.lab4;

public class TestPersonV2 {
    public static void main(String[] args) {
        PersonV2 doraemon = new PersonV2("Doraemon", 100, 100, "2017-05-26");
        PersonV2 nobita = new PersonV2("Nobita", 120, 25, "2012-01-06");
        System.out.println(doraemon);
        System.out.println(nobita);
        doraemon.howOld();
        nobita.howOld();
        doraemon.compareAge(nobita);
        nobita.compareAge(doraemon);
        doraemon.isBirthday();
        nobita.isBirthday();
        System.out.println(Person.getNumberOfPerson() + " persons have been created.");
    }
}