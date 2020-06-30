package ru.ivanmataras.education.chapter4;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestStack {

    @Test
    @BeforeAll
    static void testCreateStackAndPushValues() {

        IntStack stack = new IntStack(10);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        assertNotNull(stack);

    }

    @Test
    @Order(1)
    void testCreateStackAndPushAndPopValues() {

        IntStack stack = new IntStack(10);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        while (!stack.isEmpty()) {
            int value = stack.pop();
        }

        assertTrue(stack.isEmpty());

    }

    @Test
    @Order(2)
    void testCreateStackAndReverseString() {

        String sampleString = "Hello world";
        String sampleStringReversed = "dlrow olleH";

        CharStack stack = new CharStack(sampleString.length());

        for (int charIndex = 0; charIndex < sampleString.length(); charIndex++) {
            char character = sampleString.charAt(charIndex);
            stack.push(character);
        }

        StringBuilder resultString = new StringBuilder();

        while (!stack.isEmpty()) {
            char character = stack.pop();
            resultString.append(character);
        }

        assertEquals(sampleStringReversed, resultString.toString());


    }
}
