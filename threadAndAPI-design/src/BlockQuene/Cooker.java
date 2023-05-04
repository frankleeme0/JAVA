package BlockQuene;

import java.util.concurrent.ArrayBlockingQueue;

public class Cooker extends Thread {
    private ArrayBlockingQueue<String> ar;
    public Cooker(ArrayBlockingQueue<String> ar) {
        this.ar=ar;
    }

    @Override
    public void run() {
        while (true) {
            try {
                ar.put("汉堡包");
                System.out.println("厨师放了一个汉堡包");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
