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

