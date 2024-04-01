package Inheritance.Lambda.Main;

import Inheritance.Lambda.MyInterface.MyFinctionalInterface;

public class My_main {
    public static void main(String[] args) {
        //we can define the behaviour
        //by writting lambda expression
        MyFinctionalInterface add = (x, y) -> {
            return x + y;
        };

        int result = add.operation(10,20);
        System.out.println("Result = " + result);
    }
}
