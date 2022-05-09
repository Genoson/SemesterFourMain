package lab1_SSquire;
// import statements are used to import other classes
import java.util.Scanner;

public class Task1_7 {
    public static void main(String[] args) {
        System.out.println("\nA simple Program to convert an integer to binary or the reverse");
        System.out.println("\nEnter 0 to convert to binary or 1 to convert to decimal");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch (choice){
            case 0:
                System.out.println("\nEnter an integer number");
                int number = input.nextInt();
                int remainder;
                String result = "";
                int temp = number; 
                while (temp > 0){
                    remainder = temp % 2;
                    temp = temp / 2;
                    result = remainder + result;
                }
                System.out.println("\nThe binary representation of " + number + " is " + result);
                break;
            case 1:
                System.out.println("\nEnter a binary number");
                String binary = input.next();
                int number2 = 0;
                int power = 0;
                for (int i = binary.length() - 1; i >= 0; i--){
                    number2 += Integer.parseInt(binary.substring(i, i + 1)) * Math.pow(2, power);
                    power++;
                }
                System.out.println("\nThe decimal representation of " + binary + " is " + number2);
                break;
            default:
                System.out.println("\nInvalid choice");
                break;
        } 
        input.close();
    }
}
