package Ticket;

public class Ticket implements Runnable{
    private int ticket=100;
    private static Object obj=new Object();
    @Override
    public void run() {

        while (true){
            synchronized (obj){
                if(ticket<=0){
                    System.out.println("票卖完了");
                    break;
                }else{
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket--;
                    System.out.println(Thread.currentThread().getName()+"再卖票，"+"还剩下"+ticket+"张票");

                }
            }

        }
    }
}
