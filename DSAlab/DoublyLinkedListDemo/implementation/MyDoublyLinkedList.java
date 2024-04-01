package DSAlab.DoublyLinkedListDemo.implementation;

import src.DSAlab.DoublyLinkedListDemo.myinterface.DoublyLinkedListADT;
import src.DSAlab.DoublyLinkedListDemo.implementation.Node;
/**
 * Implement all the methods from DoublyLinkedListADT
 */

public class MyDoublyLinkedList implements DoublyLinkedListADT {
    /**
     * This method will add a new node in the linked list at the head.
     * It is also known as insertAtBeginning or insertAtHead.
     * It also increase the size of linked list
     *
     * @param element it is the element of the sequence, we are creating
     * an integer linked list.
     */

    //Head reference or start of linked list or reference of first node
    private Node head;

    //tail reference or end of linked list or reference of last node
    private Node tail;

    //store total number of elements in linked list
    private int size;


    @Override
    public void addFirst(int element) {
        Node node = new Node(element);
        if (!isEmpty()) {
            node.setPrevious(null);
            node.setNext(head);
            head.setPrevious(node);
            head = node;

        } else {
            head = node;
            tail = node;
            head.setPrevious(null);
            head.setNext(null);
        }
        size++;
    }

    /**
     * This method will add a new node in the linked list at the end or tail.
     * It is also known as insertAtTail or insertAtEnd.
     * It also increase the size of linked list
     *
     * @param element it is the element of the sequence, we are creating
     *                an integer linked list.
     */
    @Override
    public void addLast(int element) {
        Node node = new Node(element);
        if (!isEmpty()) {
            tail.setNext(node);
            node.setNext(null);
            node.setPrevious(tail);
            tail = node;
        } else {
            head = node;
            tail = node;
            head.setPrevious(null);
            head.setNext(null);
        }
    }

    /**
     * This method will add a new node in the linked list after the node containing givenElement,
     * if the givenElement not present in the list it will not add the node.
     * It also increase the size of linked list if givenElement is present.
     *
     * @param element      it is the element of the sequence.
     * @param givenElement it is the element after which we have to add the node
     */
    @Override
    public void addInBetween(int element, int givenElement) {
        Node temp = head;
        Node node = new Node(givenElement);
        if (!isEmpty()) {
            while (temp != null) {
                if (temp.getData() == element) {
                    Node temp1 = temp.getNext();
                    node.setPrevious(temp);
                    node.setNext(temp1);
                    temp.setNext(node);
                    temp1.setPrevious(node);
                    size++;
                }
                temp = temp.getNext();
            }
        } else {
            System.out.println("Element not found to add after that element" + element);
        }
    }

    /**
     * This method will remove the first node of the linked list.
     * It is also known as deleteFromHead or deleteFromBeginning.
     *
     * @return data of the first node, if list not empty, otherwise it will return 0,
     * considering 0 as invalid data.
     */
    @Override
    public int removeFirst() {
        int response = 0;
        if (head.getNext() != null) {
            response = head.getData();
            head = head.getNext();
            head.setPrevious(null);
            size--;
        } else if (head.getNext() == null) {
            response = head.getData();
            head = null;
            //head.setPrevious(null);
            //head.setNext(null);
            size--;
        } else if (isEmpty()) {
            System.out.println("Doubly_Linked_List is Empty");
        }
        return response;
    }

    /**
     * This method will remove the last node of the linked list.
     * It is also known as deleteFromTail or deleteFromEnd.
     * This method will use tail reference to delete the last node.
     *
     * @return data of the last node, if list not empty, otherwise it will return 0,
     * considering 0 as invalid data.
     */
    @Override
    public int removeLast() {
        Node temp = tail;
        if (!isEmpty()) {
            tail = tail.getPrevious();
            if (tail != null) {
                tail.setNext(null);
            } else {
                head = null;
            }
        }
        return temp.getData();
    }

    /**
     * This method will remove the last node of the linked list.
     * It is also known as deleteFromTail or deleteFromEnd.
     * This method will not use tail reference to delete the last node.
     * In this you have to traverse and identify the last node to delete
     *
     * @return data of the last node, if list not empty, otherwise it will return 0,
     * considering 0 as invalid data.
     */
    @Override
    public int removeLastWithoutUsingTail() {
        Node temp = tail;
        if (!isEmpty()) {
            temp = temp.getPrevious();
            if (temp != null) {
                temp.setNext(null);
            } else {
                head = null;
            }
        }
        tail = temp;
        size--;
        return temp.getData();
    }

    /**
     * This method will remove the given node, which contains the givenElement.
     * If givenElement present in the list, it will delete the node containing givenElement
     * otherwise it will return 0.
     *
     * @param givenElement the element of the given linked list
     * @return will return the data of deleted node, if node present in list otherwise it will
     * return 0, considering 0 as invalid data.
     */
    @Override
    public int removeGivenNode(int givenElement) {
        int response = 0;
        Node temp = head;
        Node node = new Node(givenElement);
        if (!isEmpty()) {
            while (temp != null){
                if (temp.getNext() == node){
                    Node node1 = node.getNext();
                    temp.setNext(node1);
                    node1.setPrevious(temp);
                    response = node1.getData();
                }
                temp = temp.getNext();
            }
        }
        return response;
    }

    /**
     * This method will return the data of the first node, if linked list is not empty.
     * This is also known as headElement or firstElement
     *
     * @return will return data of the first node if linked list is not empty,
     * otherwise it will return 0, considering 0 as invalid data.
     */
    @Override
    public int first() {
        int response = 0;
        if (!isEmpty()) {
            response = head.getData();
        }
        return response;
    }

    /**
     * This method will return the data of the last node, if linked list is not empty.
     * This is also known as tailElement or lastElement.
     * This method will use tail reference.
     *
     * @return will return data of the last node if linked list is not empty,
     * otherwise it will return 0, considering 0 as invalid data.
     */

    @Override
    public int last() {

        int response = 0;
        if (!isEmpty()) {
            response = tail.getData();
        }
        return response;
    }

    /**
     * This method will return the data of the last node, if linked list is not empty.
     * This is also known as tailElement or lastElement.
     * This method will not use tail reference.
     * In this you have to traverse and identify the last node
     *
     * @return will return data of the last node if linked list is not empty,
     * otherwise it will return 0, considering 0 as invalid data.
     */
    @Override
    public int lastWithoutUsingTail() {

        Node temp = tail;
        int response = 0;
        if (!isEmpty()) {
            response = tail.getData();
        }
        return response;
    }

    /**
     * This method will check if linked list is empty or not.
     *
     * @return will return true is linked list is empty, otherwise false.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * This method will return total number of nodes in given linked list.
     *
     * @return will return an integer value that is total number of nodes in linked list.
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * This method will print data of each node in the linked list. if linked list is not empty,
     * otherwise it will do nothing.
     */
    @Override
    public void traverse() {
        if (!isEmpty()) {
            Node temp = head;
            System.out.print("Head");
            while (temp != null) {
                System.out.print(" --> " + temp.getData());
                temp = temp.getNext();
            }
            System.out.print(" --> null");
        } else {
            System.out.println("Doubly Linked List is Empty.");
        }
    }

    /**
     * This method will check if the searchElement is present in the linked list.
     * You have to traverse each node and compare data of node with the searchElement.
     *
     * @param searchElement is the element we have to search in the linked list
     * @return it will return true if the searchElement is present in the list otherwise false
     */
    @Override
    public boolean search(int searchElement) {
        boolean response = false;
        Node temp = head;
        if (!isEmpty()) {
            while (temp != null) {
                if (temp.getData() == searchElement) {
                    response = true;
                }
                temp = temp.getNext();
            }
        }
        return response;
    }
}
