package ThreadPool;

import java.util.concurrent.*;

public class ThreadPoolDemo3 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        ThreadPoolExecutor pool= new ThreadPoolExecutor(2,5,2, TimeUnit.MINUTES,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i=0;i<15;i++) {
            int finalI = i;
            pool.submit(()->{
                System.out.println(Thread.currentThread().getName()+ "---"+finalI);
            });
        }
        pool.shutdown();





    }
}
