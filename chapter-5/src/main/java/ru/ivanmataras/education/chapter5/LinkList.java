package ru.ivanmataras.education.chapter5;

public class LinkList {

    private LinkLinkList first;

    public LinkList() {
        first = null;
    }

    public void insertFirst(int id, double dd) {
        LinkLinkList newLink = new LinkLinkList(id, dd);
        newLink.next = first;
        first = newLink;
    }

    public LinkLinkList find(int key) {
        LinkLinkList current = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public LinkLinkList delete(int key) {
        LinkLinkList current = first;
        LinkLinkList previous = first;
        while (current.iData != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first) {
            first = first.next;
        } else {
            previous.next = current.next;
        }
        return current;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        LinkLinkList current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }

}