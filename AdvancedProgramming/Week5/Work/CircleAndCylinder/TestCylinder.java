public class TestCylinder {
    
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        System.out.println(c);
        System.out.println(c.getVolume());
        
        Cylinder c2 = new Cylinder(2.0);
        System.out.println(c2);
        System.out.println(c2.getVolume());
        
        Cylinder c3 = new Cylinder(2.0, 3.0);
        System.out.println(c3);
        System.out.println(c3.getVolume());
        
        Cylinder c4 = new Cylinder(2.0, 3.0, "blue");
        System.out.println(c4);
        System.out.println(c4.getVolume());

        Cylinder   c5 = new Cylinder(2.0, 3.0, "blue");
        System.out.println(c5.getArea());
    }
}
