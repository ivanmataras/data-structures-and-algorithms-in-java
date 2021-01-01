package ru.ivanmataras.education.chapter6;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestRecursiveMergeSortSortDataArray {

    @Test
    @Order(1)
    public void testLinkList() {
        int maxSize = 100;
        RecursiveMergeSortDataArray recursiveMergeSortDataArray;
        recursiveMergeSortDataArray = new RecursiveMergeSortDataArray(maxSize);
        recursiveMergeSortDataArray.insert(64);
        recursiveMergeSortDataArray.insert(21);
        recursiveMergeSortDataArray.insert(33);
        recursiveMergeSortDataArray.insert(70);
        recursiveMergeSortDataArray.insert(12);
        recursiveMergeSortDataArray.insert(85);
        recursiveMergeSortDataArray.insert(44);
        recursiveMergeSortDataArray.insert(3);
        recursiveMergeSortDataArray.insert(99);
        recursiveMergeSortDataArray.insert(0);
        recursiveMergeSortDataArray.insert(108);
        recursiveMergeSortDataArray.insert(36);
        recursiveMergeSortDataArray.display();
        recursiveMergeSortDataArray.mergeSort();
        recursiveMergeSortDataArray.display();
    }

}