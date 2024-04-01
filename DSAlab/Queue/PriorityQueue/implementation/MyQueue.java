package DSAlab.Queue.PriorityQueue.implementation;

import DSAlab.Queue.UsinglinkedList.myInterface.QueueADT;
import Inheritance.Derived.Employee;

public class MyQueue<E extends Comparable<E>> implements QueueADT<E> {
    private E[] arr1;
    private int[] arr2;
    private int front;
    private int rear;
    private int size;

    public MyQueue(E[] arr) {
        this.arr1 = arr;
    }

    @Override
    public void enqueue(E data) {
        //must call rearrange
    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    private void rearrange() {
        for (int i = rear; i > 0; i--) {
            if (arr2[i] > arr2[i-1]){
                //swap
                int temp = arr2[i];
                arr2[i] = arr2[i-1];
                arr2[i-1] = temp;
            }else {
                break;
            }
        }
    }
    //Second Function for rearrange with type parameter E
    private void rearrangeGeneric(){
        for (int i = rear; i > 0; i++) {
            if (arr1[i].compareTo(arr1[i-1]) == 1){
                /*
                In this if condition the crr is a calling object and the parameter passing into the
                compareTo method is argument methods

                --> compareTo() will return 1, if calling object is bigger then argument object
                --> compareTo() will return 0, if both objects are same
                --> compareTo() will return -1, if calling object is smaller then argument object
                */

                //Now perform swapping
                E temp = arr1[i];
                arr1[i] = arr1[i-1];
                arr1[i-1] = temp;
            }
        }
    }
}
