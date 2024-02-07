package exercise;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyArrayListTest {

    private MyArrayList<String> stringList;
    private MyArrayList<Integer> intList;

    @Before
    public void setUp() {
        stringList = new MyArrayList<>();
        intList = new MyArrayList<>();
    }

    @Test
    public void testAddAndGetSize() {
        stringList.add("test1");
        stringList.add("test2");
        assertEquals(2, stringList.size());

        intList.add(1);
        intList.add(2);
        assertEquals(2, intList.size());
    }

    @Test
    public void testGet() {
        stringList.add("test1");
        assertEquals("test1", stringList.get(0));

        intList.add(100);
        assertEquals(Integer.valueOf(100), intList.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetWithInvalidIndex() {
        stringList.get(0); // Should throw IndexOutOfBoundsException
    }

    @Test
    public void testClear() {
        stringList.add("test");
        stringList.clear();
        assertTrue(stringList.isEmpty());
    }

    @Test
    public void testRemoveByIndex() {
        stringList.add("test1");
        stringList.add("test2");
        stringList.remove(0);
        assertEquals("test2", stringList.get(0));
        assertEquals(1, stringList.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemoveByIndexOutOfBounds() {
        stringList.remove(0); // Should throw IndexOutOfBoundsException
    }

    @Test
    public void testRemoveObject() {
        stringList.add("test1");
        boolean result = stringList.remove("test1");
        assertTrue(result);
        assertEquals(0, stringList.size());

        intList.add(123);
        assertTrue(intList.remove(Integer.valueOf(123)));
        assertTrue(intList.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stringList.isEmpty());
        stringList.add("test");
        assertFalse(stringList.isEmpty());
    }

    @Test
    public void testEnsureCapacity() {
        for (int i = 0; i < 20; i++) {
            intList.add(i);
        }
        assertEquals(20, intList.size());
        for (int i = 0; i < 20; i++) {
            assertEquals(Integer.valueOf(i), intList.get(i));
        }
    }
}
