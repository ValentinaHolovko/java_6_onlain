package ua.com.alevel.exercise1;

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

    @Order(3)
    @Test
    public void testGetScholarshipForAspirantWithAverageMark5() {
        Aspirant aspirant = new Aspirant("Bob", "Smith", "Group В", 5.0, "Scientific Work");
        Assert.assertEquals(200, aspirant.getScholarship());
    }

    @Order(4)
    @Test
    public void testGetScholarshipForAspirantWithAverageMarkLessThan5() {
        Aspirant aspirant = new Aspirant("Alice", "Johnson", "Group В", 4.5, "Scientific Work");
        Assert.assertEquals(180, aspirant.getScholarship());
    }
}

