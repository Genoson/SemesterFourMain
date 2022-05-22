// public class Account {
    
//     private int id;
//     private Customer customer;
//     private double balance = 0.0;

//     public Account(int id, Customer customer) {
//         this.id = id;
//         this.customer = customer;
//     }

//     public Account(int id, Customer customer, double balance) {
//         this.id = id;
//         this.customer = customer;
//         this.balance = balance;
//     }

//     public int getId() {
//         return this.id;
//     }

//     public Customer getCustomer() {
//         return this.customer;
//     }

//     public double getBalance() {
//         return this.balance;
//     }

//     public void setBalance(double balance) {
//         this.balance = balance;
//     }

//     public String toString() {
//         return this.customer.getName() + "(" + this.id + ")" + "balance= $" + String.format("%.2f", this.balance);
//     }

//     public String getCustomerName() {
//         return this.customer.getName();
//     }

//     public void deposit(double amount) {
//         this.balance += amount;
//     }

//     public void withdraw(double amount) {
//         this.balance -= amount;
//     }

// }
