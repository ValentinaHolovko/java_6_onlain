package ua.holovko.jadv.module2;

class TaskC implements Task {
    private static final int DURATION_SECONDS = 10;

    @Override
    public int getDurationSeconds() {
        return DURATION_SECONDS;
    }

    @Override
    public void doWork() {
        System.out.println("Task C in Progress: Finished Product Packaging");
    }
}


