package MyThread;

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr=new MyRunnable();
        Thread tr=new Thread(mr);
        Thread tr2=new Thread(mr);

        tr.start();
        tr2.start();
    }
}
