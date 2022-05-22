public class Course {

    private String courseName;
    private Instructor instructor;
    private TextBook textbook;

    public Course(String courseName, Instructor instructor, TextBook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public TextBook getTextBook() {
        return textbook;
    }

    public String toString() {
        return "Course Name: " + courseName + "\n" + instructor.toString() + "\n" + textbook.toString();
    }
    
}
