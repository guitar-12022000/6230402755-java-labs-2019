/**
 * This program is to create PersonV2 class. It extends Person class
 * by adding person's birthdate, calculate its old, compare ages
 * Arthor: Preyanuch   Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 11/1/2020
 */
package phutsay.preyanuch.lab4;

import java.time.*;

public class PersonV2 extends Person { //extends that's mean PersonV2(subclass) inherit from Person(superclass)
    private LocalDate dob; //LocalDate stores a date without a time. like '2010-12-03'

    public PersonV2(String name, double height, double weight, String dob) {
        super(name, height, weight); //super will call variable from Person class, use super(parameters)
        this.dob = LocalDate.parse(dob);
    }
    public LocalDate getDOB() {
        return dob;
    }
    public void setDOB(LocalDate dob) {
        this.dob = dob;
    }
    public void isBirthday() {
        boolean todayBD = MonthDay.from(dob).equals(MonthDay.from(LocalDate.now()));
        if (todayBD == true) {
            System.out.println("Today is " + getName() + "' s Birthday.");
        } else {
            System.out.println("Today is NOT " + getName() + "'s Birthday.");
        }
    }
    public void howOld() {
        LocalDate today = LocalDate.now();
        Period p = Period.between(dob, today);  // find person's age
        System.out.println(getName() + " is " + p.getYears() + " years " + p.getMonths() + " months and " + p.getDays() + " days old.");
    }
    public void compareAge(PersonV2 name) {
        LocalDate nameBD = name.getDOB();
        Period p;
        if (dob.compareTo(nameBD) > 0) {
            p = Period.between(nameBD, dob);  // find difference between 2 ages
            System.out.println(name.getName() + " is " + p.getYears() + " years " + p.getMonths() + " months and " + p.getDays() + " days older than " + getName());
        } else if (dob.compareTo(nameBD) < 0) {
            p = Period.between(dob, nameBD);  // find difference between 2 ages
            System.out.println(getName() + " is " + p.getYears() + " years " + p.getMonths() + " months and " + p.getDays() + " days older than " + name.getName());
        }
    }
    public String toString() {
        return "name=" + getName() + ", height=" + getHeight() + " cm. weight=" + getWeight() + " kg., Birthday=" + getDOB();
    } 
 } 

