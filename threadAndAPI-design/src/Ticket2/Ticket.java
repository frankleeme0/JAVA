package Ticket2;

public class Ticket implements Runnable{
    private static int ticket=100;
    //private static Object obj=new Object();创建多个Ticket对象时使用
    @Override
    public void run() {

        while (true){
            if("窗口1".equals(Thread.currentThread().getName())){
                boolean b = sycMethod();
                if(b){
                    break;
                }
            }
            if("窗口2".equals(Thread.currentThread().getName())){
                synchronized (Ticket.class){
                    if(ticket==0){
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

    private static synchronized boolean sycMethod()  {
        if(ticket==0){
            return true;
        }else{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket--;
            System.out.println(Thread.currentThread().getName()+"再卖票，"+"还剩下"+ticket+"张票");
            return false;
        }
    }
}
