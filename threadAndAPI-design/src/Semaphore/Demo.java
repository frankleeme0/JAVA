package Semaphore;

import java.util.concurrent.Semaphore;

public class Demo {
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();
        for (int i = 0; i < 50; i++) {
            new Thread(mr).start();
        }

    }
}
