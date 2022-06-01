public class TestPerson {

    public static void main(String[] args) {
        Person p = new Person("John", "123 Main St.");
        System.out.println(p);
        System.out.println(p.getName());
        System.out.println(p.getAddress());
        p.setAddress("321 Main St.");
        System.out.println(p);
        System.out.println(p.getName());
        System.out.println(p.getAddress());

        Student s = new Student("John", "123 Main St.");
        System.out.println(s);
        System.out.println(s.getName());
        System.out.println(s.getAddress());
        s.setAddress("321 Main St.");
        System.out.println(s);
        s.addCourseGrade("Math", 90);
        s.addCourseGrade("English", 95);
        s.addCourseGrade("Science", 100);
        s.printGrades();
        System.out.println(s.getAverageGrade());

        Teacher t = new Teacher("John", "123 Main St.");
        System.out.println(t);
        System.out.println(t.getName());
        System.out.println(t.getAddress());
        t.setAddress("321 Main St.");
        System.out.println(t);
        t.addCourse("Math");
        t.addCourse("English");
        t.addCourse("Science");
        System.out.println(t);
        t.removeCourse("Math");
        t.removeCourse("Science");
        System.out.println(t);

    }
    
}
