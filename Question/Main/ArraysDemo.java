package Question.Main;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Now Enter the Array Element");
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt();
            arr[i] = a;
        }
        sc.nextLine();
        System.out.println("Now enter name array");
        String[] name = new String[5];
        for (int i = 0; i < name.length; i++) {
            String s = sc.nextLine();
            name[i] = s;
        }
        //NOw Display the combine array
        System.out.println("Now Show your data : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[ " + arr[i] + " , " + name[i] + " ]");
        }
    }
}