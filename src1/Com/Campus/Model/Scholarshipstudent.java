package Com.Campus.Model;
public class Scholarshipstudent extends Student {
    private double scholarshipPercentage;

    public Scholarshipstudent(int studentid, String studentname, int age, String department, int[] marks, double scholarshipPercentage) {
        super(studentid, studentname, age, department, marks);
        this.scholarshipPercentage = scholarshipPercentage;
    }
  //getters and setters
    public double getScholarshipPercentage() {
        return scholarshipPercentage;
    }

    public void setScholarshipPercentage(double scholarshipPercentage) {
        this.scholarshipPercentage = scholarshipPercentage;
    }

    @Override
    public void studentType() {
        System.out.println("This is a scholarship student.");
    }

    @Override
    public void generatereport() {
        System.out.println("Generating report for scholarship student.");
    }

    @Override
    public void eligbleForScholarship() {
        System.out.println("Checking eligibility for scholarship.");
    }
}



    

