package exercise;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Exercise 4.
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
        final int grade1 = 3;
        final int grade2 = 4;
        final int grade3 = 5;

        var gradeBook1 = new GradeBook();

        // Add students and their grades to the grade book
        gradeBook1.addStudent(new StudentRecord(1, "Bob"), grade1);
        gradeBook1.addStudent(new StudentRecord(1, "Bob"), grade2);
        gradeBook1.addStudent(new StudentRecord(2, "Alice"), grade3);

        LOG.info(gradeBook1
                    .retrieveStudentGrade(new StudentRecord(1, "Bob")));
        LOG.info(gradeBook1
                    .retrieveStudentGrade(new StudentRecord(2, "Alice")));

        LOG.info(gradeBook1);


        var gradeBook2 = new GradeBook();


        // Add students and their grades to the grade book
        gradeBook2.addStudent(new StudentClass(1, "Bob"), grade1);
        gradeBook2.addStudent(new StudentClass(1, "Bob"), grade2);
        gradeBook2.addStudent(new StudentClass(2, "Alice"), grade3);

        LOG.info(gradeBook2.retrieveStudentGrade(new StudentClass(1, "Bob")));
        LOG.info(gradeBook2.retrieveStudentGrade(new StudentClass(2, "Alice")));

        LOG.info(gradeBook2);

    }
}
