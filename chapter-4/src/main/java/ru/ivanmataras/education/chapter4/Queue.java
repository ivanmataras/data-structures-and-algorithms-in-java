package ru.ivanmataras.education.chapter4;

public class Queue {

    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int item) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = item;
        nItems++;
    }

    public int remove() {
        int item = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return item;
    }

    public int peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }

}