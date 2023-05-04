package Volatile2syc;

public class Thread2 extends Thread{
    @Override
    public void run() {
        synchronized (Demo.obj) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Demo.money=9000;
        }
    }
}
