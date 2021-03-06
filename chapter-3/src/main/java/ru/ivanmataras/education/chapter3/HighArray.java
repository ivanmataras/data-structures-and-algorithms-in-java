package ru.ivanmataras.education.chapter3;

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

    public int[] getArray() {
        return array;
    }

    public void bubbleSort() {

        int out;
        int in;

        for (out = numberElements - 1; out > 1; out--) {

            for (in = 0; in < out; in++) {

                if (array[in] > array[in + 1]) {
                    int temporaryVariable = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temporaryVariable;
                }

            }

        }

    }

    public void selectionSort() {

        int out;
        int in;
        int min;

        for (out = 0; out < numberElements - 1; out++) {

            min = out;

            for (in = out + 1; in < numberElements; in++) {

                if (array[in] < array[min]) {
                    min = in;
                }

            }

            int temporaryVariable = array[out];
            array[out] = array[min];
            array[min] = temporaryVariable;

        }

    }

    public void insertionSort() {

        int out;
        int in;

        for (out = 1; out < numberElements; out++) {

            int temporaryVariable = array[out];
            in = out;

            while (in > 0 && array[in - 1] >= temporaryVariable) {
                array[in] = array[in - 1];
                --in;
            }

            array[in] = temporaryVariable;

        }

    }

}