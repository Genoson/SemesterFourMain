package Problem3_Interface;

public class Ellipse extends Shape {

    private double majorAxis;
    private double minorAxis;

    public Ellipse(String name, double majorAxis, double minorAxis) {
        super(name);
        if (majorAxis > minorAxis) {
            this.majorAxis = majorAxis;
            this.minorAxis = minorAxis;
        } else {
            this.majorAxis = minorAxis;
            this.minorAxis = majorAxis;
        }
    }

    public double getRadius1() {
        return this.majorAxis;
    }

    public void setRadius1(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getRadius2() {
        return this.minorAxis;
    }

    public void setRadius2(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    @Override
    public double getArea() {
        return Math.PI * this.majorAxis * this.minorAxis;
    }

    @Override
    public double getPerimeter() {
        if (this.majorAxis == this.minorAxis) {
            return Math.PI * this.majorAxis * 2;
        } else {
            double term1 = 2 * (Math.pow(this.majorAxis, 2) + Math.pow(this.minorAxis, 2)); 
            double term2 = (Math.pow(this.majorAxis - this.minorAxis, 2)) / 2;
            return Math.PI * Math.sqrt(term1 - term2);
        }
    }

    @Override
    public void scale(double scaleFactor) {
        this.majorAxis *= scaleFactor;
        this.minorAxis *= scaleFactor;
    }
    
}
