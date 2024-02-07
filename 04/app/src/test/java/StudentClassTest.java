package exercise;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentClassTest {

    private StudentClass student;

    @Before
    public void setUp() {
        student = new StudentClass(1, "John Doe");
    }

    @Test
    public void testName() {
        assertEquals("Expected name to match constructor input",
                     "John Doe", student.name());
    }
}
