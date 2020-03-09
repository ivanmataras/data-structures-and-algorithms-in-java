package ru.ivanmataras.education.chapter2;

import java.util.Arrays;

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
    public int find(int value) {

        int currentIndex;
        int result = 0;

        for (currentIndex = 0; currentIndex < numberElements; currentIndex++) {
            if (array[currentIndex] == value) {
                result = array[currentIndex];
            }
        }
        return result;
    }

    @Override
    public void insert(int value) {
        if (numberElements == array.length) {
            grow();
        }
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
                if (deleteIndex < numberElements && deleteIndex != numberElements - 1) {
                    array[deleteIndex] = array[deleteIndex + 1];
                } else {
                    array[deleteIndex] = 0;
                    break;
                }
            }
            numberElements--;
            return true;
        }

    }

    private void grow() {
        int[] newArray = new int[array.length + 1];
        for (int currentIndex = 0; currentIndex < array.length; currentIndex++) {
            newArray[currentIndex] = array[currentIndex];
        }
        array = newArray;
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
