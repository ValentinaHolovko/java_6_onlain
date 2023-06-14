package ua.holovko.jadv.module2;

import java.io.FileWriter;
import java.io.IOException;

class ProductionLine {
    private Task lastTask;
    private long lastStartTime;
    private FileWriter fileWriter;

    public ProductionLine() {
        lastTask = null;
        try {
            fileWriter = new FileWriter("production_log.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void executeTask(Task task) {
        long currentTime = System.currentTimeMillis();
        if (lastTask != null && currentTime - lastStartTime < lastTask.getDurationSeconds() * 1000L) {
            System.out.println("Line is busy");
            writeLog("Line is busy");
        } else {
            task.doWork();
            lastTask = task;
            lastStartTime = currentTime;
            writeLog("Task start: " + task.getClass().getSimpleName());
            try {
                Thread.sleep(task.getDurationSeconds() * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            long executionTime = (System.currentTimeMillis() - currentTime) / 1000;
            writeLog("End a task: " + task.getClass().getSimpleName() + ", lead time: " + executionTime + " seconds");
        }
    }

    private void writeLog(String message) {
        try {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFileWriter() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

