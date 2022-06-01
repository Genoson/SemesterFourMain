public class TestPoint2DPoint3D {

    public static void main(String[] args) {

        Point2D p = new Point2D();
        System.out.println(p);
        p.setX(2);
        System.out.println(p.getX());
        p.setY(3);
        System.out.println(p.getY());
        System.out.println(p);

        Point3D p3 = new Point3D();
        System.out.println(p3);
        p3.setX(2);
        System.out.println(p3.getX());
        p3.setY(3);
        System.out.println(p3.getY());
        p3.setZ(4);
        System.out.println(p3.getZ());
        System.out.println(p3);

    }
    
}
