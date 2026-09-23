package Com.Campus.Model;

public class Student {
    // Encapsulation-data hiding
    // instance variables
    private String studentid;
    private String studentname;
    private int age;
    private String department;
    private int[] marks;

    // static variable
    private static int studentCount = 0;

    // default constructor
    public Student() {
        studentCount++;
    }

    // parameterized constructor
    public Student(String studentid, String studentname, int age, String department, int[] marks) {
        this.studentid = studentid;
        this.studentname = studentname;
        this.age = age;
        this.department = department;
        this.marks = marks;
        studentCount++;
    }

    // getters
    public String getStudentid() {
        return studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public int[] getMarks() {
        return marks;
    }

    // setters
    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // methods
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentid);
        System.out.println("Student Name: " + studentname);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.print("Marks: ");

    }

    public void displayStudentInfo(boolean showMarks) {
        displayStudentInfo();
        if (showMarks) {
            System.out.print("Marks: ");
            for (int mark : marks) {
                System.out.print(mark + " ");
            }
            System.out.println();

        }
    }

    // static methods belong to class,not to object
    public static void displayStudentCount() {
        System.out.println("Total number of students: " + studentCount);

    }

}