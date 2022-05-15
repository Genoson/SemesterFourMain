package AdvancedProgramming.Week1.practiceJava1;

public class OOP {
    //object oriented programming is a programming paradigm that uses 
    //objects and classes to model real-world things
    // DRY - dont repeat yourself is key to OOP

    // variables decleared in this way are considered attributes
    // the final keyword is used to make a variable immutable
    String message = "a message";
    final String message2 = "a message";
    
    // methods can be static or public
    static void printMessage(String message) {
        System.out.println(message);
    }
    public void printMessage2(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        OOP oop = new OOP();
        // static methods can be called without creating an object
        printMessage(oop.message);
        // public methods must be called with an object
        oop.printMessage2(oop.message);
       //oop.message2 = "a new message"; // is an error because it is final
        
    }

}
