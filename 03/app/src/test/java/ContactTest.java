package exercise;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContactTest {

    @Test
    public void testCompareTo() {
        Contact contact1 = new Contact("Alice", "123456789");
        Contact contact2 = new Contact("Bob", "987654321");
        Contact contact3 = new Contact("Charlie", "555555555");

        // Test when comparing contacts with different names
        assertTrue(contact1.compareTo(contact2) < 0);
        assertTrue(contact2.compareTo(contact1) > 0);

        // Test when comparing contacts with the same name but different phone numbers
        assertTrue(contact1.compareTo(contact3) < 0);
        assertTrue(contact3.compareTo(contact1) > 0);

        // Test when comparing contacts with the same name and phone numbers
        assertEquals(0, contact1.compareTo(new Contact("Alice", "123456789")));
    }
}
