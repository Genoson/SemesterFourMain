import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        while (keepGoing.equalsIgnoreCase("y")) {
            System.out.print("Enter a number: ");
            int number = scan.nextInt();
            System.out.println("The factorial of " + number + " is " + factorial(number));
            System.out.print("Continue? (y/n): ");
            keepGoing = scan.next();
        }
    }

    public static int factorial(int n) throws IllegalArgumentException {
        try {
            if (n < 0) {
                throw new IllegalArgumentException("Number must be greater than 0");
            } else if (n == 0) {
                return 0;
            } else if (n > 16) {
                throw new IllegalArgumentException("Number must be less than 16");
            } else {
                int fac = 1;
                for (int i = n; i > 0; i--)
                    fac *= i;
                return fac;
            }
        } catch (IllegalArgumentException error) {
            // System.out.println("Error: " + error);
            error.printStackTrace();
            return 0;
        }
    }

}
