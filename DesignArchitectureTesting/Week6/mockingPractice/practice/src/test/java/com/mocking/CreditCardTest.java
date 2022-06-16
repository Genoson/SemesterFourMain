package com.mocking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)
public class CreditCardTest {

    @Mock
    private CreditCard creditCard = Mockito.mock(CreditCard.class);

    @Mock
    private Address address = Mockito.mock(Address.class);

    @Mock
    private Person person = Mockito.mock(Person.class);


    @Test
    public void testCreditCard() {
        
    }
    
    
}
