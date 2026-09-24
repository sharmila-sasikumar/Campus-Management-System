package Com.Campus.App;
import java.util.Scanner;
import Com.Campus.Model.Student;
import Com.Campus.Service.StudentService;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       //inputs from user
       System.out.println("enter the student id");
         int studentId = scanner.nextInt();
         System.out.println("enter the student name");
         String studentName = scanner.next();
         System.out.println("enter the student age");
            int studentAge = scanner.nextInt();
            System.out.println("enter the student department");
            String studentDepartment = scanner.next();
            System.out.println("enter the number of subjects");
            int numSubjects = scanner.nextInt();
            int[] marks = new int[numSubjects];    
            System.out.println("enter the marks of " + numSubjects + " subjects"); 
            for (int i = 0; i < numSubjects; i++) {
                System.out.println("enter the marks of subject"+(i+1));
                marks[i] = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character after reading an integer
            }
            Student student = new Student(studentId, studentName, studentAge, studentDepartment, marks);
            student.displayStudentInfo(true);
            Student.displayStudentCount();
            StudentService studentService = new StudentService();
            studentService.displayReportCard(student);
            scanner.close(); 
}
}
