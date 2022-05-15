package AdvancedProgramming.Week2.lab2_SSquire.Exe2_4;

public class TestInvoice {

    public static void main(String[] args) {

        InvoiceItem item1 = new InvoiceItem("1", "Widget", 10, 10.0);
        InvoiceItem item2 = new InvoiceItem("2", "Gadget", 5, 20.0);
        InvoiceItem item3 = new InvoiceItem("3", "Thing", 1, 30.0);
        InvoiceItem item4 = new InvoiceItem("4", "Other", 2, 40.0);
        InvoiceItem item5 = new InvoiceItem("5", "Another", 3, 50.0);

        System.out.println("\nInvoice 1: " );
        System.out.println(item1.toString());
        System.out.println("Total: " + item1.getTotal());
        System.out.println("\nInvoice 2: " );
        System.out.println(item2.toString());
        System.out.println("Total: " + item2.getTotal());
        System.out.println("\nInvoice 3: " );
        System.out.println(item3.toString());
        System.out.println("Total: " + item3.getTotal());
        System.out.println("\nInvoice 4: " );
        System.out.println(item4.toString());
        System.out.println("Total: " + item4.getTotal());
        System.out.println("\nInvoice 5: " );
        System.out.println(item5.toString());
        System.out.println("Total: " + item5.getTotal());

        InvoiceItem item6 = item1.InvoiceCopy(item1);
        System.out.println("\nInvoice 6: " );
        System.out.println(item6.toString());
        System.out.println("Total: " + item6.getTotal());
        InvoiceItem item7 = item2.InvoiceCopy(item2);
        System.out.println("\nInvoice 7: " );
        System.out.println(item7.toString());
        System.out.println("Total: " + item7.getTotal());
        InvoiceItem item8 = item3.InvoiceCopy(item3);
        System.out.println("\nInvoice 8: " );
        System.out.println(item8.toString());
        System.out.println("Total: " + item8.getTotal());
        InvoiceItem item9 = item4.InvoiceCopy(item4);
        System.out.println("\nInvoice 9: " );
        System.out.println(item9.toString());
        System.out.println("Total: " + item9.getTotal());
        InvoiceItem item10 = item5.InvoiceCopy(item5);
        System.out.println("\nInvoice 10: " );
        System.out.println(item10.toString());
        System.out.println("Total: " + item10.getTotal());

        System.out.println("\nNumber of invoices: " + InvoiceItem.invoiceCount); 
    }
}