package exercise;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBookTest {

    private PhoneBook phoneBook;

    @Before
    public void setUp() {
        phoneBook = new PhoneBook();
        phoneBook.addContact(new Contact("Alice", "123456789"));
        phoneBook.addContact(new Contact("Bob", "987654321"));
        phoneBook.addContact(new Contact("Alice", "555555555"));
        phoneBook.addContact(new Contact("Charlie", "333333333"));
    }

    @Test
    public void testAddContact() {
        assertEquals(4, phoneBook.toString().split("\\|").length);
    }

    @Test
    public void testLookupContact() {
        List<String> aliceNumbers = phoneBook.lookupContact("Alice");
        assertEquals(2, aliceNumbers.size());
        assertTrue(aliceNumbers.contains("123456789"));
        assertTrue(aliceNumbers.contains("555555555"));

        List<String> bobNumbers = phoneBook.lookupContact("Bob");
        assertEquals(1, bobNumbers.size());
        assertTrue(bobNumbers.contains("987654321"));

        List<String> charlieNumbers = phoneBook.lookupContact("Charlie");
        assertEquals(1, charlieNumbers.size());
        assertTrue(charlieNumbers.contains("333333333"));

        List<String> unknownNumbers = phoneBook.lookupContact("Unknown");
        assertTrue(unknownNumbers.isEmpty());
    }
}
