package DSAlab.Stack.StackUsingArray.MyMain;

import DSAlab.Stack.StackUsingArray.Implementation.MyStack;

public class MainStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(20);
        stack.traverse();
        stack.pop();
        stack.traverse();
        stack.pop();
        stack.traverse();
        stack.pop();
    }
}
