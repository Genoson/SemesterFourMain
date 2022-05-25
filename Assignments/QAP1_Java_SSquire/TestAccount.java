// Test Class for problem 1 of QAP1 (Java)
// Coded by Stephen Squire
// Date: 05/15/2022
package QAP1_Java_SSquire;

// Declaring the class TestAccount
public class TestAccount {
    // Declaring the main method
    public static void main(String[] args) {

        //Test 1 - Test the constructor
       Account AccountA = new Account("00001", "AccountA", 1000);
       Account AccountB = new Account("00002", "AccountB", 1000);
       System.out.printf("\nAccount A has balance = %d\n", AccountA.getBalance());
       System.out.printf("Account B has balance = %d\n", AccountB.getBalance());
       System.out.println("==============================");
    
       //Test 2 - Test the credit method
       System.out.println("Credit $1000 in Account A");
       AccountA.credit(1000);
       System.out.printf("Account A has balance = %d\n", AccountA.getBalance());
       System.out.println("Credit $2000 in Account B");
       AccountB.credit(2000);
       System.out.printf("Account B has balance = %d\n", AccountB.getBalance());
       System.out.println("==============================");

       //Test 3 - Test the TransferTo method
       System.out.println("Transfer $1000.00 from Account B to Account A");
       AccountB.transferTo(AccountA, 1000);
       System.out.printf("Account A balance: $%d\nAccount B balance: $%d\n", AccountA.getBalance(), AccountB.getBalance());
       System.out.println("==============================");
       
       //Test 4 - Test the debit method
       System.out.println("Debit $100 from Account A");
       AccountA.debit(100);
       System.out.printf("Account A has balance = %d\n", AccountA.getBalance());
       System.out.println("Debit $3000 from Account B");
       AccountB.debit(3000);
       System.out.printf("Account B has balance = %d\n\n", AccountB.getBalance());

    }

}
