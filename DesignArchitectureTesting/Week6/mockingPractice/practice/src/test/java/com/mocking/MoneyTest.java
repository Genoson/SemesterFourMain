package com.mocking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)
public class MoneyTest {

    @Mock
    private Money money = Mockito.mock(Money.class);

    @Test
    public void testMoney() {
        Money moneyUnderTest = new Money(100.00);
        assertTrue(moneyUnderTest.equals(new Money(100.00)));
        moneyUnderTest.subtract(new Money(150.00));
        assertTrue(moneyUnderTest.equals(new Money(-50.00)));
    }

    // probably no need to use mockito for this test

   

    
}
