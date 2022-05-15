package AdvancedProgramming.Week2.lab2_SSquire.Exe2_3;

public class TestEmployee {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, 4500, "John", "Idaho");
        Employee emp2 = new Employee(2, 5000, "James", "Deer");

        System.out.println("\nEmployee 1: " );
        System.out.println(emp1.toString());
        System.out.println("Annual salary: " + emp1.getAnnualSalary());
        System.out.println("\nEmployee 2: " );
        System.out.println(emp2.toString());
        System.out.println("Annual salary: " + emp2.getAnnualSalary());

        emp1.raiseSalary(20);
        emp2.raiseSalary(20);

        System.out.println("\nAfter a 20% raise:");
        System.out.println("\nEmployee 1: " );
        System.out.println(emp1.toString());
        System.out.println("Annual salary: " + emp1.getAnnualSalary());
        System.out.println("\nEmployee 2: " );
        System.out.println(emp2.toString());
        System.out.println("Annual salary: " + emp2.getAnnualSalary());
    }   
    
}
