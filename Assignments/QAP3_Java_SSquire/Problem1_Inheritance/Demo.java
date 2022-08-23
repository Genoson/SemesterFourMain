package Problem1_Inheritance;

// task 5
public class Demo {

    public static void main(String[] args) {

        System.out.println();
        Person p = new Person("John", 20, "M");
        System.out.println(p);

        Student s = new Student("John", 20, "M", "12345", 3.5);
        System.out.println(s);

        Teacher t = new Teacher("John", 20, "M", "Math", 1000);
        System.out.println(t);

        CollegeStudent cs = new CollegeStudent("John", 20, "M", "12345", 3.5, "Math", 1);
        System.out.println(cs);


    }
    
}
