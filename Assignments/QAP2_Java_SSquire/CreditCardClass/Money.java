public class Money {

    private long dollars;
    private long cents;

    public Money() {
        this.dollars = 0;
        this.cents = 0;
    }

    public Money(double amount) {
        this.dollars = (long) amount;
        // this was my issue, was losing 1 cent some of the time due to the way the long conversion works
        // Math.ceil to round up fixed it
        this.cents = (long) Math.ceil((amount - this.dollars) * 100);
    }

    // Task 1:  overloaded constructor to copy a money object
    public Money(Money toCopy) {
        this.dollars = toCopy.dollars;
        this.cents = toCopy.cents;
    }

    public Money add(Money other) {
        this.dollars += other.dollars;
        //System.out.println(this.cents + " " + other.cents); // testing to figure out my missing penny
        this.cents +=  other.cents;
        if (this.cents >= 100) {
            this.dollars++;
            this.cents -= 100;
        }
        return this;
    }

    public Money subtract(Money other) {
        this.dollars -= other.dollars;
        this.cents -= other.cents;
        if (this.cents < 0) {
            this.dollars--;
            this.cents += 100;
        }
        return this;
    }

    public int compareTo(Money other) {
        if (this.dollars > other.dollars) {
            return 1;
        } else if (this.dollars < other.dollars) {
            return -1;
        } else {
            if (this.cents > other.cents) {
                return 1;
            } else if (this.cents < other.cents) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    public String toString() {
        return "$" + this.dollars + "." + (this.cents < 10 ? "0" : "") + this.cents;
    }
    
}
