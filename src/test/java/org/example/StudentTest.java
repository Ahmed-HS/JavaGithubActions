package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testCalculateGrade() {
        Student student = new Student("Ali", 90.0);
        String grade = student.calculateGrade();
        assertEquals("A", grade, "Grade should be A");
    }

    @Test
    public void testCalculateGradeForFailingStudent() {
        Student student = new Student("Ahmed", 82.0);
        String grade = student.calculateGrade();
        assertEquals("B", grade, "Grade should be B");
    }
}
