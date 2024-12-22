import java.util.*;

public class MultiThreading extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(1000, 500);
            } catch (InterruptedException e) {
                System.out.println(e);
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) throws Exception{
        MultiThreading obj = new MultiThreading();
        obj.start();
        obj.join(5000);

        MultiThreading obj2 = new MultiThreading();
        
        obj2.start();

        for (int i = 1; i < 5; i++) {
            System.out.println("Main Thread " + i);
        }
    }
}
