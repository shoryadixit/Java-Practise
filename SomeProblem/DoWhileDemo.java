package SomeProblem;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        //simple syntax of do while loop
        /*
        do {
            //statements...
        } while ();
        */
        System.out.println("Please Enter your Age");
        Scanner sc = new Scanner(System.in);
        byte age = sc.nextByte();
        sc.close();
        //` <- Back Tick, ~ <- tilde
        for (byte index = 0; index < age; index++) {
            System.out.print("`");
        }
        System.out.println();
        for (byte i = 0; i < age; i++) {
            System.out.print("|");
        }
    }
}