package ua.holovko.jadv.hw10;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;

public class StudentTest {
    @Order(1)
    @Test
    public void testGetScholarshipForStudentWithAverageMark5() {
        Student student = new Student("John", "Doe", "Group A", 5.0);
        Assert.assertEquals(100, student.getScholarship());
    }

    @Order(2)
    @Test
    public void testGetScholarshipForStudentWithAverageMarkLessThan5() {
        Student student = new Student("Jane", "Doe", "Group A", 4.5);
        Assert.assertEquals(80, student.getScholarship());
    }

}

