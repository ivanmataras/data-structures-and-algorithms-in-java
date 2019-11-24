package ru.ivanmataras.education.chapter2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestOrderedArray {

    private static OrderedArray highArray;
    private static final int DEFAULT_SIZE = 10;

    @Test
    @BeforeAll
    static void testCreateArray() {

        highArray = new OrderedArray();
        assertNotNull(highArray);

    }

    @Test
    @BeforeAll
    static void testInsertValues() {

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
    @Disabled
    void testSearchExistingValue() {
        boolean result = highArray.find(33);
        assertEquals(true, result);
    }

    @Test
    @Disabled
    void testSearchNotExistingValue() {
        boolean result = highArray.find(3);
        assertEquals(false, result);
    }

    @Test
    @Disabled
    void testDeleteExistingValue() {
        boolean result = highArray.delete(33);
        assertEquals(true, result);
    }

    @Test
    @Disabled
    void testDeleteNotExistingValue() {
        boolean result = highArray.delete(35);
        assertEquals(false, result);
    }

    @Test
    @Disabled
    void testInsertAdditionalElements() {
        highArray.insert(97);
        highArray.insert(98);
    }

    @Test
    @AfterAll
    @Disabled
    static void testDestroyArray() {

    }

}
