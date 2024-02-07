package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentRecordTest {

    @Test
    public void testRecordComponents() {
        StudentRecord student = new StudentRecord(1, "John Doe");
        assertEquals("Expected ID to match constructor input",
                     1, student.id());
        assertEquals("Expected name to match constructor input",
                     "John Doe", student.name());
    }
}
