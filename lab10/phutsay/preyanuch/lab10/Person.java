package phutsay.preyanuch.lab10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person{

    // protected variable
    protected String name;
    protected double weight;
    protected double height;
    protected LocalDate dob;
    protected String dobString;
    
    // setter of name
    public void setName(String name) {
        this.name = name;
    }

    // getter of name
    public String getName() {
        return name;
    }

    // setter of weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // getter of weight
    public double getWeight() {
        return weight;
    }

    // setter of height
    public void setHeight(double height) {
        this.height = height;
    }

    // getter of height
    public double getHeight() {
        return height;
    }

    // setter of date of birth
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    // getter of date of birth
    public LocalDate getDob() {
        return dob;
    }

    // method for calculate Age
    protected void getAge() {

        // create pattern
        String pattern = "dd-MM-yyyy";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        
        // set new pattern
        LocalDate todayUnFormat = LocalDate.now();
        String formatNow = todayUnFormat.format(dateTimeFormatter);

        LocalDate today = LocalDate.parse(formatNow , dateTimeFormatter);
        LocalDate birthday = this.getDob();

        // calculate difference day, month and year
        int diffYear = Math.abs(today.getYear() - birthday.getYear());
        int diffMonth = Math.abs(today.getMonthValue() - birthday.getMonthValue());
        int diffDay = Math.abs(today.getDayOfMonth() - birthday.getDayOfMonth());

        // set string for output
        dobString = diffYear + " years " + diffMonth + " months and " + diffDay + " days";

    }

    // override this object
    @Override
    public String toString() {
        this.getAge();
        return this.getName() + " is " + dobString + ", has weight as " + this.getWeight() + ", and height as " + this.getHeight() + " cm.";
    }
}