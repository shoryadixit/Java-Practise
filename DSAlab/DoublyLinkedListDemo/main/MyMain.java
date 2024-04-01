package DSAlab.DoublyLinkedListDemo.main;

import DSAlab.DoublyLinkedListDemo.implementation.MyDoublyLinkedList;

import java.util.LinkedList;

public class MyMain {
    public static  void main(String[] args) {
        //create MyDoublyLinkedList instance and
        // call all the method to test your implementation
        MyDoublyLinkedList doublyLinkedList = new MyDoublyLinkedList();

        doublyLinkedList.addFirst(10);
        doublyLinkedList.addFirst(20);
        doublyLinkedList.addFirst(30);
        doublyLinkedList.addLast(50);
        doublyLinkedList.addFirst(100);
        doublyLinkedList.traverse();

        System.out.println();

        System.out.println(doublyLinkedList.lastWithoutUsingTail());

        doublyLinkedList.addInBetween(20,50);

        doublyLinkedList.traverse();
        System.out.println();
        System.out.println(doublyLinkedList.size());
        System.out.println(doublyLinkedList.size());

        System.out.println("Perform remove given node");
        System.out.println(doublyLinkedList.removeGivenNode(20));
        doublyLinkedList.traverse();
    }
}
