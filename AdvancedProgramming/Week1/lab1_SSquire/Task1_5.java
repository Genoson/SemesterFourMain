package AdvancedProgramming.Week1.lab1_SSquire;
// import statements are used to import other classes
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        System.out.println("A program to act as a simple calculator.");
        double num1, num2;
        String operator; 
        System.out.println("Please enter two numbers.");
        Scanner input = new Scanner(System.in);
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        System.out.println("Please enter an operator (+, -, *, /)");
        operator = input.next();
        switch (operator) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        input.close();

    }
    
}
