package exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Exercise 3.
 */
public final class App {

    private static final Logger LOG = LogManager.getLogger();

    private App() {
        // Private constructor to prevent instantiation
    }

    /**
     * Main method to run the application.
     *
     * @param args command line arguments (not used)
     */
    public static void main(final String[] args) {
        var phoneBook = new PhoneBook();

        // Add contacts to the phone book
        phoneBook.addContact(new Contact("Alice", "7890"));
        phoneBook.addContact(new Contact("Alice", "7891"));

        // identical, not saved
        phoneBook.addContact(new Contact("Alice", "7891"));

        phoneBook.addContact(new Contact("Bob", "7892"));
        phoneBook.addContact(new Contact("Aadolf", "7893"));

        // Print all contacts
        LOG.info(phoneBook); // Using toString() method

        // Look up a contact
        LOG.info(phoneBook.lookupContact("Alice"));
    }
}
