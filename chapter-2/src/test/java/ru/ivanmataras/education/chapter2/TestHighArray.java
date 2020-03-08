package ru.ivanmataras.education.chapter2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestHighArray {

    private static HighArray highArray;
    private static final int DEFAULT_SIZE = 10;

    @Test
    @BeforeAll
    static void testCreateArrayAndInsertValues() {
        highArray = new HighArray();
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
        assertEquals(DEFAULT_SIZE, highArray.size());
    }

    @Test
    @Order(1)
    void testSearchExistingValue() {
        int result = highArray.find(33);
        assertEquals(33, result);
    }

    @Test
    @Order(2)
    void testSearchNotExistingValue() {
        int result = highArray.find(3);
        assertEquals(0, result);
    }

    @Test
    @Order(3)
    void testDeleteExistingValue() {
        boolean result = highArray.delete(33);
        assertEquals(true, result);
    }

    @Test
    @Order(4)
    void testDeleteNotExistingValue() {
        boolean result = highArray.delete(35);
        assertEquals(false, result);
    }

    @Test
    @Order(5)
    void testInsertAdditionalElements() {
        highArray.insert(97);
        highArray.insert(98);
    }

    @Test
    @Order(6)
    void testDeletePreviousToLastExistingValue() {
        boolean result = highArray.delete(97);
        assertEquals(true, result);
    }

    @Test
    @Order(7)
    void testDeleteLastExistingValue() {
        boolean result = highArray.delete(98);
        assertEquals(true, result);
    }

}
