package MultithreadingDemo.Runnable;

import java.util.Scanner;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        //We will define all the task that our thread is going to perform
        System.out.println("Hello Runnable");
        System.out.println("Enter a integer value : ");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
    }
}