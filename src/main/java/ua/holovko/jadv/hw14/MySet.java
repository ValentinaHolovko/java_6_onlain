package ua.holovko.jadv.hw14;

import java.util.Arrays;

public class MySet<T> {
    private Object[] elements;
    private int size;

    public MySet(int initialSize) {
        elements = new Object[initialSize];
        size = 0;
    }

    public void add(T element) {
        if (contains(element)) {
            return;
        }

        if (size == elements.length) {
            resizeArray();
        }

        elements[size] = element;
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        return (T) elements[index];
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elements[i]).append(", ");
        }
        sb.append(elements[size - 1]).append("]");
        return sb.toString();
    }

    private boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    private void resizeArray() {
        int newCapacity = elements.length * 2;
        elements = Arrays.copyOf(elements, newCapacity);
    }
}

