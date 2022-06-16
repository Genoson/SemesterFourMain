package com.mocking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)
public class AddressTest {

    @Mock
    private Address home = Mockito.mock(Address.class);

    @Test
    public void testAddress() {
        Address address = new Address("123 Main St", "Anytown", "CA", "90210");
        assertEquals("123 Main St", address.getStreet());
        assertEquals("Anytown", address.getCity());
        assertEquals("CA", address.getState());
        assertEquals("90210", address.getZip());
        assertEquals("123 Main St, Anytown, CA, 90210", address.toString());
    }

    @Test
    public void testAddressMock() {
        Mockito.when(home.getStreet()).thenReturn("123 Main St");
        Mockito.when(home.getCity()).thenReturn("Anytown");
        Mockito.when(home.getState()).thenReturn("CA");
        Mockito.when(home.getZip()).thenReturn("90210");
        assertEquals("123 Main St", home.getStreet());
        assertEquals("Anytown", home.getCity());
        assertEquals("CA", home.getState());
        assertEquals("90210", home.getZip());
    }
    
}
