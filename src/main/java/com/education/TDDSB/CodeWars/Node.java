package com.education.TDDSB.CodeWars;

public class Node {
    private Node next;

    public Node getNext() {
        return this.next;
    }

    private void setNext(Node next) {
        this.next = next;
    }

    public static Node createChain(int tailSize, int loopSize) {
        Node prevNode = new Node();
        Node start = prevNode;
        start.setNext(start);
        if (loopSize == 1) {
            return start;
        }
        for (int i = 1; i <= tailSize; ++i) {
            prevNode.setNext(new Node());
            prevNode = prevNode.getNext();
        }
        Node endLoop = prevNode;
        for (int i = 1; i < loopSize; ++i) {
            prevNode.setNext(new Node());
            prevNode = prevNode.getNext();
        }
        prevNode.setNext(endLoop);
        return start;
    }
}