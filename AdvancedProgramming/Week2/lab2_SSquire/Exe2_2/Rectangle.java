package AdvancedProgramming.Week2.lab2_SSquire.Exe2_2;

// 
public class Rectangle {

    private float length, width;

    public Rectangle() { 
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float lengthArg, float widthArg) {
        length = lengthArg;
        width = widthArg;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float lengthArg) {
        length = lengthArg;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float widthArg) {
        width = widthArg;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (length + width);
        return perimeter;
    }

    public String toString() {
        return "Length: " + length + " Width: " + width;
    }
}
