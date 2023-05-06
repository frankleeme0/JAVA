package Atom;

public class MyAtomThread implements Runnable{
    private int count=0;
    private Object lock=new Object();
    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 100; i++) {
                count++;
                System.out.println("已经送了" +
                        count+"个冰淇淋"
                );
            }
        }
    }
}
