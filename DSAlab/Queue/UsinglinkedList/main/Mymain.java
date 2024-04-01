package DSAlab.Queue.UsinglinkedList.main;

import DSAlab.Queue.UsinglinkedList.implementation.MyQueue;

import java.util.Random;

public class Mymain {
    public static void main(String[] args) {
        /*Using linked list to implement a queue*/
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(200);
        queue.traverse();
        Random random = new Random();
        for (int i = 0; i < 5; i++){
            queue.enqueue(random.nextInt(10));
        }
        System.out.println();
        queue.traverse();
    }
}
