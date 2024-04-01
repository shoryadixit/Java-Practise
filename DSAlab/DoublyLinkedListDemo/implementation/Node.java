package src.DSAlab.DoublyLinkedListDemo.implementation;

/**
 * This class will contain doubly linked list node. Complete the class as per
 * doubly linked list specification.
 * You are free to override Object class methods and
 * also free to implement any interface from java library.
 */

public class Node {
    //store element of sequence
    private int data;

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    //refer to next node of sequence
    private Node next;

    private Node previous;

    //constructor, create a node with given data
    public Node(int data) {
        this.data = data;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
