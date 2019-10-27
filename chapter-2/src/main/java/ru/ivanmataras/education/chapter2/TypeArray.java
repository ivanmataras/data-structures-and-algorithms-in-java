package ru.ivanmataras.education.chapter2;

public interface TypeArray<T> {

    boolean find(T value);

    void insert(T value);

    boolean delete(T value);

    String display();

}
