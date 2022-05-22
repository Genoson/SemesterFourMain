public class Invoice {
    
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return this.ID;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Customer setCustomer(Customer customer) {
        this.customer = customer;
        return customer;
    }

    public String getAmount() {
        return String.format("%.2f", this.amount);
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public double getAmountAfterDiscount() {
        return this.amount - (this.amount * this.customer.getDiscount() / 100);
    }

}
