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
    public int find(int value) {

        int result = 0;
        int lowerBound = 0;
        int upperBound = numberElements - 1;
        int currentIndex;

        while (true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if (array[currentIndex] == value) {
                result = array[currentIndex];
                return result;
            } else if (lowerBound > upperBound) {
                return result;
            } else {
                if (array[currentIndex] < value) {
                    lowerBound = currentIndex + 1;
                } else {
                    upperBound = currentIndex - 1;
                }
            }
        }

    }

    private int findIndexByValue(int value) {

        int lowerBound = 0;
        int upperBound = numberElements - 1;
        int currentIndex;

        while (true) {
            currentIndex = (lowerBound + upperBound) / 2;
            if (array[currentIndex] == value) {
                return currentIndex;
            } else if (lowerBound > upperBound) {
                return numberElements;
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
        if (numberElements == array.length) {
            grow();
        }
        int insertIndex = findIndexByValue(value);
        for (insertIndex = 0; insertIndex < numberElements; insertIndex++) {
            if (array[insertIndex] > value) {
                break;
            }
        }
        for (int currentIndex = numberElements; currentIndex > insertIndex; currentIndex--) {
            array[currentIndex] = array[currentIndex - 1];
        }
        array[insertIndex] = value;
        numberElements++;
    }

    @Override
    public boolean delete(int value) {

        int currentIndex = findIndexByValue(value);

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
