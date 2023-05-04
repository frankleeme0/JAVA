package BlockQuene;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{
    private ArrayBlockingQueue<String> ar;
    public Foodie(ArrayBlockingQueue<String> ar) {
        this.ar=ar;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("吃货吃了一个"
                +ar.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


}
