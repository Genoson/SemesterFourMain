public class CountedItem extends PurchaseItem {

    private int count;

    public CountedItem() {
        super();
        this.count = 0;
    }

    public CountedItem(String name, double unitPrice, int count) {
        super(name, unitPrice);
        this.count = count;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public double getPrice() {
        return this.count * super.getPrice();
    }

    @Override
    public String toString() {
        return super.getName() + " @ " + super.getPrice() + " (" + this.count + ")" + " = " + this.getPrice();
    }
    
}
