package ua.holovko.jadv.module2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

public class ProductionLineTest {
    private ProductionLine productionLine;
    private FileReader fileReader;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws IOException {
        productionLine = new ProductionLine();
        fileReader = new FileReader("production_log.txt");
        bufferedReader = new BufferedReader(fileReader);
    }

    @After
    public void tearDown() throws IOException {
        productionLine.closeFileWriter();
        bufferedReader.close();
        fileReader.close();
    }

    @Test
    public void testExecuteTask_Success() throws IOException {
        Task taskA = new TaskA();
        productionLine.executeTask(taskA);

        String logEntry = bufferedReader.readLine();
        assertNotNull(logEntry);
        assertTrue(logEntry.contains("Task start: TaskA"));

        logEntry = bufferedReader.readLine();
        assertNotNull(logEntry);
        assertTrue(logEntry.contains("End a task: TaskA, lead time: 5 seconds"));

        assertNull(bufferedReader.readLine());
    }

    @Test
    public void testExecuteTask_MultipleTasks() throws IOException {
        Task taskA = new TaskA();
        Task taskB = new TaskB();
        Task taskC = new TaskC();

        productionLine.executeTask(taskA);
        productionLine.executeTask(taskB);
        productionLine.executeTask(taskC);

        String logEntry = bufferedReader.readLine();
        assertNotNull(logEntry);
        assertTrue(logEntry.contains("Task start: TaskA"));

        logEntry = bufferedReader.readLine();
        assertNotNull(logEntry);
        assertTrue(logEntry.contains("End a task: TaskA, lead time: 5 seconds"));

        logEntry = bufferedReader.readLine();
        assertNotNull(logEntry);
        assertTrue(logEntry.contains("Task start: TaskB"));

        logEntry = bufferedReader.readLine();
        assertNotNull(logEntry);
        assertTrue(logEntry.contains("End a task: TaskB, lead time: 7 seconds"));

        logEntry = bufferedReader.readLine();
        assertNotNull(logEntry);
        assertTrue(logEntry.contains("Task start: TaskC"));

        logEntry = bufferedReader.readLine();
        assertNotNull(logEntry);
        assertTrue(logEntry.contains("End a task: TaskC, lead time: 10 seconds"));

        assertNull(bufferedReader.readLine());
    }
}



