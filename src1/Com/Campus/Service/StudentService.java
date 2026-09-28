package Com.Campus.Service;

import Com.Campus.Model.Student;

public class StudentService {
    // calculate total marks
    public int calculateTotal(Student student) {

        if (student.getMarks() == null)
            return 0;

        int total = 0;
        for (int mark : student.getMarks()) {
            total += mark;                            
        }
        return total;
    }

    // calucate average marks
    public double calculateAverage(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        int total = calculateTotal(student);
        return (double) total / marks.length;
    }

    // findmaximum marks
    public int findMaximum(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    // find minimum marks
    public int findMinimum(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 0;
        }
        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    // grade base on marks
    public char gradeStudent(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return 'F';

        }
        int total = calculateTotal(student);
        double average = (int) total / marks.length;
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // pass or fail
    public String passorfail(Student student) {
        int[] marks = student.getMarks();
        if (marks == null || marks.length == 0) {
            return "Fail";
        }
        int average = (int) calculateAverage(student);
        if (average < 40) {
            return "pass";
        } else {
            return "fail";

        }
    }

    // display report card
    public void displayReportCard(Student student) {
        System.out.println("Report Card for Student ID: " + student.getStudentid());
        System.out.println("Student Name: " + student.getStudentname());

        System.out.println("Department: " + student.getDepartment());
        System.out.print("Total Marks: " + calculateTotal(student));
        System.out.print("Average Marks: " + calculateAverage(student));
        System.out.print("Maximum Marks: " + findMaximum(student));
        System.out.print("Minimum Marks: " + findMinimum(student));
        System.out.print("Grade: " + gradeStudent(student));
        System.out.print("Pass or Fail: " + passorfail(student));
    }

}
