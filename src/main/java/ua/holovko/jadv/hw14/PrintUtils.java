package ua.holovko.jadv.hw14;

import java.util.Arrays;

public class PrintUtils {

    public static <T> void printValue(T value) {
        System.out.println("***" + value + "***");
    }

    public <T> void printArray(T[] array) {
        System.out.println(Arrays.toString(array));
    }
}

