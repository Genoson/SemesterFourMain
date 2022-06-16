public class YetAnotherCircle implements GeometricObject {

    protected double radius;

    public YetAnotherCircle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

}
