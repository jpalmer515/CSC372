import java.util.ArrayList;
// import java.util.Arrays;

public class StudentDriver {
    
    ArrayList<Student> StudentList = new ArrayList<Student>();

    void StudentSortingAlgorithm() {

        int StudentListLength = StudentList.size();
        //     min
        //       i      j            
        //       0      1      2      3
        // [924454, 40735, 21108, 16981]
        // [40735, 924454, 21108, 16981]
        for (int i = 0; i < StudentListLength-1; i++) {

            int StudentListMinimumIndex = i;

            for (int j = i + 1; j < StudentListLength; j++) {
                // i = 0, minIndex = 0, j = 1
                if (StudentList.get(StudentListMinimumIndex).rollno < StudentList.get(j).rollno) {
                    //Keeping indices the same
                }
                else {
                    Student tempHolder;
                    tempHolder = StudentList.get(StudentListMinimumIndex);
                    StudentList.set(StudentListMinimumIndex, StudentList.get(j));
                    StudentList.set(j, tempHolder);
                }
                
            }
        }
    }
    /* StudentListLength = 4;
     1st Loop: i = 0; j = 1; 
     student1{rollno} < student2{rollno} = student2
     i = 0, 3 loops > 
     - s1 < s2 = 
     - s1 < s3
     - s1 < s4
     i = 1, 2 loops


     i = 2, 1 loops


     i = 3, 0 loops
     
     
     
     */

    public void main(String[] args) {
        // Make Students
        Student student1 = new Student("Harrison Martin", 16981, "2717 Hill Street");
        Student student2 = new Student("Evangeline Park", 40735, "4344 Dark Hollow Road");
        Student student3 = new Student("Brenda Dale", 924454, "4061 Cottonwood Lane");
        Student student4 = new Student("Santiago Beltran", 21108, "634 Gladwell Street");
        // Student student5 = new Student("Nathan Middleton", 26240, "3727 Mount Street");
        // Student student6 = new Student("Mabel Mosley", 92260, "4571 Ryder Avenue");
        // Student student7 = new Student("Amelie Evans", 01621, "4211 Terra Cotta Street");
        // Student student8 = new Student("Leanne Crane", 86676, "2125 Walnut Avenue");
        // Student student9 = new Student("Ruby Payne", 63541, "3175 Poplar Street");
        // Student student10 = new Student("Sandra Santana", 63682, "48 Redbud Drive");

        // Put Students in List
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


        // Sort students by name
        StudentSortingAlgorithm(CompareStudentName);
        StudentSortingAlgorithm(CompareStudentRollNo);
    }
}

