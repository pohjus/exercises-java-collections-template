package exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Exercise 2.
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
        final int size = 5000000; // Change this to your desired size
        final int amount = 100;

        LOG.info(measureRandomAccess(new ArrayList<>(), size));
        LOG.info(measureRandomAccess(new LinkedList<>(), size));

        // Measure and print insert/delete time
        LOG.info(measureDeleteFromStart(new ArrayList<>(), size, amount));
        LOG.info(measureDeleteFromStart(new LinkedList<>(), size, amount));
    }


    /**
     * Measures the time taken for random access to an element in the list.
     * Fetch for example the middle integer (size / 2) from the list.
     *
     * @param list the list to perform random access on
     * @param size the size of the list
     * @return a string representing the time taken for random access
     */
    public static String measureRandomAccess(final List<Integer> list,
                                             final int size) {
        return "Random Access Time (" + list.getClass().getSimpleName() + "): "
                  + (endTime - startTime) + " nanoseconds";
    }


    /**
     * Measures the time taken for deleting elements from the start of the list.
     * (index 0)
     *
     * @param list   the list to perform deletion on
     * @param size   the size of the list
     * @param amount the number of elements to delete
     * @return a string representing the time taken for deletion
     * @throws IllegalArgumentException if the amount is negative or exceeds
     *                                  the list size
     */
    public static String measureDeleteFromStart(final List<Integer> list,
                                                final int size,
                                                final int amount) {

        return "Delete Time (" + list.getClass().getSimpleName() + "): "
                + (endTime - startTime) + " nanoseconds";
    }
}
