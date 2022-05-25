// Test Class for problem 2 of QAP1 (Java)
// Coded by Stephen Squire
// Date: 05/15/2022

// Declaring the class Time
public class TestTime {
    // Declaring the main method
    public static void main(String[] args) {

        //Test 1 - Test the constructor
        Time t1 = new Time(21, 10, 59);
        Time t2 = new Time(10, 20, 0);
        Time t3 = new Time(11, 59, 59);
        Time t4 = new Time(12, 0, 0);
        
        // Test 1 output
        System.out.println("\nTime object t1 = " + t1.toString());
        System.out.println("Time object t2 = " + t2.toString());
        System.out.println("Time object t3 = " + t3.toString());
        System.out.println("Time object t4 = " + t4.toString());
        System.out.println("==============================");

        // Test 2 - test the time manipulation methods
        t1.nextSecond();
        t3.nextSecond();
        t2.previousSecond();
        t4.previousSecond();

        // Test 2 output
        System.out.println("NextSecond of Time t1 = " + t1.toString());
        System.out.println("PreviousSecond of Time t2 = " + t2.toString());
        System.out.println("NextSecond of Time t3 = " + t3.toString());
        System.out.println("PreviousSecond of Time t4 = " + t4.toString());
        System.out.println("");

    }
    
}
