import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create a new ArrayList of String type
        ArrayList<String> myStrings = new ArrayList<String>();
        myStrings.add("Hello");
        myStrings.add("World");
        myStrings.add("!");

        System.out.println(myStrings); // [Hello, World, !]

        myStrings.add(0, "New"  );
        System.out.println(myStrings); // [New, Hello, World, !]

        myStrings.remove("Hello");
        System.out.println(myStrings); // [New, World, !]

        myStrings.set(0, "Hello");
        System.out.println(myStrings); // [Hello, World, !]

        myStrings.remove(2);
        System.out.println(myStrings); // [Hello, World]
       
    }
    
}
