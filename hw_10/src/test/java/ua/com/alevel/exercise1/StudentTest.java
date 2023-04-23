package ua.com.alevel.exercise1;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testGetScholarshipForStudentWithAverageMark5() {
        Student student = new Student("John", "Doe", "Group A", 5.0);
        Assert.assertEquals(100, student.getScholarship());
    }

    @Test
    public void testGetScholarshipForStudentWithAverageMarkLessThan5() {
        Student student = new Student("Jane", "Doe", "Group B", 4.5);
        Assert.assertEquals(80, student.getScholarship());
    }

    @Test
    public void testGetScholarshipForAspirantWithAverageMark5() {
        Aspirant aspirant = new Aspirant("Bob", "Smith", "Group C", 5.0, "Scientific Work");
        Assert.assertEquals(200, aspirant.getScholarship());
    }

    @Test
    public void testGetScholarshipForAspirantWithAverageMarkLessThan5() {
        Aspirant aspirant = new Aspirant("Alice", "Johnson", "Group D", 4.5, "Scientific Work");
        Assert.assertEquals(180, aspirant.getScholarship());
    }
}

