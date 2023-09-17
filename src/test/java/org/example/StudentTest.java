package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    private Student student;

    @BeforeEach
    public void setUp() {
        student = new Student("Alice", 85.0, 92.5);
    }

    @Test
    public void testCalculateAverageScore() {
        double averageScore = student.calculateAverageScore();
        assertEquals(88.75, averageScore, 0.01, "Average score should be approximately 88.75");
    }

    @Test
    public void testCalculateGrade() {
        String grade = student.calculateGrade();
        assertEquals("A", grade, "Alice's grade should be 'B'");
    }

    @Test
    public void testCalculateGradeForFailingStudent() {
        student = new Student("Bob", 45.0, 32.5);
        String grade = student.calculateGrade();
        assertEquals("F", grade, "Bob's grade should be 'F'");
    }
}
