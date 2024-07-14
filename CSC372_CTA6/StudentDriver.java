import java.util.ArrayList;

public class StudentDriver {
    
    static ArrayList<Student> StudentList = new ArrayList<Student>();

    static void StudentNameSortingAlgorithm(Student CompareStudentName) {

        int StudentListLength = StudentList.size();

        for (int i = 0; i < StudentListLength-1; i++) {

            int StudentListMinimumIndex = i;

            for (int j = i + 1; j < StudentListLength; j++) {

                if (CompareStudentName.compare(StudentList.get(j).name, StudentList.get(StudentListMinimumIndex).name) < 0) {
                    StudentListMinimumIndex = j;
                }
            }
            Student tempHolder= StudentList.get(StudentListMinimumIndex);
            StudentList.set(StudentListMinimumIndex, StudentList.get(i));
            StudentList.set(i, tempHolder);
        }
    }

    public static void main(String[] args) {

        Student newStudent1 = new Student("Harrison Martin", 16981, "2717 Hill Street");
        Student newStudent2 = new Student("Evangeline Park", 40735, "4344 Dark Hollow Road");
        Student newStudent3 = new Student("Brenda Dale", 924454, "4061 Cottonwood Lane");
        Student newStudent4 = new Student("Santiago Beltran", 21108, "634 Gladwell Street");
        Student newStudent5 = new Student("Nathan Middleton", 26240, "3727 Mount Street");
        Student newStudent6 = new Student("Mabel Mosley", 92260, "4571 Ryder Avenue");
        Student newStudent7 = new Student("Amelie Evans", 11621, "4211 Terra Cotta Street");
        Student newStudent8 = new Student("Leanne Crane", 86676, "2125 Walnut Avenue");
        Student newStudent9 = new Student("Ruby Payne", 63541, "3175 Poplar Street");
        Student newStudent10 = new Student("Sandra Santana", 63682, "48 Redbud Drive");

        // Put Students in List
        StudentList.add(newStudent1);
        StudentList.add(newStudent2);
        StudentList.add(newStudent3);
        StudentList.add(newStudent4);
        StudentList.add(newStudent5);
        StudentList.add(newStudent6);
        StudentList.add(newStudent7);
        StudentList.add(newStudent8);
        StudentList.add(newStudent9);
        StudentList.add(newStudent10);

        // System.out.println(StudentList);
        for (Student student: StudentList) System.out.println(student);
        System.out.println("-----------------------------------------------\n");
        StudentNameSortingAlgorithm();
        for (Student student: StudentList) System.out.println(student);
    }
}

