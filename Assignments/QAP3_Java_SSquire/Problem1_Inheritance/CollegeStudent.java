package Problem1_Inheritance;

//task 4
public class CollegeStudent extends Student {

    protected String myMajor;
    protected int myYear;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year){
        super(name, age, gender, idNum, gpa);
        this.myMajor = major;
        this.myYear = year;
    }

    public String getMajor() {
        return this.myMajor;
    }

    public void setMajor(String major) {
        this.myMajor = major;
    }

    public int getYear() {
        return this.myYear;
    }

    public void setYear(int year) {
        this.myYear = year;
    }

    @Override
    public String toString() {
        return super.toString() + ", major: " + this.myMajor + ", year: " + this.myYear;
    }
    
}
