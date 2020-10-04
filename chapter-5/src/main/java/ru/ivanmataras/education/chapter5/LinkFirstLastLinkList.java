package ru.ivanmataras.education.chapter5;

public class LinkFirstLastLinkList {

    public long dData;
    public LinkFirstLastLinkList next;

    public LinkFirstLastLinkList(long d) {
        dData = d;

    }

    public void displayLink() {
        System.out.print(dData + " ");
    }

}