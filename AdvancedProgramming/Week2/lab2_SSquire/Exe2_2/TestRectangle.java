package AdvancedProgramming.Week2.lab2_SSquire.Exe2_2;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(3.5f, 5f);
        Rectangle rect2 = new Rectangle(2.0f, 3.0f);

        System.out.println("\nRectangle 1: " );
        System.out.println(rect1.toString());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println("\nRectangle 2: " );
        System.out.println(rect2.toString());
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
