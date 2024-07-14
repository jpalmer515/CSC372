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

    public String toString() {
        return "Student{" + name + ", " + rollno + ", " + address + "}";
    }
}

class CompareStudentName implements Comparator<Student> {

    @Override
    public int compare(Student StudentName1, Student StudentName2) {
        return StudentName1.name.compareTo(StudentName2.name);
    }
}

class CompareStudentRollNo implements Comparator<Student> {

    @Override
    public int compare(Student StudentRollNo1, Student StudentRollNo2) {
        return Integer.toString(StudentRollNo1.rollno).compareTo(Integer.toString(StudentRollNo2.rollno));
    }
}


