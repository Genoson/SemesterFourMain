package practiceJava1;
/** Comment blocks are used to document your code.
 *
 * 
 */

// the main class of the program, which is the entry point of the program
// must share the same name as the package/ directory
// Java code is case sensitive

public class Main {
// the main method is the entry point of the program
// the main method is in every java program
    public static void main(String[] args) {
        // the following is a "print" statement
        System.out.println("Hello World!");
        //you can place as many of these in the code wherever you want them...
        System.out.println("This is on another line");
        // you can do math in the print statement
        System.out.println(2 + 2);
        // you can also .print() 
        System.out.print("Same line as >> ");
        /**
         * Java variables can be:
         * String
         * int
         * float
         * char
         * boolean
         * 
         * variables are declared in the style of:
         * type variableName = value;
         * we use final to make a variable constant
         * final int x = 5;
         */
        String myString = "This is a string";
        System.out.println(myString);
        // you can also use the + operator to concatenate strings
        System.out.println(myString + " and this is another string");
        // you can declare many variables at once
        int x = 5, y = 10, z = x + y;
        System.out.println(z);
        // it is convention to name variables descriptively
        // minutesPerHour not mph
        /**
         * Datatypes in Java:
         * primitive datatypes:
         * byte (8 bits) - -128 to 127
         * short (2 bytes) - -32,768 to 32,767
         * int (4 bytes) - -2,147,483,648 to 2,147,483,647
         * long (8 bytes)  - -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 
         * float  (4 bytes) - 3.4E-38 to 3.4E+38
         * double (8 bytes) - 1.7E-308 to 1.7E+308
         * char (2 bytes) - 0 to 65,535
         * boolean (1 bit) - true or false
         * 
         * non-primitive datatypes:
         * String
         * Array   
         * Class 
         */
        // long float and double have a letter after the number
        long myLong = 5L;
        float myFloat = 5.0F;
        double myDouble = 5.0d;
        System.out.println(myLong + myFloat + myDouble);
        // can you get the type of a variable?
        // char variables can be numeric ascii values
        // char myChar = 'a'; // single quotes
        // String myString = "a"; // double quotes 
        // null is a special value that represents the absence of a value
        // only non primitive datatypes can be null
        // non primiitive datatypes start with capital letters
        String myNull = null;
        System.out.println(myNull);
      
        // casting is a process of changing datatype to fit the data
        // casting happens automatically upwards (widening)
        // casting that happens downwards (narrowing) must be done manually

        // arithmetic operators:
        // + - * / %
        // ++ --
        // += -= *= /= %=
        // assignment operators:
        // =
        // += -= *= /= %=
        // comparison operators:
        // == != > < >= <=
        // logical operators:
        // && || !

        //Sting methods:
        // length()
        // charAt()
        // indexOf()
        // substring()
        // toUpperCase()
        // toLowerCase()
        // trim()
        // replace()
        // equals()
        // compareTo()
        // concat()
        // startsWith()
        // endsWith()
        // contains()
        // split()
        // replaceAll()
        // and many more...

        // adding (concatenating) strings and numbers results in a string, like javaScript

        // the backslash is used as an escape characters
        // the backslash is used to escape the following characters:
        // \n - newline
        // \t - tab
        // \b - backspace
        // \r - carriage return
        // \f - form feed
        // \" - double quote
        // \\ - backslash

        // Math class exists natively in java and can be used to do math
        // Math.abs()
        // Math.pow()
        // Math.sqrt()
        // Math.ceil()
        // Math.floor()
        // Math.round()
        // Math.random()
        // and so many more...

        // if statements:
        // if (condition) {} else if (condition) {} else {}
        // ^^ just like javaScript
        // if statements can be nested
        // if statements can be used to check for multiple conditions
        // switch statements can also be used
        // switch(expression) {
        // case value1:
        //     // code to be executed if value1 is matched
        //     break;
        // case value2:
        //     // code to be executed if value2 is matched
        //     break;
        // default:
        //     // code to be executed if none of the values match
        // }

        // ternary operator can be used and is the same as javaScript
        // condition ? true : false

        // while loops:
        // while (condition) {
        //     // code to be executed
        // }

        // do while loops:
        // do {
        //     // code to be executed
        // } while (condition);

        //for loops:
        // for (initialization; condition; increment) {
        //     // code to be executed
        // }

        // for each loops:
        // for (type variable : array) {
        //     // code to be executed
        // }
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // for (String i : cars) {
        //     System.out.println(i);
        // }

        // break and continue statements work as anticipated

        /**Arrays
         * Arrays are a special type of data structure that can hold multiple values of the same type
         * Arrays are created with the syntax:
         * type[] arrayName = new type[size];
         * Arrays are zero-based, meaning that the first element is at index 0
         * Arrays are mutable, meaning that they can be changed after they are created
         * 
         * multi dimensional arrays:
         * type[][] arrayName = new type[size1][size2];
         * 
         */
    }
}