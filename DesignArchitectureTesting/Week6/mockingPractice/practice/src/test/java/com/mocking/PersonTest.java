package com.mocking;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;



@ExtendWith(MockitoExtension.class)
public class PersonTest {

    @Mock
    private Address home = Mockito.mock(Address.class);

    @Mock
    private Person person = Mockito.mock(Person.class);

    @Test
    public void testPerson() {
        Person person = new Person("John", "Doe", home);
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(home, person.getHome());
        assertEquals("Person [firstName=John, lastName=Doe, home=" + home.toString() + "]", person.toString());
    }

    @Test
    public void testPersonMock() {
        Mockito.when(person.getFirstName()).thenReturn("John");
        Mockito.when(person.getLastName()).thenReturn("Doe");
        Mockito.when(person.getHome()).thenReturn(home);
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(home, person.getHome()); 
    }

    
}
