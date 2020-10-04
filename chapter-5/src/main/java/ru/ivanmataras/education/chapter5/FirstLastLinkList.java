package ru.ivanmataras.education.chapter5;

public class FirstLastLinkList {

    private LinkFirstLastLinkList first;
    private LinkFirstLastLinkList last;

    public FirstLastLinkList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(long dd) {
        LinkFirstLastLinkList newLink = new LinkFirstLastLinkList(dd);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long dd) {
        LinkFirstLastLinkList newLink = new LinkFirstLastLinkList(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public long deleteFirst() {
        long temp = first.dData;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        LinkFirstLastLinkList current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

}