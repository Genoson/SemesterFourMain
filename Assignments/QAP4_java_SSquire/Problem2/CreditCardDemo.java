package Problem2;

import java.util.ArrayList;
import java.io.*;

public class CreditCardDemo {

    // a method to write the credit card information to a file
    public static void writeCreditCardInfo(ArrayList<CreditCard> cards) {
        try {
            FileOutputStream fos = new FileOutputStream("CreditCards.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (CreditCard card : cards) {
                oos.writeObject(card);
            }
            oos.close();
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }

    }

    // a method to read the credit card information from a file

    public static ArrayList<CreditCard> readCreditCardInfo() {
        ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
        try {
            FileInputStream fis = new FileInputStream("CreditCards.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                CreditCard card = (CreditCard) ois.readObject();
                cards.add(card);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file 1.");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Error reading from file 2.");
        }
        return cards;
    }

    // a method to search for a credit card by owner first name and last name
    public static CreditCard searchCreditCard(ArrayList<CreditCard> cards, String firstName, String lastName) {
        for (CreditCard card : cards) {
            if (card.getPersonals().getFirstName().equals(firstName) && card.getPersonals().getLastName().equals(lastName)) {
                return card;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Person cardHolder1 = new Person("Diane", "Christie", new Address("237j Harvey Hall", "Menomonie", "WI", "54751"));
        Person cardHolder2 = new Person("John", "Doe", new Address("123 Main St", "Menomonie", "WI", "54751"));
        Person cardHolder3 = new Person("Jane", "Doe", new Address("123 Main St", "Menomonie", "WI", "54751"));
        Person cardHolder4 = new Person("Mike", "Doe", new Address("123 Main St", "Menomonie", "WI", "54751"));
        Person cardHolder5 = new Person("Regina", "Doe", new Address("123 Main St", "Menomonie", "WI", "54751"));

        CreditCard card1 = new CreditCard(cardHolder1, new Money(5000));
        CreditCard card2 = new CreditCard(cardHolder2, new Money(5000));
        CreditCard card3 = new CreditCard(cardHolder3, new Money(5000));
        CreditCard card4 = new CreditCard(cardHolder4, new Money(3000));
        CreditCard card5 = new CreditCard(cardHolder5, new Money(5000));

        card4.charge(new Money(500));

        ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);

        writeCreditCardInfo(cards);

        ArrayList<CreditCard> cards2 = readCreditCardInfo();

        // for (CreditCard card : cards2) {
        //     System.out.println(card);
        // }

        // an ad hoc implementation
        CreditCard searchCard = searchCreditCard(cards2, "Mike", "Doe");
        if (searchCard != null) {
            System.out.println("Mike Doe's card has the following balance and credit limit:");
            System.out.println(searchCard.getBalance());
            System.out.println(searchCard.getCreditLimit());
        } else {
            System.out.println("Card not found.");
        }

    }
    
}
