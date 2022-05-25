package com.qap1_ssquire;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class AccountTest {

    @Test
    public void testAccountClassExists() {
        Account account = new Account("12345", "Stephen Squire");
        assertTrue(account instanceof Account);
    }

    @Test
    public void testAccountConstructors() {
        Account account = new Account("12345", "Stephen Squire");
        assertEquals("12345", account.getID());
        assertEquals("Stephen Squire", account.getName());
        assertEquals(0, account.getBalance());

        Account account2 = new Account("12345", "Stephen Squire", 100);
        assertEquals("12345", account2.getID());
        assertEquals("Stephen Squire", account2.getName());
        assertEquals(100, account2.getBalance());
    }

    @Test
    public void testAccountBalanceConstraint(){
        Account account = new Account("12345", "Stephen Squire", 500);
        assertFalse(-500 == account.debit(1000));

        Account account2 = new Account("12345", "Stephen Squire", 500);
        account.transferTo(account2, 1000);
        assertFalse(1500 == account2.getBalance());
    }
    
}
