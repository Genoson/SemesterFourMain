public class CreditCardDemo {

    public static void main(String[] args) {

        Person cardHolder1 = new Person("Diane", "Christie", new Address("237j Harvey Hall", "Menomonie", "WI", "54751"));

        CreditCard card1 = new CreditCard(cardHolder1, new Money(1000));
        System.out.println("\nBalance: " + card1.getBalance());
        System.out.println("Credit Limit: " + card1.getCreditLimit());

        System.out.println("\nAttempting to charge $200.00");
        card1.charge(new Money(200));
        System.out.println("Charge: " + card1.getBalance());
        System.out.println("Card 1 balance: " + card1.getBalance());

        System.out.println("\nAttempting to charge $10.02");
        card1.charge(new Money(10.02));
        System.out.println("Charge: $10.02" );
        System.out.println("Card 1 balance: " + card1.getBalance());

        System.out.println("\nAttempting to pay $25.00");
        card1.payment(new Money(25));
        System.out.println("Payment: $25.00");
        System.out.println("Card 1 balance: " + card1.getBalance());

        System.out.println("\nAttempting to charge $990.00");
        card1.charge(new Money(990));
        System.out.println("Card 1 balance: " + card1.getBalance());

    }
    
}
