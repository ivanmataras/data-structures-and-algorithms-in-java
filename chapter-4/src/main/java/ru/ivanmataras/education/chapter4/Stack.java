package ru.ivanmataras.education.chapter4;

public class Stack {

    private int maxSize;
    private int[] stackArray;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        stackArray[++top] = element;
    }

    public int pop() {
        return stackArray[top--];
    }

    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}