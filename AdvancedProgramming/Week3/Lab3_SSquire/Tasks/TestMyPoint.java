public class TestMyPoint {

    public static void main(String[] args) {

        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint();
        MyPoint point3 = new MyPoint();
        
        point2.setX(1);
        point2.setY(3);
        point3.setXY(2, 4);

        System.out.println(point1.toString());
        System.out.println(point2.getX());
        System.out.println(point3.getY());

        System.out.println(point1.distance(point2));
        System.out.println(point3.distance(2, 6));
        System.out.println(point2.distance());
        
    }
    
}
