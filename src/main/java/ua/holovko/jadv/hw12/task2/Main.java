package ua.holovko.jadv.hw12.task2;

public class Main {

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception2 e) {
            System.out.println(e.getMessage());
        }
    }

    public static void f() throws Exception2 {
        try {
            g();
        } catch (Exception1 e) {
            throw new Exception2("Exception 2");
        }
    }

    public static void g() throws Exception1 {
        throw new Exception1("Exception 1");
    }
}


