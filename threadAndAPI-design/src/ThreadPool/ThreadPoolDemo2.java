package ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo2 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool= new ThreadPoolExecutor(2,5,2, TimeUnit.MINUTES,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());

        for (int i=0;i<15;i++) {
            int finalI = i;
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()+ "---"+finalI);
            });
        }



        pool.shutdown();
    }
}
