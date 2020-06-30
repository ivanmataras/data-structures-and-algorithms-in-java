package ru.ivanmataras.education.chapter4;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;

import static java.lang.System.out;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;



@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestStack {

    @Test
    @BeforeAll
    static void testCreateStackAndPushValues() {

        Stack stack = new Stack(10);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        assertNotNull(stack);

    }

    @Test
    @Order(1)
    void testCreateStackAndPushAndPopValues() {

        Stack stack = new Stack(10);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);

        while (!stack.isEmpty()) {
            int value = stack.pop();
        }

        assertTrue(stack.isEmpty());

    }

}
