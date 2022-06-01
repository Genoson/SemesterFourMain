import java.util.ArrayList;

public class Student extends Person {
    
    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<String>();
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + "\nNumber of courses: " + this.numCourses + "\nCourses: " + this.courses + "\nGrades: " + this.grades;
    }

    public void addCourseGrade(String course, int grade) {
        this.courses.add(course);
        this.grades.add(grade);
        this.numCourses++;
    }

    public void printGrades() {
        for (int i = 0; i < this.numCourses; i++) {
            System.out.println(this.courses.get(i) + ": " + this.grades.get(i));
        }
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < this.numCourses; i++) {
            sum += this.grades.get(i);
        }
        return sum / this.numCourses;
    }
}
