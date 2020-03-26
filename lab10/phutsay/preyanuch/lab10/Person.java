package phutsay.preyanuch.lab10;

import java.time.*;
import java.io.*;

public class Person implements Serializable {
    private static final long serialVersionUID = -8254314637502017589L;
    
    protected String name;
    protected double weight, height;
    protected LocalDate dob;
    protected Period p;

    // constructor
    public Person(String name, double weight, double height, LocalDate dob) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;  // set new name
    }

    public String getName() {
        return name;  // get name value
    }

    public void setWeight(double weight) {
        this.weight = weight;  // set new weight
    }

    public double getWeight() {
        return weight;  // get wegiht value
    }

    public void setHeight(double height) {
        this.height = height;  // set new height
    }

    public double getHeight() {
        return height;  // get height value
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;  // set new birtday
    }

    public LocalDate getDob() {
        return dob;  // get birtday value
    }
    //get age of each  person
    public String getAge() {
        LocalDate today = LocalDate.now();
        this.p = Period.between(dob, today);  // calculate person's age
        return p.getYears() + " years " + p.getMonths() + 
        " months " + p.getDays() + " days";
    }
    //convert and return value
    public String toString() {
        return this.name + " is "  + getAge() + ", has weight as " 
        + this.weight + " kg., and height as " + this.height + " cm.";
    }
}