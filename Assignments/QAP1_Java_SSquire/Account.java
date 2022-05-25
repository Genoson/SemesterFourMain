// Class for problem 1 of QAP1 (Java)
// Coded by Stephen Squire
// Date: 05/15/2022
package QAP1_Java_SSquire;


//Declaring the class Account
public class Account {

    // Declaring the variables
    private String id, name;
    private int balance = 0;

    //Declaring the constructors (overloaded)
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //Declaring the getters 
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // methods for interacting with balance of accounts
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if (balance >= amount) {
            balance -= amount;  
        } else {
            System.out.printf("Debit amount of $%d exceeded account balance of $%d.\n", amount, balance);
        }
        return balance;
    }

    public int transferTo(Account other, int amount) {
        if (balance >= amount) {
            balance -= amount;
            other.credit(amount);
        } else {
            System.out.printf("Transfer amount of $%d exceeded account balance of $%d.\n", amount, balance);
        }
        return balance;
    }

    //Declaring the toString method
    public String toString() {
        return String.format("Account ID: %s\nAccount Name: %s\nAccount Balance: $%d\n", id, name, balance);
    }
    
}

