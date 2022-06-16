public class ResizableCircle extends YetAnotherCircle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);
    }

    // diagrams show that this method is an int return type, but it is a double return type
    @Override
    public int resize(int percent) {
        this.radius *= percent / 100.0;
        return percent;
    }

}
    
