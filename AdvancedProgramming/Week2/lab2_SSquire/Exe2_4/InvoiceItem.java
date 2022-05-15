package AdvancedProgramming.Week2.lab2_SSquire.Exe2_4;

public class InvoiceItem {
    
    private String id, description;
    private int quantity;
    private double unitPrice; 
    public static int invoiceCount = 0;

    public InvoiceItem() {
        id = "";
        description = "";
        quantity = 0;
        unitPrice = 0.0;
        invoiceCount++;
    }

    public InvoiceItem(String idArg, String descriptionArg, int quantityArg, double unitPriceArg) {
        id = idArg;
        description = descriptionArg;
        quantity = quantityArg;
        unitPrice = unitPriceArg;
        invoiceCount++;
    }

    public InvoiceItem InvoiceCopy( InvoiceItem invoiceItem) {
        InvoiceItem invoiceItemCopy = new InvoiceItem(invoiceItem.id, invoiceItem.description, invoiceItem.quantity, invoiceItem.unitPrice);
        return invoiceItemCopy;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantityArg) {
        quantity = quantityArg;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPriceArg) {
        unitPrice = unitPriceArg;
    }

    public double getTotal() {
        return quantity * unitPrice;
    }

    public String toString() {
        return "InvoiceItem [\nid: " + id + ", \ndescription: " + description + ", \nquantity: " + quantity + ", \nunitPrice: " + unitPrice + "\n]";
    }

}
