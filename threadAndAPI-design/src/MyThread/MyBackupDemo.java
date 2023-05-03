package MyThread;

public class MyBackupDemo {
    public static void main(String[] args) {
        MyBackupThread mb=new MyBackupThread();
        MyBackupThread2 mb2=new MyBackupThread2();

        mb.setName("主体线程");
        mb2.setName("备用线程");

        mb2.setDaemon(true);

        mb.start();
        mb2.start();
    }
}
