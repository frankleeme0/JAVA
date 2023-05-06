package Semaphore;

import java.util.concurrent.Semaphore;

public class MyRunnable implements Runnable{
    private  Semaphore  s=new Semaphore(3);
    @Override
    public void run() {
        try {
            s.acquire();

            System.out.println("获得通行证开始行驶");
            Thread.sleep(1000);
            System.out.println("归还通行证");
            s.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
