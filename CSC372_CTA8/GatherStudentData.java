package CSC372_CTA8;

import java.util.*;

public class GatherStudentData {
    
    Scanner StudentDataInput = new Scanner(System.in);
    LinkedList<StudentData> ListedStudentData = new LinkedList<StudentData>();

    public void main(String[] args) {

        Scanner StudentDataInput = new Scanner(System.in);

        LinkedList<StudentData> ListedStudentData = new LinkedList<StudentData>();
        
        String name;
        String address;
        Double gpa;

        StudentData newStudent1 = new StudentData(name, address, gpa);

        System.out.println("Please enter a FIRST and LAST name");
        name = newStudent1.setName(StudentDataInput.nextLine());
        
        System.out.println("Please enter an address");
        address = newStudent1.setAddress(StudentDataInput.nextLine());
        
        System.out.println("Please enter a GPA in the format of X.X, where X is a whole number");
        gpa = newStudent1.setGpa(StudentDataInput.nextDouble());

        System.out.println(newStudent1);
        //for loop here

        System.out.println();

    }
}

//create a linked list to store the student data
//create a for loop to prompt a user to enter the appropriate data
//create a checker to validate the numeric data being entered for gpa
//output linked list in ascending order by name, could probably use the collections library
//output to text file