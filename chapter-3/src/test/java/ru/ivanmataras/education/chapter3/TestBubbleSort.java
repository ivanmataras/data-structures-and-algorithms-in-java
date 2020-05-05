package ru.ivanmataras.education.chapter3;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestBubbleSort {

    private static HighArray highArraySample;
    private static final int DEFAULT_SIZE = 10;

    @Test
    @BeforeAll
    static void testCreateArrayAndInsertValues() {
        highArraySample = new HighArray();
        highArraySample.insert(0);
        highArraySample.insert(11);
        highArraySample.insert(22);
        highArraySample.insert(33);
        highArraySample.insert(44);
        highArraySample.insert(55);
        highArraySample.insert(66);
        highArraySample.insert(77);
        highArraySample.insert(88);
        highArraySample.insert(99);
        assertEquals(DEFAULT_SIZE, highArraySample.size());
    }

    @Test
    @Order(1)
    void testBubbleSort() {
        HighArray highArray = new HighArray();
        highArray.insert(77);
        highArray.insert(99);
        highArray.insert(44);
        highArray.insert(55);
        highArray.insert(22);
        highArray.insert(88);
        highArray.insert(11);
        highArray.insert(0);
        highArray.insert(66);
        highArray.insert(33);
        highArray.bubbleSort();
        assertEquals(highArraySample.getArray(), highArray.getArray());
    }

    @Test
    @Order(2)
    @Disabled
    void testSelectionSort() {
        HighArray highArray = new HighArray();
        highArraySample.insert(77);
        highArraySample.insert(99);
        highArraySample.insert(44);
        highArraySample.insert(55);
        highArraySample.insert(22);
        highArraySample.insert(88);
        highArraySample.insert(11);
        highArraySample.insert(0);
        highArraySample.insert(66);
        highArraySample.insert(33);
    }

    @Test
    @Order(3)
    @Disabled
    void testInsertionSort() {
        HighArray highArray = new HighArray();
        highArraySample.insert(77);
        highArraySample.insert(99);
        highArraySample.insert(44);
        highArraySample.insert(55);
        highArraySample.insert(22);
        highArraySample.insert(88);
        highArraySample.insert(11);
        highArraySample.insert(0);
        highArraySample.insert(66);
        highArraySample.insert(33);
    }

}