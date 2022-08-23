package Problem3_Interface;

public abstract class Shape implements Scalable {

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
