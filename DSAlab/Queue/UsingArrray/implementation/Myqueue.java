package DSAlab.Queue.UsingArrray.implementation;

import DSAlab.Queue.UsinglinkedList.myInterface.QueueADT;

public class Myqueue<E> implements QueueADT<E> {
    private final E[] arr;
    private int front;
    private int rear;
    private int size;

    public Myqueue(E[] arr) {
        this.arr = arr;
        front = 0;
        rear = 0;
        size = 0;
    }

    @Override
    public void enqueue(E data) {
        if (size != arr.length) {
            arr[rear] = data;
            size++;
            rear++;
            //enqueue complete
            //call rearrange
        } else {
            System.out.println("Queue is OverFlow");
        }
    }

    @Override
    public E dequeue() {
        E response = null;
        if (!isEmpty()){
            response = arr[front];
            front++;
            size--;
        }else{
            System.out.println("Queue UnderFlow");
        }
        return response;
    }

    @Override
    public E peek() {
        E response = null;
        if(!isEmpty()){
            response = arr[front];
        }else{
            System.out.println("Invalid State of Queue");
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;// or //size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void traverse() {
        System.out.println("Printing element of Queue");
        System.out.print("Front <-- ");
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " <-- ");
        }
        System.out.print("Rear");
    }
}
