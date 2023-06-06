package ua.holovko.jadv.hw14;

public class Main {
    public static void main(String[] args) {
        // Пример использования MySet
        MySet<Integer> set = new MySet<>(5);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        System.out.println(set);
        System.out.println(set.get(0));
        System.out.println(set.get(1));
        System.out.println(set.get(2));

        PrintUtils.printValue("Hello");
        PrintUtils util = new PrintUtils();
        Integer[] array = {1, 2, 3};
        util.printArray(array);
    }
}

