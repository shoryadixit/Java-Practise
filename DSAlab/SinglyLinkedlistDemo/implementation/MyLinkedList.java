package DSAlab.SinglyLinkedlistDemo.implementation;

import DSAlab.SinglyLinkedlistDemo.Myinterfaces.mySinglyLinkedList;

public class MyLinkedList implements mySinglyLinkedList {

    //head reference or start of linked list or reference of first node
    private Node head;

    //tail reference or end of linked list or reference of last node
    private Node tail;

    //store total number of elements in linked list
    private int size;

    //constructor
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addAfterGivenNode(int givenElemnet, int element) {
        Node node = new Node(element);
        //case 1 not needed

        if (!isEmpty()) {
            if (head == tail) {
                if (head.getData() == givenElemnet) {
                    head.setNext(node);
                    tail = node;
                    size++;
                } else {
                    System.out.println("Given Element not found in list.");
                }
            } else {
                Node temp = head;
                while (temp != null && temp.getData() != givenElemnet) {
                    temp = temp.getNext();
                }
                if (temp != null) {
                    //case 2
                    node.setNext(temp.getNext());
                    temp.setNext(node);
                    size++;
                    if (temp == tail) {
                        tail = node;
                    }
                } else {
                    System.out.println("Given Element not found.");
                }
            }
        } else {
            System.out.println("Empty list");
        }
    }

    @Override
    public void addBeforeGivenNode(int givenElement, int element) {

    }

    @Override
    public int removeFirst() {
        Node temp = head;
        if (!isEmpty()) {
            head = head.getNext();
            System.out.println("First Element Removed.");
            size--;
        } else {
            System.out.println("List is Empty.");
        }
        return (temp.getData());
    }

    @Override
    public int removeLast() {
        Node temp = head;
        if (!isEmpty()) {

            if (size() >= 2) {
                while (temp.getNext().getNext() != null) {
                    temp = temp.getNext();
                }
                temp.setNext(null);
                tail = temp;
                System.out.println("Last element removed.");
                System.out.println("Now new Last Element is here: ");
                size--;
            } else {
                System.out.println("Last Element is not Remove Because Your linked list size is not elligible"
                        + " to perform that task.");
            }
        } else {
            System.out.println("List is empty.");
        }
        return (tail.getData());
    }

    /*
    2nd Method provided by Sir

    int response = 0;
    if (!isEmpty){
        response = tail.getData();
        Node temp = head;
        Node previous = null;
        while (temp.getNext() != null){
            previous = temp;
            temp = temp.getNext();
            }
            //multiple nodes in linked list

            if (previous != null){
                previous.setNext(null);
                tail = previous;
                }

           //single node

           else{
                head = null;
                tail = null;
                }
           size--;
           }
           return response;
           }

     */

    @Override
    public int removeGivenNode(int givenElement) {
        int response = 0;
        Node temp = head;
        if (!isEmpty()) {
            if (temp.getData() == givenElement) {
                head = head.getNext();
                size--;
            } else if (tail.getData() == givenElement) {
                response = removeLast();
            }
        } else if (head.getData() != givenElement && tail.getData() != givenElement) {
            while (temp.getNext() != null) {
                if (temp.getNext().getData() == givenElement) {
                    response = temp.getData();
                    Node x = temp.getNext();
                    temp.setNext(x.getNext());
                    size--;
                }
                temp = temp.getNext();

            }
        }
        return response;
    }

    @Override
    public boolean search(int element) {
        boolean response = false;
        if (!isEmpty()) {
            Node temp = head;
            while (temp.getNext() != null) {
                if (temp.getData() == element) {
                    response = true;
                    break;
                }
                temp = temp.getNext();
            }
        }
        return response;
    }

    @Override
    public int first() {
        if (!isEmpty()) {
            return head.getData();
        }
        return 0;
    }

    @Override
    public int last() {
        if (!isEmpty()) {
            return tail.getData();
        }
        return 0;
    }

    @Override
    public void addFirst(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head = node;
        }
        size++;
    }

    //traverse
    public void traverse() {
        if (!isEmpty()) {
            Node temp = head;
            System.out.print("Head");
            while (temp != null) {
                System.out.print("-->" + temp.getData());
                //updating temp value to refer next node of sequence
                temp = temp.getNext();
            }
            System.out.print("--> null");
        } else {
            System.out.print("Linked List Empty.");
        }
    }

    @Override
    public void addLast(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = node;
            size++;
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    public Node getHead() {
        return head;
    }

    public void reversedLinkedList(Node node) {
        if (node == null) {
            return;
        }
        reversedLinkedList(node.getNext());
        System.out.print(node.getData() + ",");
    }
    Node reverseList(Node head){
        if (head == null || head.getNext() == null)
            return head;

        Node rest = reverseList(head.getNext());
        head = head.getNext().getNext();
        head = head.getNext();
        head = null;
        return rest;
    }
}