package DSAlab.Stack.StackUsingArray.Implementation;

import DSAlab.Stack.StackUsingArray.myInterface.StackADT;

public class MyStack implements StackADT {
    //maximum number of elements
    private final int MAX_CAPACITY;
    // to store elements of stack
    private int[] array;
    int top;

    public MyStack(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        //create array
        array = new int[this.MAX_CAPACITY];
        top = 0;
    }

    @Override
    public void push(int element) {
        if (top != MAX_CAPACITY) {//stack is not full
            array[top] = element;
            top++;
        } else {
            System.out.println("Stack_Over_Flow");
        }
    }

    @Override
    public int pop() {
        int response = 0;//considerinng invalid data
        if (!isEmpty()) {
            top--;
            response = array[top];
        } else {
            System.out.println("Stack_Under_Flow");
        }
        return response;
    }

    @Override
    public int peek() {
        int response = 0;
        if (!isEmpty()) {
            response = array[top - 1];
        } else {
            System.out.println("Stack_Is_Empty");
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    public void traverse() {
        for (int i = 0; i < top; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public boolean search(int searchValue) {
        boolean response = false;
        for (int i = 0; i < top; i++) {
            if (array[i] == searchValue) {
                response = true;
                break;
            }
        }
        return response;
    }
}