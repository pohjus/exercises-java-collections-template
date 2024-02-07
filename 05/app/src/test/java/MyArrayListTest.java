package exercise;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyArrayListTest {

    private MyArrayList list;

    @Before
    public void setUp() {
        list = new MyArrayList();
    }

    @Test
    public void testAdd() {
        list.add("Element1");
        assertFalse("List should not be empty after add operation", list.isEmpty());
    }

    @Test
    public void testGet() {
        list.add("Element1");
        assertEquals("Retrieved element should match added element",
                     "Element1", list.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWithInvalidIndex() {
        list.get(1); // Should throw IndexOutOfBoundsException
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
        assertTrue("List should be empty after clear operation", list.isEmpty());
    }

    @Test
    public void testRemoveByIndex() {
        list.add("Element1");
        Object removed = list.remove(0);
        assertEquals("Removed element should match 'Element1'", "Element1", removed);
        assertTrue("List should be empty after remove operation", list.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveByIndexWithInvalidIndex() {
        list.remove(1); // Should throw IndexOutOfBoundsException
    }

    @Test
    public void testRemoveByElement() {
        list.add("Element1");
        boolean result = list.remove("Element1");
        assertTrue("Remove should return true when element is successfully removed", result);
        assertTrue("List should be empty after element is removed", list.isEmpty());
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
        assertFalse("List should not be empty after adding an element", list.isEmpty());
    }

    @Test
    public void testEnsureCapacity() {
        for (int i = 0; i < 20; i++) { // Exceed initial capacity
            list.add("Element" + i);
        }
        assertEquals("Size should match number of added elements", 20, list.size());
    }
}
