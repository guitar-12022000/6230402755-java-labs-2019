package phutsay.preyanuch.lab4;

import java.text.DecimalFormat;
import java.lang.Math;

public class Person {
    private String name;
    private double height;
    private double weight;
    static int numberOfPerson = 0;

    private static DecimalFormat df2 = new DecimalFormat("0.00");

    public Person() {
        name = "unknown";
        weight = 0.0;
        height = 0;
        numberOfPerson++;
    }

    public Person(String name) {
        this.name = name;// not unknown
        weight = 0.0;
        height = 0;
        numberOfPerson++;
    }

    public Person(String name, double height, double weight) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        numberOfPerson++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setWeigt(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return "name=" + name + " height=" + height + " cm." + " weight=" + weight + " kg.";
    }

    public static int getNumberOfPerson() {
        return numberOfPerson;
    }

    public String getBMI() {
        double bmi = (weight / Math.pow((height / 100), 2));
        return String.valueOf(df2.format(bmi));
    }

}
