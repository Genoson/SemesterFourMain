package AdvancedProgramming.Week2.lab2_SSquire.Exe2_3;

public class Employee {

    private int id, salary;
    private String firstName, lastName;
    
    public Employee() {
        id = 1;
        salary = 1000;
        firstName = "John";
        lastName = "Doe";
    }

    public Employee(int idArg, int salaryArg, String firstNameArg, String lastNameArg) {
        id = idArg;
        salary = salaryArg;
        firstName = firstNameArg;
        lastName = lastNameArg;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salaryArg) {
        salary = salaryArg;
    }

    public int getAnnualSalary() {
        return salary * 12; 
    }

    public void raiseSalary(int raise) {
        salary += salary * (raise/100);
    }

    public String toString() {
        return "Employee [ID: " + id + ", Name: " + getName() + ", Salary: " + salary + "]";
    }
}
