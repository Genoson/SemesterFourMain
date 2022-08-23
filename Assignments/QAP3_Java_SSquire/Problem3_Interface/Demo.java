package Problem3_Interface;

public class Demo {

    public static void main(String[] args) {

        Scalable[] shapes = new Scalable[4];
        final double SCALE_FACTOR = 2.0;

        shapes[0] = new EquilateralTriangle("Equilateral Triangle", 5);
        shapes[1] = new Triangle("Triangle", 5, 10, 12);
        shapes[2] = new Circle("Circle", 5);
        shapes[3] = new Ellipse("Ellipse", 5, 3);

        System.out.println();
        for (Scalable shape : shapes) {
            System.out.println(shape.toString());
            shape.scale(SCALE_FACTOR);
            System.out.println(shape.toString());
        }

    }
    
}
