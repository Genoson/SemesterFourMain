public class Widget {
    
    private static int count;
    private int color;
    private float alignment;

    public Widget(){
        count++;
    }

    public void draw(){
        System.out.println("Drawing widget");
    }

    public static int getCount(){
        return count;
    }

    public int getColor(){
        return color;
    }

    public void setColor(int color){
        this.color = color;
    }
    
}
