public class Circle {
    
    private double radius = 1.0;
    private String color = "red";
    private static final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Radius: " + radius + "\nColor: " + color;
    }
    
    public double getArea(){
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(10.0, "blue");

        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        System.out.println(circle3.getArea());

        //Circle.PI = 3.14159;
        //^^ This will not work because PI is a static final variable. 
    }
}
