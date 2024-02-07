package exercise;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradeBookTest {

    private GradeBook gradeBook;
    private Student student1;
    private Student student2;

    @Before
    public void setUp() {
        gradeBook = new GradeBook();
        student1 = new StudentRecord(1, "John Doe"); // Using StudentRecord for simplicity
        student2 = new StudentRecord(2, "Jane Doe");
    }

    @Test
    public void testAddStudent() {
        gradeBook.addStudent(student1, 90);
        assertEquals("Grade of 90 expected for student1",
                     90, gradeBook.retrieveStudentGrade(student1));
    }

    @Test
    public void testRetrieveStudentGradeExistingStudent() {
        gradeBook.addStudent(student1, 85);
        assertEquals("Grade of 85 expected for student1",
                     85, gradeBook.retrieveStudentGrade(student1));
    }

    @Test
    public void testRetrieveStudentGradeNonExistingStudent() {
        assertEquals("Grade of -1 expected for non-existing student",
                     -1, gradeBook.retrieveStudentGrade(student2));
    }

    @Test
    public void testToString() {
        gradeBook.addStudent(student1, 95);
        gradeBook.addStudent(student2, 88);
        String result = gradeBook.toString();
        assertTrue("toString should contain student1's info",
                   result.contains(student1.toString()) && result.contains("95"));
        assertTrue("toString should contain student2's info",
                   result.contains(student2.toString()) && result.contains("88"));
    }
}
