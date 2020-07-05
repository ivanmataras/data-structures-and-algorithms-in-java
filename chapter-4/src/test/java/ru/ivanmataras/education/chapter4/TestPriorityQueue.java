package ru.ivanmataras.education.chapter4;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPriorityQueue {

    @Test
    @Order(1)
    public void testPriorityQueue() {

        PriorityQueue priorityQueue = new PriorityQueue(5);
        priorityQueue.insert(30);
        priorityQueue.insert(50);
        priorityQueue.insert(10);
        priorityQueue.insert(40);
        priorityQueue.insert(20);
        while (!priorityQueue.isEmpty()) {
            long item = priorityQueue.remove();
            out.print(item + " ");
        }

        out.println("");

        assertTrue(priorityQueue.isEmpty());

    }
}
