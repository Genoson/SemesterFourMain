package AdvancedProgramming.Week2.practiceJava2;

public class TestEncapsulation {

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        System.out.println(encapsulation.toString());
        //System.out.println(encapsulation.name); // this is not accessible, a private variable
        encapsulation.setName("Bob");
        System.out.println(encapsulation.toString());

    }
    
}
