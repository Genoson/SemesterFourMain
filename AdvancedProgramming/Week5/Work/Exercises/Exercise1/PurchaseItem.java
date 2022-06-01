

public class PurchaseItem {

    private String name;
    private double unitPrice;

    public PurchaseItem() {
        this.name = "no item";
        this.unitPrice = 0.0;
    }

    public PurchaseItem(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public double getPrice() {
        return this.unitPrice;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String toString() {
        return this.name + " @ " + this.unitPrice;
    }




    
}
