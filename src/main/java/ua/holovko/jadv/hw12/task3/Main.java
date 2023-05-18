package ua.holovko.jadv.hw12.task3;

class Main {

    public static void throwAllExceptions() throws CustomException1, CustomException2, CustomException3 {

        throw new CustomException1("Custom Exception");
    }

    public static void main(String[] args) {

        try {

            throwAllExceptions();

        } catch (CustomException1 | CustomException2 | CustomException3 e) {

            System.out.println(e.getMessage());

        }
    }
}


