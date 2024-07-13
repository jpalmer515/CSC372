import java.util.ArrayList;
import java.util.Comparator;

public class Student {
    
    int rollno;
    String name;
    String address;

    Student(String name, int rollno, String address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    public static void main(String[] args) {

        ArrayList<Student> StudentList = new ArrayList<>();

        Student student1 = new Student("Harrison Martin", 100, "2717 Hill Street");
        Student student2 = new Student("Evangeline Park", 101, "4344 Dark Hollow Road");
        Student student3 = new Student("Brenda Dale", 102, "4061 Cottonwood Lane");
        Student student4 = new Student("Santiago Beltran", 103, "634 Gladwell Street");
        Student student5 = new Student("Nathan Middleton", 104, "3727 Mount Street");
        Student student6 = new Student("Mabel Mosley", 105, "4571 Ryder Avenue");
        Student student7 = new Student("Amelie Evans", 106, "4211 Terra Cotta Street");
        Student student8 = new Student("Leanne Crane", 107, "2125 Walnut Avenue");
        Student student9 = new Student("Ruby Payne", 108, "3175 Poplar Street");
        Student student10 = new Student("Sandra Santana", 109, "48 Redbud Drive");

        StudentList.add(student1);
        StudentList.add(student2);
        StudentList.add(student3);
        StudentList.add(student4);
        StudentList.add(student5);
        StudentList.add(student6);
        StudentList.add(student7);
        StudentList.add(student8);
        StudentList.add(student9);
        StudentList.add(student10);

    }
}

class CompareStudentName implements Comparator<Student> {

    @Override
    public int compare(Student comparisonVariable1, Student comparisonVariable2) {
        return comparisonVariable1.name.compareTo(comparisonVariable2.name);
    }
}

class CompareStudentRollNo implements Comparator<Student> {

    @Override
    public int compare(Student comparisonVariable1, Student comparisonVariable2) {
        return Integer.toString(comparisonVariable1.rollno).compareTo(Integer.toString(comparisonVariable2.rollno));
    }
}

// type variableName;
// type variableName = initial value;
// type variableName = newType.converstionfunction();
