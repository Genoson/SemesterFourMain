package Problem2_Abstraction;

public class Demo {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];

        shapes[0] = new EquilateralTriangle("Equilateral Triangle", 5);
        shapes[1] = new Triangle("Triangle", 5, 10, 12);
        shapes[2] = new Circle("Circle", 5);
        shapes[3] = new Ellipse("Ellipse", 5, 3);

        System.out.println();
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

    }
    
}
