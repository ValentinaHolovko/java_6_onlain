package ua.holovko.jadv.module2;

public class Main {
    public static void main(String[] args) {
        ProductionLine productionLine = new ProductionLine();

        Task taskA = new TaskA();
        Task taskB = new TaskB();
        Task taskC = new TaskC();

        productionLine.executeTask(taskA);
        productionLine.executeTask(taskB);
        productionLine.executeTask(taskC);
        productionLine.executeTask(taskC);

        productionLine.closeFileWriter();
    }
}