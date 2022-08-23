package Problem2_Abstraction;

public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString() {
        return "Shape: " + this.name + ", Area: " + this.getArea() + ", Perimeter: " + this.getPerimeter() + ".\n";
    }
    
}
