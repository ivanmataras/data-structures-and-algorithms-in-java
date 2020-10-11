package ru.ivanmataras.education.chapter5;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static java.lang.System.out;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestLinkList {

    @Test
    @Order(1)
    public void testLinkList() {

        LinkList theList = new LinkList();

        theList.insertFirst(22, 2.99);
        theList.insertFirst(44, 4.99);
        theList.insertFirst(66, 6.99);
        theList.insertFirst(88, 8.99);

        theList.displayList();

        LinkLinkList f = theList.find(44);

        if(f != null) {
            out.println("Found link with key " + f.iData);
        } else {
            System.out.println("Can’t find link");
        }

        LinkLinkList d = theList.delete(66);

        if(d != null ) {
            out.println("Deleted link with key " + d.iData);
        } else {
            out.println("Can’t delete link");
        }

        theList.displayList();
    }

}