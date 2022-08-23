public class TestMyCircle{

    public static void main(String[] args){

        MyPoint point1 = new MyPoint(10, 10);
        MyPoint point2 = new MyPoint(5, 5);

        System.out.println("\nPoint 1 : Coordinates are" + point1.toString());
        System.out.println("Point 2 : Coordinates are" + point2.toString());

        MyCircle circle1 = new MyCircle(point1, 5);
        MyCircle circle2 = new MyCircle(point2, 6);

        System.out.println("\nCircle 1 : Center Coordinates are " + circle1.getCenter().toString() + " Radius : " + circle1.getRadius());
        System.out.println("Circle 2 : Center Coordinates are " + circle2.getCenter().toString() + " Radius : " + circle2.getRadius());
        
        System.out.println("\nArea of First Circle = " + Math.round(circle1.getArea()));
        System.out.println("Area of Second Circle = " + Math.round(circle2.getArea()));

        System.out.println("\nThe distance between the two circles is " + Math.round(circle1.getCenter().distance(circle2.getCenter())));
        
        circle1.setCenter(point2);

        System.out.println("\nSet Circle 1 Center to Point 2");
        System.out.println("Circle 1 : Center Coordinates are " + circle1.getCenter().toString() + " Radius : " + circle1.getRadius());
        System.out.println("Circle 2 : Center Coordinates are " + circle2.getCenter().toString() + " Radius : " + circle2.getRadius());
        System.out.println("New distance between the two circles is " + Math.round(circle1.getCenter().distance(circle2.getCenter())));

        circle1.setCenterXY(5, 10);
        circle2.setCenterXY(25, 10);

        System.out.println("\nSet Circle 1 Center to " + circle1.getCenter().toString() + " and Circle 2 Center to " + circle2.getCenter().toString());
        System.out.println("Circle 1 : Center Coordinates are " + circle1.getCenter().toString() + " Radius : " + circle1.getRadius());
        System.out.println("Circle 2 : Center Coordinates are " + circle2.getCenter().toString() + " Radius : " + circle2.getRadius());
        System.out.println("Final distance between the two circles is " + Math.round(circle1.getCenter().distance(circle2.getCenter())));

    }

}