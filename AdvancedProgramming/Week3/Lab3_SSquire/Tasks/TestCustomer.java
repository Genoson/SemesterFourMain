public class TestCustomer {

    public static void main(String[] args) {

        Customer customer1 = new Customer(001, "John", 10);

        System.out.println("\nCustomer 1: " );
        System.out.println(customer1.toString());
        System.out.println("\nCustomer 1 ID: " );
        System.out.println(customer1.getID());
        System.out.println("\nCustomer 1 name: " );
        System.out.println(customer1.getName());
        System.out.println("\nCustomer 1 discount: " );
        System.out.println(customer1.getDiscount());
        customer1.setDiscount(20);
        System.out.println("\nCustomer 1 discount: " );
        System.out.println(customer1.getDiscount());

    }
    
}
