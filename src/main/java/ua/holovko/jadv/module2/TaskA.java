package ua.holovko.jadv.module2;

class TaskA implements Task {
    private static final int DURATION_SECONDS = 5;

    @Override
    public int getDurationSeconds() {
        return DURATION_SECONDS;
    }

    @Override
    public void doWork() {
        System.out.println("Task A in progress: Sawing a block of wood");
    }
}