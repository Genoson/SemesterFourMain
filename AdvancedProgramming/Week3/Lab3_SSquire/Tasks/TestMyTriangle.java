public class TestMyTriangle {
    
    public static void main(String[] args) {

        MyTriangle aTriangle = new MyTriangle(0,0, 0,1, 1, 0);

        System.out.println("\nTriangle 1: " );
        System.out.println(aTriangle.toString());
        System.out.println(aTriangle.getPerimeter());
        System.out.println(aTriangle.getType());

        MyPoint aPoint = new MyPoint(1,1);
        MyPoint bPoint = new MyPoint(2,3);
        MyPoint cPoint = new MyPoint(1,3);
        MyTriangle bTriangle = new MyTriangle(aPoint, bPoint, cPoint);
        System.out.println("\nTriangle 2: " );
        System.out.println(bTriangle.toString());
        System.out.println(bTriangle.getPerimeter());
        System.out.println(bTriangle.getType());

        // an equilateral triangle is hard
        MyTriangle cTriangle = new MyTriangle(1,1, 1,2, 2,1);
        
        System.out.println("\nTriangle 3: " );
        System.out.println(cTriangle.toString());
        System.out.println(cTriangle.getPerimeter());
        System.out.println(cTriangle.getType());
    }
}
