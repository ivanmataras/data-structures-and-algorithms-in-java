package ru.ivanmataras.education.chapter2;

import java.util.Arrays;

public class OrderedArray implements IntArray {

    private int[] array;
    private int numberElements;
    private static final int DEFAULT_SIZE = 10;

    public OrderedArray() {
        this.array = new int[DEFAULT_SIZE];
        this.numberElements = 0;
    }

    public OrderedArray(int size) {
        this.array = new int[size];
        this.numberElements = 0;
    }

    @Override
    public boolean find(int value) {

        int lowerBound = 0;
        int upperBound = numberElements - 1;
        int currentIndex;

        while (true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if (array[currentIndex] == value) {
                return true;
            } else if (lowerBound > upperBound) {
                return false;
            } else {
                if (array[currentIndex] < value) {
                    lowerBound = currentIndex + 1;
                } else {
                    upperBound = currentIndex - 1;
                }
            }
        }

    }

    @Override
    public void insert(int value) {
        if (numberElements != array.length) {
            int insertIndex;
            for (insertIndex = 0; insertIndex < numberElements; insertIndex++) {
                if (array[insertIndex] > value) {
                    break;
                }
            }
            for (int currentIndex = numberElements; currentIndex > insertIndex; currentIndex--) {
                array[currentIndex] = array[currentIndex - 1];
            }
            array[insertIndex] = value;
        } else {
            grow();
            int insertIndex;
            for (insertIndex = 0; insertIndex < numberElements; insertIndex++) {
                if (array[insertIndex] > value) {
                    break;
                }
            }
            for (int currentIndex = numberElements; currentIndex > insertIndex; currentIndex--) {
                array[currentIndex] = array[currentIndex - 1];
            }
            array[insertIndex] = value;
        }
        numberElements++;
    }

    @Override
    public boolean delete(int value) {
        return false;
    }

    private void grow() {
        int[] newarray = new int[array.length + 1];
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            newarray[currentIndex] = array[currentIndex];
        }
        array = newarray;
    }

    @Override
    public int size() {
        return this.numberElements;
    }

    @Override
    public String display() {
        return Arrays.toString(array);
    }

}
