package ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool= new ThreadPoolExecutor(2,5,2, TimeUnit.MINUTES,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

        for (int i=0;i<15;i++) {
            pool.submit(new MyRunnable());
        }


        pool.shutdown();
    }
}
