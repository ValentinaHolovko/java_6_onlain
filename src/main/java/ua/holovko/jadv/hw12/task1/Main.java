package ua.holovko.jadv.hw12.task1;

public class Main {

    public static void main(String[] args) {
        try {
            throw new Exception("Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally executed");
        }
    }
}
