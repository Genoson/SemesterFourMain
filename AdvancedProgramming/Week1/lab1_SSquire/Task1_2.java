package lab1_SSquire;
// import statements are used to import other classes
import java.util.Scanner;

public class Task1_2 {
   public static void main(String[] args) {
        System.out.println("A simple program to print the largest integer of 5 inputs.");
        System.out.println("Please enter 5 integers.");
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();
        int[] nums = {num1, num2, num3, num4, num5};
        // a for loop can be used to compare the values.
        int max = 0;
        // this is a for each loop, they are functionally the same but syntactically different from JS
        for (int num: nums) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The largest integer is " + max);
        input.close();
   }
       
}

