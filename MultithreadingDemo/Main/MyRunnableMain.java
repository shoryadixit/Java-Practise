package MultithreadingDemo.Main;

import MultithreadingDemo.Runnable.MyRunnable;

public class MyRunnableMain {
    public static void main(String[] args) throws InterruptedException{
        //step 2
        //Create a reference of RunnableMain
        Runnable run = new MyRunnable();
        //step3
        //create a thread regference to target runnable
        Thread thread = new Thread(run);
        //step 4
        thread.start();
        //now implement getstate method
        int i = 1;
        while (i <= 10){
            System.out.println("State of thread " + thread.getState());
            i++;
            Thread.sleep(500);
        }
    }
}
