package AdvancedProgramming.Week1.practiceJava1;
//importing other classes
// classes inside the same package? do not need to be imported
//import practiceJava1.Address;

public class Methods {
    // continueing on with my notes and code practice of w3schools java tutorial
    // https://www.w3schools.com/java/java_methods.asp
    // the following is a method that belongs to the class Methods
    static void print(String param) {
        System.out.println(param);
    }

    // methods can have returns
    static int add(int num1, int num2) {
        return num1 + num2;
    }

    // methods can be overloaded, they can have different parameters
    static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        // methods in java are used to perform a specific task
        // methods are the equivalent to functions in other languages

        print("Hello World");
        print("another message");
        // calling the Address class from a different file in the same package
        Address myAddress = new Address("123 Main St", "Toronto", "ON", "M5J2N5");
        myAddress.printAddress();
        // defining a variable as the return of a method
        int result = add(5, 10);
        System.out.println(result);
        double result2 = add(5.6, 10.7);
        System.out.println(result2);

        // scope of variables
        // variables can have method scope or block scope
        // method scope: variables can be used in the method
        // block scope: variables can only be used in the block

        //recursive methods in java work fine, they require a halting condition 
        // OOP is next up, a core fundamental of java
        OOP oop = new OOP();
        //oop.printMessage("Hello World"); // not available because it is private/ static
        oop.printMessage2(oop.message);

}
}
