package CSC372_CTA8;

import java.util.*;

public class StudentData {
    
    private String name;
    private String address;
    private double gpa;

    StudentData(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public void setStudentData(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }
    
    //Getters
    public String getName(String name) {
        return this.name;
    }
    public String getAddress(String address) {
        return this.address;
    }
    public Double getGpa(Double gpa) {
        return this.gpa;
    }

    public String toString() {
        return name + ", " + address + ", " + gpa;
    }

    //for loop will have to create a new studentdata object and then add the parameters to the object from the user input
    //can the for loop iterate and add to an index for the object? student1(0), student1(1)
    //how does a for loop create a new student object iterating through numbers? student1, student2, etc

    //create main method and for loop in this class. 
    //private variables can only be accessed by this class, thus adding the for loop here should allow them to be accessed

    //can a class extends another class allow the other class to access the private variables?
}
