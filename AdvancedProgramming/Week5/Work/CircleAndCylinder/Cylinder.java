public class Cylinder extends Circle {

    private double height = 1.0;

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "A cylinder with height " + this.height + ", with a " + super.toString();
    }
    
    public double getVolume() {
        return super.getArea() * this.height;
    }

    @Override // override annotation is not necessary, but gets teh compiler to ensure that the method is being overridden
    public double getArea() {
        return 2 * super.getArea() + 2 * Math.PI * getRadius() * this.height;
    }
    
}
