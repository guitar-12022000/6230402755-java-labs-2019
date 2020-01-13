/**
 * This program is to create Person class. It has name, weight, height
 * of the person and calculate  BMI
 * 
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 6/1/2020
 */

package phutsay.preyanuch.lab4;

import java.text.DecimalFormat;
import java.lang.Math;

public class Person {
    private String name;
    private double height;
    private double weight;
    static int numberOfPerson = 0;

    private static DecimalFormat df2 = new DecimalFormat("0.00");// to convert to 2 decimal

    public Person() { // This is constructor
        name = "unknown";
        weight = 0.0;
        height = 0;
        numberOfPerson++; // increment by 1
    }

    public Person(String name) { //This is constructor
        this.name = name;
        weight = 0.0;
        height = 0;
        numberOfPerson++;
    }

    public Person(String name, double height, double weight) { //This is constructor
        this.name = name;
        this.weight = weight;
        this.height = height;
        numberOfPerson++;
    }

    public String getName() { 
        return name;
    }

    public void setName(String name) {
        this.name = name; // getting a new value of name
    }

    public double getHeight() {
        return height;
    }

    public void setWeigt(double height) {
        this.height = height; // getting a new value of height
    }

    public double getWeight() { 
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight; // getting a new value of weight
    }

    public String toString() { 
        return "name=" + name + " height=" + height + " cm." + " weight=" + weight + " kg.";
    }

    public static int getNumberOfPerson() {
        return numberOfPerson;
    }
// 
    public String getBMI() {
        double bmi = (weight / Math.pow((height / 100), 2));
        return String.valueOf(df2.format(bmi));
    }

}
