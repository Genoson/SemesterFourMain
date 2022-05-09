package lab1_SSquire;

public class Task1_6 {
    public static void main(String[] args) {
        System.out.println("\nFrequency of numbers on an array of 100 random single digit numbers.");
        int[] numbers = new int[100];
        int[] frequency = new int[10];
        for (int i = 0; i < 100; i++) {
            numbers[i] = (int) (Math.random() * 10);
            //System.out.println(numbers[i]);
        }
        // this could be moved into the original for loop above it
        for (int i = 0; i < 100; i++) {
            frequency[numbers[i]]++;
        }
        System.out.println("\n  Number  Frequency");
        for (int i = 0; i < 10; i++) {
            // using printf to format the output
            System.out.printf("%4d   %8d\n", i, frequency[i]);
        }

    }    
}
