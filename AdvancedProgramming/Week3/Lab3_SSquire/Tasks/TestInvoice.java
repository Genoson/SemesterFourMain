public class TestInvoice {
    
    public static void main(String[] args) {

        Invoice anInvoice = new Invoice(001, new Customer(001, "John", 10), 100);
        System.out.println(anInvoice.toString());
        System.out.println(anInvoice.getCustomer());
        System.out.println(anInvoice.getAmount());
        System.out.println(anInvoice.getCustomerName());
        System.out.println(anInvoice.getAmountAfterDiscount());
        Customer newCustomer = new Customer(002, "Jane", 20);
        anInvoice.setCustomer(newCustomer);
        System.out.println(anInvoice.getCustomer());
        System.out.println(anInvoice.getCustomerName());
        System.out.println(anInvoice.getAmountAfterDiscount());
        anInvoice.setAmount(200);
        System.out.println(anInvoice.getAmount());
        System.out.println(anInvoice.getAmountAfterDiscount());
    }
}
