package ua.holovko.jadv.hw10.task2;

import ua.holovko.jadv.hw10.task2.Pow;

public class Main {
    public static void main(String[] args) {
        Pow pow = (number, p) -> {
            int result = 1;
            for (int i = 0; i < p; i++) {
                result *= number;
            }
            return result;
        };

        int number = 7;
        int p = 6;
        int result = pow.pow(number, p);
        System.out.println(number + " в степени " + p + " = " + result);
    }
}


