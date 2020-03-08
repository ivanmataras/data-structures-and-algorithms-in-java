package ru.ivanmataras.education.chapter2;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrderedArray {

    private static OrderedArray orderedArray;
    private static final int DEFAULT_SIZE = 10;

    @Test
    @BeforeAll
    static void testCreateArrayAndInsertValues() {
        orderedArray = new OrderedArray();
        orderedArray.insert(77);
        orderedArray.insert(99);
        orderedArray.insert(44);
        orderedArray.insert(55);
        orderedArray.insert(22);
        orderedArray.insert(88);
        orderedArray.insert(11);
        orderedArray.insert(0);
        orderedArray.insert(66);
        orderedArray.insert(33);
        assertEquals(DEFAULT_SIZE, orderedArray.size());
    }

    @Test
    @Order(1)
    void testSearchExistingValue() {
        int result = orderedArray.find(33);
        assertEquals(33, result);
    }

    @Test
    @Order(2)
    void testSearchNotExistingValue() {
        int result = orderedArray.find(3);
        assertEquals(0, result);
    }

    @Test
    @Order(3)
    void testDeleteExistingValue() {
        boolean result = orderedArray.delete(33);
        assertEquals(true, result);
    }

    @Test
    @Order(4)
    void testDeleteNotExistingValue() {
        boolean result = orderedArray.delete(35);
        assertEquals(false, result);
    }

    @Test
    @Order(5)
    void testInsertAdditionalElements() {
        orderedArray.insert(97);
        orderedArray.insert(98);
    }

    @Test
    @Order(6)
    void testDeletePreviousToLastExistingValue() {
        boolean result = orderedArray.delete(97);
        assertEquals(true, result);
    }

    @Test
    @Order(7)
    void testDeleteLastExistingValue() {
        boolean result = orderedArray.delete(98);
        assertEquals(true, result);
    }


}
