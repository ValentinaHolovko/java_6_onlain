package ua.com.alevel.exercise2;

public class Main {
    public static void main(String[] args) {
        Pow pow = (number, p) -> {
            int result = 1;
            for (int i = 0; i < p; i++) {
                result *= number;
            }
            return result;
        };

        int number = 2;
        int p = 4;
        int result = pow.pow(number, p);
        System.out.println(number + " в степени " + p + " = " + result);
    }
}


