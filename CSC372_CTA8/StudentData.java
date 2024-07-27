package CSC372_CTA8;

public class StudentData {
    
    private String name;
    private String address;
    private double gpa;

    StudentData(String name, String address, double gpa) {
        this.name = name;
        this.address = address;
        this.gpa = gpa;
    }

    public String toString() {
        return name + ", " + address + ", " + gpa;

    //create main method and for loop in this class. 
    //private variables can only be accessed by this class, thus adding the for loop here should allow them to be accessed

    }
}
