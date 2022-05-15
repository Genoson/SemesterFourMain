package AdvancedProgramming.Week2.practiceJava2;

public class Methods {
    // methods are the equivalent of functions in other languages
    // this has been a continuation on notes on OOP in java from the previous week, week 1
    // constructors
    int x;
    int y;
    public Methods() {
        System.out.println("Constructor called");
        x = 0;
        y = 0;
    }
    public Methods(int x) {
        System.out.println("Constructor called with argument " + x);
        this.x = x;
        y = 0;
    }
    public Methods(int x, int y) {
        System.out.println("Constructor called with arguments " + x + " and " + y);
        this.x = x;
        this.y = y;
    }
    // as shown above constructors of a class can be called with no arguments, or many arguments
    // constructors are used to create objects of the class
    // a constructor with no arguments is called the default constructor
    // having multiple constructors to handle multiple scenarios is a good idea
    // ^^ this is called constructor overloading

    //Modifiers in java 
    // access modifiers: public, private, protected

    // Classes:
    // ^^ public means the method can be called from any other class 
    //^^ default means its only accessible to classes in the same package

    //attributes, methods, constructors:
    // ^^ public means the code can be called from any other class
  // ^^ private means the code can only be called from within the class
    // ^^ protected means the code can be called from within classes in the same package and subclasses
    // ^^ default means the code can only be called from within the  same package

    // Non Access Modifiers: static, final, abstract, synchronized, transient, volatile

    // Classes:
    // ^^ final means the class cannot be extended (inherited)
    // ^^ abstract means the class cannot be instantiated(objects created)

    //attributes, methods, constructors:
    //^^ final means the code cannot be overridden
    //^^ static means the code is a member of the class and not an object
    //^^ abstract means the code cannot be implemented directly, but can be inherited, into another abstract class
    //^^ synchronized means the code is executed in a synchronized block(single thread)
    //^^ transient means the code is not serialized
    //^^ volatile means the code is not cached
    



}
