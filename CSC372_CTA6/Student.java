import java.util.ArrayList;

public class Student {
    
    int rollno;
    String name;
    String address;

    Student(String name, int rollno, String address) {
        this.name = StudentName;
        this.rollno = Studentrollno;
        this.address = Studentaddress;
    }

    public static void main(String[] args) {

        Arraylist<Student> StudentList = new ArrayList<>();
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

    }

    public static Comparator<Student> StudentNameComparator = new Comparator<Student>() {

        @Override
        public String compare(Student student1, Student student10) {
            return String.compare(student1.getname(), student10.getname());
        }
    }

    public static Comparator<Student> StudentIDComparator = new Comparator<Student>() {

        @Override
        public int compare(Student student1, Student student10) {
            return Integer.compare(student1.getrollno(), student10.getrollno());
        }
    }
}
