public class CreditCard {

    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money creditLimit) {
        this.owner = newCardHolder;
        this.balance = new Money(0);
        this.creditLimit = creditLimit;
    }

    public Money getBalance() {
        return this.balance;
    }

    public Money getCreditLimit() {
        return this.creditLimit;
    }

    public Person getPersonals() {
        return this.owner;
    }

    public void charge(Money amount) {
        this.balance.add(amount);
        if(this.balance.compareTo(this.creditLimit) > 0) {
            this.balance.subtract(amount);
            System.out.println("Credit limit exceeded. Transaction cancelled.");
        }
    }

    public void payment(Money amount) {
        this.balance.subtract(amount);
        if(this.balance.compareTo(new Money(0)) < 0) {
            this.balance.add(amount);
            System.out.println("Payment exceeds credit limit. Transaction cancelled.");
        }
    }

    public String toString() {
        return "CreditCard [balance=" + this.balance + ", creditLimit=" + this.creditLimit + ", owner=" + this.owner + "]";
    }

    // Task 2 part 3 - a method to get available credit, returned as a new money object
    public Money getAvailableCredit() {
        Money availableCredit = new Money(this.creditLimit);
        availableCredit.subtract(this.balance);
        return availableCredit;
    }

    // Task 2 part 4 - a method to get the card owners info
    public String getCardHolderInfo() {
        return this.owner.toString();
    }
    
}
