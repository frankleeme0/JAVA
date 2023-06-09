package ConcurrentHashThread;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String,String> hm=new ConcurrentHashMap<>();

        Thread t1=new Thread(()->{
            for (int i = 0; i < 25; i++) {
                hm.put(i+"",i+"");

            }
        });

        Thread t2=new Thread(()->{
            for (int i = 25; i < 51; i++) {
                hm.put(i+"",i+"");

            }
        });

        t1.start();
        t2.start();

        Thread.sleep(1000);

        for (int i = 0; i < 51; i++) {
            System.out.println(hm.get(i+""));
        }
    }
}
