package DSAlab.FirstLAB.Main;

import DSAlab.FirstLAB.Implementation.MyArrayImplementation;

import java.util.Random;
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter the size of an Array : ");
        size = sc.nextInt();

        Random var = new Random();

        MyArrayImplementation numbers = new MyArrayImplementation(size);
        for (int i = 0; i < size; i++) {
            numbers.insert(var.nextInt(50));
        }
        System.out.println("This is inserted Array : ");
        numbers.traverse();

        for (int i = 0; i < 2; i++) {
            numbers.delete();
        }

        System.out.println();
        System.out.println("After deletion in Array : 5");
        numbers.traverse();
    }
}
