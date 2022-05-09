package lab1_SSquire;
// import statements are used to import other classes
import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        System.out.println("A program to take in an indeterminate number of inputs\nand return the sum and average of the values.");
        Scanner input = new Scanner(System.in);
        int temp;
        int sum = 0;
        int count = 0;
        double average;
        do {
            System.out.println("Please enter a number.");
         temp = input.nextInt();
            if (temp != -999) {
                sum += temp;
                count++;
            } else { // else statement could be moved to after the loop for same functionality
                System.out.println("the sum is " + sum);
                average = sum / count;
                System.out.printf("the average is %.2f\n", average);
                break;
            }
        } while (temp != -999);
        input.close();
    }
}
