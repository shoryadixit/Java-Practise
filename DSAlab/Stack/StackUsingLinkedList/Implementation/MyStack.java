package DSAlab.Stack.StackUsingLinkedList.Implementation;

import DSAlab.Stack.StackUsingLinkedList.MyInterface.StackADT;

public class MyStack implements StackADT {
    //head
    private Node top;
    //to keep count of nodes
    private int size;

    public MyStack(){
        top = null;
        size = 0;
    }
    @Override
    public void push(int element) {
        Node node = new Node(element);
        node.setNext(top);
        top = node;
        size++;
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int peek() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
