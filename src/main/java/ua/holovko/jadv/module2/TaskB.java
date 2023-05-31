package ua.holovko.jadv.module2;

class TaskB implements Task {
    private static final int DURATION_SECONDS = 7;

    @Override
    public int getDurationSeconds() {
        return DURATION_SECONDS;
    }

    @Override
    public void doWork() {
        System.out.println("Task B in Progress: Metal Structure Assembly");
    }
}