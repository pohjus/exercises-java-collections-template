package exercise;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyLinkedListTest {

    private MyLinkedList<String> stringList;
    private MyLinkedList<Integer> intList;

    @Before
    public void setUp() {
        stringList = new MyLinkedList<>();
        intList = new MyLinkedList<>();
    }

    @Test
    public void testAddAndGet() {
        stringList.add("Element1");
        assertEquals("Element1", stringList.get(0));

        intList.add(1);
        assertEquals(Integer.valueOf(1), intList.get(0));
    }

    @Test
    public void testSize() {
        assertEquals(0, stringList.size());
        stringList.add("Element1");
        stringList.add("Element2");
        assertEquals(2, stringList.size());
    }

    @Test
    public void testClear() {
        stringList.add("Element1");
        stringList.clear();
        assertEquals(0, stringList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWithInvalidIndex() {
        stringList.get(1);
    }

    @Test
    public void testRemoveByIndex() {
        stringList.add("Element1");
        stringList.add("Element2");
        stringList.remove(0);
        assertEquals("Element2", stringList.get(0));
        assertEquals(1, stringList.size());
    }

    @Test
    public void testRemoveByElement() {
        stringList.add("Element1");
        assertTrue(stringList.remove("Element1"));
        assertEquals(0, stringList.size());

        intList.add(1);
        assertTrue(intList.remove(Integer.valueOf(1)));
        assertEquals(0, intList.size());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stringList.isEmpty());
        stringList.add("Element");
        assertFalse(stringList.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveAtIndexOutOfBounds() {
        stringList.remove(0); // This should throw an IndexOutOfBoundsException
    }

    @Test
    public void testRemoveObjectNotFound() {
        stringList.add("Element1");
        assertFalse(stringList.remove("Element2")); // No element "Element2" in list
        assertEquals(1, stringList.size());
    }

    @Test
    public void testAddMultipleAndRemove() {
        stringList.add("Element1");
        stringList.add("Element2");
        stringList.add("Element3");
        assertEquals(3, stringList.size());

        stringList.remove("Element2");
        assertEquals(2, stringList.size());
        assertEquals("Element3", stringList.get(1));
    }
}
