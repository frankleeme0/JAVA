package MyThread;

public class Demo extends Thread {
    public Demo() {
    }

    public Demo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() +i);
        }
    }
}
