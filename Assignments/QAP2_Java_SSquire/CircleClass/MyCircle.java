public class MyCircle {

    // declaring instance variables
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    // constructors
    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // getters and setters
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return center.getX();
    }

    public void setX(int x) {
        this.center.setX(x);
    }

    public int getY() {
        return center.getY();
    }

    public void setY(int y) {
        this.center.setY(y);
    }

    public void setCenterXY(int x, int y) {
        this.center = new MyPoint(x, y);
    }

    // methods
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[center=" + center.toString() + ", radius=" + radius + "]";
    }
    
    
    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
    
}
