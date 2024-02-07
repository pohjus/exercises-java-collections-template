package exercise;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyLinkedListTest {

    private MyLinkedList list;

    @Before
    public void setUp() {
        list = new MyLinkedList();
    }

    @Test
    public void testAdd() {
        list.add("Element1");
        assertFalse("List should not be empty after adding an element", list.isEmpty());
    }

    @Test
    public void testGet() {
        list.add("Element1");
        assertEquals("Retrieved element should match the added element",
                     "Element1", list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWithInvalidIndex() {
        list.get(0); // Should throw IndexOutOfBoundsException
    }

    @Test
    public void testSize() {
        list.add("Element1");
        list.add("Element2");
        assertEquals("Size should be 2 after adding two elements", 2, list.size());
    }

    @Test
    public void testClear() {
        list.add("Element1");
        list.clear();
        assertTrue("List should be empty after clear", list.isEmpty());
    }

    @Test
    public void testRemoveByIndex() {
        list.add("Element1");
        list.remove(0);
        assertTrue("List should be empty after removing the element", list.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveByIndexWithInvalidIndex() {
        list.remove(0); // Should throw IndexOutOfBoundsException
    }

    @Test
    public void testRemoveByElement() {
        list.add("Element1");
        boolean result = list.remove("Element1");
        assertTrue("Remove should return true when element is found and removed", result);
        assertTrue("List should be empty after removing the element", list.isEmpty());
    }

    @Test
    public void testRemoveByElementNotFound() {
        list.add("Element1");
        boolean result = list.remove("Element2");
        assertFalse("Remove should return false when element is not found", result);
    }

    @Test
    public void testIsEmpty() {
        assertTrue("Newly created list should be empty", list.isEmpty());
        list.add("Element1");
        assertFalse("List should not be empty after adding elements", list.isEmpty());
    }

    @Test
    public void testEnsureCapacity() {
        for (int i = 0; i < 11; i++) { // Exceed initial capacity
            list.add("Element" + i);
        }
        assertEquals("List size should match the number of added elements", 11, list.size());
    }
}
