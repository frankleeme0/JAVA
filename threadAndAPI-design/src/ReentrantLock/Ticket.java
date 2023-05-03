package ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{
    private int ticket=100;
    //private static Object obj=new Object();
    private ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {

        while (true){
            try {
                lock.lock();
                if(ticket<=0){
                    System.out.println("票卖完了");
                    break;
                }else{

                    Thread.sleep(100);

                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"再卖票，"+"还剩下"+ticket+"张票");

                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();

            }
        }
    }
}
