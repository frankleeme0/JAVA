package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Demo2 {
    public static void main(String[] args) {
        ExecutorService es= Executors.newFixedThreadPool(10);
        ThreadPoolExecutor pool=(ThreadPoolExecutor) es;
        System.out.println(pool.getPoolSize());
        es.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        es.submit(()->{
            System.out.println(Thread.currentThread().getName());
        });
        es.shutdown();
    }
}
