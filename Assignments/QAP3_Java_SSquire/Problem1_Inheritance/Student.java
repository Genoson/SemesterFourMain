package Problem1_Inheritance;

public class Student extends Person {
    
    protected String myIdNum;
    protected double myGPA;

    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    // task 2

    public String getIdNum() {
        return this.myIdNum;
    }

    public void setIdNum(String idNum) {
        this.myIdNum = idNum;
    }

    public double getGPA() {
        return this.myGPA;
    }

    public void setGPA(double gpa) {
        this.myGPA = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", idNum: " + this.myIdNum + ", gpa: " + this.myGPA;
    }
    
}
