package ua.holovko.jadv.hw10.task1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Order;

public class AspirantTest {
    @Order(1)
    @Test
    public void testGetScholarshipForAspirantWithAverageMark5() {
        Aspirant aspirant = new Aspirant("Bob", "Smith", "Group В", 5.0, "Scientific Work");
        Assert.assertEquals(200, aspirant.getScholarship());
    }

    @Order(2)
    @Test
    public void testGetScholarshipForAspirantWithAverageMarkLessThan5() {
        Aspirant aspirant = new Aspirant("Alice", "Johnson", "Group В", 4.5, "Scientific Work");
        Assert.assertEquals(180, aspirant.getScholarship());
    }
}
