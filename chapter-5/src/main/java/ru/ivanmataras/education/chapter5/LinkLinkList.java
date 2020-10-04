package ru.ivanmataras.education.chapter5;

import static java.lang.System.out;

public class LinkLinkList {

    public int iData;
    public double dData;
    public LinkLinkList next;

    public LinkLinkList(int id, double dd) {
        iData = id;
        dData = dd;
    }

    public void displayLink() {
        out.print("{" + iData + ", " + dData + "} ");
    }

}