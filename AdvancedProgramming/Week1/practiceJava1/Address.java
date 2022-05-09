package practiceJava1;

// good naming conventions and structuring code to reiinforce readability
    // an address class that has a street, city, province, and postal code etc is better than 
    // just those four variables seperate
    public class Address {
        String street;
        String city;
        String province;
        String postalCode;

        // a constructor is a special method that is called when an object is created
        // it is used to initialize the object
        // it is a special method that is called when an object is created
        // it is used to initialize the object
        public Address(String street, String city, String province, String postalCode) {
            this.street = street;
            this.city = city;
            this.province = province;
            this.postalCode = postalCode;
        }

        // a method is a special method that is called when an object is used
        // it is used to perform a task
        // it is a special method that is called when an object is used
        // it is used to perform a task
        public void printAddress() {
            System.out.printf("%s\n%s, %s %s\n", street, city, province, postalCode);
        }
    }
