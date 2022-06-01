public class WeightedItem extends PurchaseItem {

    private double weight;

    public WeightedItem() {
        super();
        this.weight = 0.0;
    }

    public WeightedItem(String name, double unitPrice, double weight) {
        super(name, unitPrice);
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getPrice() {
        return this.weight * super.getPrice();
    }

    @Override
    public String toString() {
        return super.getName() + " @ " + super.getPrice() + " (" + this.weight + "Kg )" + " = " + this.getPrice();
    }
    
}
