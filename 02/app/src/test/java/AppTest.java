package exercise;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppTest {

    @Test
    public void testMeasureRandomAccess() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int size = 100000;

        String resultArrayList = App.measureRandomAccess(arrayList, size);
        String resultLinkedList = App.measureRandomAccess(linkedList, size);

        assertNotNull(resultArrayList);
        assertNotNull(resultLinkedList);
    }

    @Test
    public void testMeasureDeleteFromStart() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int size = 100000;
        int amount = 10000;

        String resultArrayList = App.measureDeleteFromStart(arrayList, size, amount);
        String resultLinkedList = App.measureDeleteFromStart(linkedList, size, amount);

        assertNotNull(resultArrayList);
        assertNotNull(resultLinkedList);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMeasureDeleteFromStartWithInvalidAmount() {
        List<Integer> arrayList = new ArrayList<>();
        int size = 100000;
        int amount = -100; // Invalid amount

        App.measureDeleteFromStart(arrayList, size, amount);
    }
}
