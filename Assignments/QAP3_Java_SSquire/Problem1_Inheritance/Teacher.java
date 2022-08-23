package Problem1_Inheritance;

// task 3
public class Teacher extends Person {

    protected String mySubject;
    protected double mySalary;

    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.mySubject = subject;
        this.mySalary = salary;
    }
    
    public String getSubject() {
        return this.mySubject;
    }

    public void setSubject(String subject) {
        this.mySubject = subject;
    }

    public double getSalary() {
        return this.mySalary;
    }

    public void setSalary(double salary) {
        this.mySalary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", subject: " + this.mySubject + ", salary: " + this.mySalary;
    }

}
