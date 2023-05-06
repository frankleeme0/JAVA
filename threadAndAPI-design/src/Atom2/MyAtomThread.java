package Atom2;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomThread implements Runnable{
    private int count=0;
    AtomicInteger ac=new AtomicInteger(0);
    //private Object lock=new Object();
    @Override
    public void run() {

            for (int i = 0; i < 100; i++) {
                int i1 = ac.incrementAndGet();
                System.out.println("已经送了" +
                        i1+"个冰淇淋"
                );
            }

    }
}
