/**
 * This program is to create Student calss and Teacher class, 
 * it extends PersonV2 class 
 * Teacher class has salary and teaching subject 
 * Student class has GPA and major
 * Arthor: Preyanuch Phutsay
 * ID: 623040275-5
 * Sec: 2
 * Date: 12/1/2020
 */


package phutsay.preyanuch.lab4;

public class StudentAndTeach {

    public static class Student extends PersonV2 {
        private String major;
        private double GPA;
    
        public Student(String name, double height, double weight, String dob, String major, double GPA) {
            super(name, height, weight, dob);  // super will call variable from PersonV2 class, use super(parameters)
            this.major = major;
            this.GPA = GPA;
        }
        public String getMajor() {
            return major;
        }
        public void setMajor(String major) {
            this.major = major;  // getting new major value
        }
        public double getGPA() {
            return GPA;
        }
        public void setGPA(double GPA) {
            this.GPA = GPA;  // getting new GPA value
        }
        public String toString() {
            return "name=" + getName() + ", height=" + getHeight() + " cm. weight=" + getWeight() + " kg., Birthday=" + getDOB() + 
                    ", major=" + getMajor() + ", GPA=" + getGPA();
        }
    
    }
    
    public static class Teacher extends PersonV2 {
        private String teachingSubject;
        private int salary;
    
        public Teacher(String name, double height, double weight, String dob, String teachingSubject, int salary) {
            super(name, height, weight, dob);  // super will call variable from PersonV2 class, use super(parameters)
            this.teachingSubject = teachingSubject;
            this.salary = salary;
        }
        public String getTeachingSubject() {
            return teachingSubject;
        }
        public void setTeachingSubject(String teachingSubject) {
            this.teachingSubject = teachingSubject;  // getting new value of teachingSubject
        }
        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary) {
            this.salary = salary;  //getting new salary value
        }
        public String toString() {
            return "name=" + getName() + ", height=" + getHeight() + " cm. weight=" + getWeight() + " kg., Birthday=" + getDOB() + 
            ", teachingSubject=" + getTeachingSubject() + ", salary=" + getSalary();
        }
    }
    }