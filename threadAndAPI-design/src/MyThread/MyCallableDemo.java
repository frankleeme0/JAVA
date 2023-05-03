package MyThread;

import java.util.concurrent.*;

public class MyCallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc=new MyCallable();
        FutureTask<String> ft=new FutureTask<>(mc);
        Thread th=new Thread(ft);
        th.setName("飞机");
        th.setPriority(6);
        th.start();

        MyCallable mc1=new MyCallable();
        FutureTask<String> ft1=new FutureTask<>(mc1);
        Thread th1=new Thread(ft1);
        th1.setName("坦克");
        System.out.println(th1.getPriority());
        th1.start();

        String s = ft.get();
        System.out.println(s);
    }
}
