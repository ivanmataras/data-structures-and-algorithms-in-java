package ru.ivanmataras.education.chapter4;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestQueue {

    @Test
    @Order(1)
    public void testQueue() {

        Queue queue = new Queue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(50);
        queue.insert(60);
        queue.insert(70);
        queue.insert(80);

        while (!queue.isEmpty()) {
            int item = queue.remove();
            out.print(item);
            out.print(" ");
        }

        out.println("");

        assertTrue(queue.isEmpty());

    }

}
