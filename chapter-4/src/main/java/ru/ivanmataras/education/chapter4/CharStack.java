package ru.ivanmataras.education.chapter4;

public class CharStack {

    private int maxSize;
    private char[] stackArray;
    private int top;

    public CharStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char element) {
        stackArray[++top] = element;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}