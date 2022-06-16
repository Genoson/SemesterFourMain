public class ShapesTest {

    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println("color: " + s1.getColor());
        System.out.println("filled: " + s1.isFilled());
        // System.out.println("Radius: " + s1.getRadius()); // DOES NOT COMPILE getRadius is not a Shape method
        // the below statement does compile, explicitly typing the object to call the method
        System.out.println("Radius: " + ((Circle) s1).getRadius());

        Circle c1 = (Circle)s1;                   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        //Shape s2 = new Shape(); // cannot instantiate abstract class

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); // fails to compile, getLength is not a Shape method
        System.out.println(((Rectangle) s3).getLength()); // downcast to Rectangle and call getLength

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); // fails to compile, getSide is not a Shape method
        System.out.println(((Square) s4).getSide()); // downcast to Square and call getSide
        
        // Take note that we downcast Shape s4 to Rectangle, 
        //  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); // fails to compile, getSide is not a rectangle method
        System.out.println(((Square) r2).getSide()); // downcast to Square and call getSide
        System.out.println(r2.getLength());
        
        // Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }
    // abstract methods enforce the existence of a concrete implementation in the subclasses
    // abstract classes allow related classes to share common code and behaviour. reducing repetition
}
