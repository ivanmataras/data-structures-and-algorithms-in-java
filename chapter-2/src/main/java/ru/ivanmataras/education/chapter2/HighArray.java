package ru.ivanmataras.education.chapter2;

public class HighArray implements IntArray {

    private int[] array;
    private int numberElements;
    private static final int DEFAULT_SIZE = 10;

    public HighArray() {
        this.array = new int[DEFAULT_SIZE];
        this.numberElements = 0;
    }

    public HighArray(int size) {
        this.array = new int[size];
        this.numberElements = 0;
    }

    @Override
    public boolean find(int value) {

        int currentIndex;

        for (currentIndex = 0; currentIndex < numberElements; currentIndex++) {
            if (array[currentIndex] == value) {
                break;
            }
        }

        if (currentIndex == numberElements) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public void insert(int value) {
        array[numberElements] = value;
        numberElements++;
    }

    @Override
    public boolean delete(int value) {

        int currentIndex;
        for (currentIndex = 0; currentIndex < numberElements; currentIndex++) {
            if (value == array[currentIndex]) {
                break;
            }
        }

        if (currentIndex == numberElements) {
            return false;
        } else {
            for (int deleteIndex = currentIndex; deleteIndex < numberElements; deleteIndex++) {
                array[deleteIndex] = array[deleteIndex + 1];
            }
            numberElements--;
            return true;
        }

    }

    @Override
    public int size() {
        return this.numberElements;
    }

    @Override
    public String display() {
        return null;
    }

}
