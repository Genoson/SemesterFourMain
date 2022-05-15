package AdvancedProgramming.Week2.practiceJava2;

// packages are imported to use the classes in the package
// package.name.className
// package.name.*
//import AdvancedProgramming.Week1.lab1_SSquire.*;
//^^ the above would import all the classes in the package AdvancedProgramming.Week1.lab1_SSquire 
// custom packages can be created using the command line:
// first compile the code
// then run the command:
//javac -d . MyPackage.java
// to access the package
// java mypack.MyPackage
// the package name mypack above could be anything

public class Encapsulation {
    // encapsulation is the process of hiding the details of a class from the user(s)
    // and providing only the necessary methods to access the data
    
    private String name;

    public Encapsulation() {
        name = "Secret";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        System.out.println(encapsulation.toString());
        System.out.println(encapsulation.name);
        encapsulation.setName("Bob");
    }
    
}
