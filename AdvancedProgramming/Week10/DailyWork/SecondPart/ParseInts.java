import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int value, sum = 0;
        Scanner scan = new Scanner(System.in);
        String line;

        System.out.println("Enter a line of text");
        Scanner scanLIne = new Scanner(scan.nextLine());

        while (scanLIne.hasNext()) {
            try{
            value = Integer.parseInt(scanLIne.next());
            } catch (NumberFormatException error) {
                //System.out.println("Error: " + error);
                error.printStackTrace();
                value = 0;
            }
            sum += value;
        }
        
        System.out.println("The sum of the numbers is " + sum);
    }
}
