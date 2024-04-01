package MultithreadingDemo.Main;

import MultithreadingDemo.Thread.MyThread;

public class MyThreadMain {
    public static void main(String[] args) {
        //step 2 perform
        Thread t1 = new MyThread();
        //step 3 perform
        t1.start();

    }
}
