import java.util.ArrayList;

public class Teacher extends Person {

    private int numCourses = 0;
    private ArrayList<String> courses = new ArrayList<String>();

    public Teacher(String name, String address) {
        super(name, address);
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString() + "\nNumber of courses: " + this.numCourses + "\nCourses: " + this.courses;
    }

    public void addCourse(String course) {
        this.courses.add(course);
        this.numCourses++;
    }

    public boolean removeCourse(String course) {
        if (this.courses.contains(course)) {
            this.courses.remove(course);
            this.numCourses--;
            return true;
        }
        return false;
    }

}
