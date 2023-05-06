package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Demo {
    public static void main(String[] args) {
        CountDownLatch cdl=new CountDownLatch(3);
        //将cdl传入有参构造并将this.cdl=cdl
        Thread MotherThread=new Thread(()->{
            System.out.println("妈妈在收拾碗筷");
        });
        Thread childThread1=new Thread(()->{
            Thread.currentThread().setName("小明");
            for (int i = 0; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName()+"在吃第"+i+"个饺子");
            }


        });

        Thread childThread2=new Thread(()->{
            Thread.currentThread().setName("小虎");
            for (int i = 0; i <= 15; i++) {
                System.out.println(Thread.currentThread().getName()+"在吃第"+i+"个饺子");
            }


        });

        Thread childThread3=new Thread(()->{
            Thread.currentThread().setName("小刚");
            for (int i = 0; i <= 20; i++) {
                System.out.println(Thread.currentThread().getName()+"在吃第"+i+"个饺子");
            }


        });

        childThread1.start();
        childThread2.start();
        childThread3.start();

    }
}
