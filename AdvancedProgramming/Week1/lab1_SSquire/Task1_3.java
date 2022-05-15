package AdvancedProgramming.Week1.lab1_SSquire;

public class Task1_3 {
    public static void main(String[] args) {
        System.out.println("\nA program to calculate 5% growth\non an investment of $1000."); 
        double investment = 1000;
        final double rate = 0.05;
        System.out.println("\n  Year     Investment  ");
        System.out.println("--------------------------------");
        for (int year = 1; year <= 10; year++) {
            investment = investment * (1 + rate);
            System.out.printf("%4d   %12.2f\n", year, investment);
        }
        System.out.println("--------------------------------\n");

    }
}
