import java.util.Comparator;

public class Student {
    
    int rollno;
    String name;
    String address;

    //Constructor
    Student(String name, int rollno, String address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    public String toString() {
        return "Student{" + name + ", " + rollno + ", " + address + "}";
    }
}

class CompareStudentName implements Comparator<Student> {

    @Override
    public int compare(Student studentVariable1, Student studentVariable2) {
        return studentVariable1.name.compareTo(studentVariable2.name);
    }
}

class CompareStudentRollNo implements Comparator<Student> {

    @Override
    public int compare(Student studentVariable1, Student studentVariable2) {
        return Integer.toString(studentVariable1.rollno).compareTo(Integer.toString(studentVariable2.rollno));
    }
}


