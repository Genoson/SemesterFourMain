package AdvancedProgramming.Week1.lab1_SSquire;
// import statements are used to import other classes
import java.util.Scanner;

public class Task1_1 {
    public static void main(String[] args) {
        System.out.println("Welcome to my Java program!");
        System.out.println("Please enter a single digit number");
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        if (num == 1) {
            System.out.println("You entered one");
        } else if (num == 2) {
            System.out.println("You entered two");
        } else if (num == 3) {
            System.out.println("You entered three");
        } else if (num == 4) {
            System.out.println("You entered four");
        } else if (num == 5) {
            System.out.println("You entered five");
        } else if (num == 6) {
            System.out.println("You entered six");
        } else if (num == 7) {
            System.out.println("You entered seven");
        } else if (num == 8) {
            System.out.println("You entered eight");
        } else if (num == 9) {
            System.out.println("You entered nine");
        } else if (num == 0) {
            System.out.println("You entered zero");
        } else {
            System.out.println("You did not enter a single digit number");
        }
        input.close();
    }
    
}
