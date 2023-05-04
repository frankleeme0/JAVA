package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService es=Executors.newCachedThreadPool();
        es.submit(()->{
            System.out.println(Thread.currentThread().getName()+"进程在运行");
        });

        Thread.sleep(2000);

        es.submit(()->{
            System.out.println(Thread.currentThread().getName()+"进程在运行");
        });
        es.shutdown();
        System.out.println(Thread.State.TERMINATED);



    }
}
