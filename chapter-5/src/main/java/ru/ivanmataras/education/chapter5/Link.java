package ru.ivanmataras.education.chapter5;

import static java.lang.System.out;

public class Link {

    public int iData;
    public double dData;
    public Link next;

    public Link(int id, double dd) {
        iData = id;
        dData = dd;
    }

    public void displayLink() {
        out.print("{" + iData + ", " + dData + "} ");
    }

}