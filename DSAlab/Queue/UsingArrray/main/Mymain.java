package DSAlab.Queue.UsingArrray.main;

import DSAlab.Queue.UsingArrray.implementation.Myqueue;

import java.util.Random;

public class Mymain {
    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        Myqueue<Integer> queue = new Myqueue<>(arr);
        queue.enqueue(200);
        queue.traverse();
        Random random = new Random();
        for (int i = 0; i < 5; i++) queue.enqueue(random.nextInt(10));
        queue.traverse();
        System.out.println();
        System.out.println(queue.peek());
    }
}
