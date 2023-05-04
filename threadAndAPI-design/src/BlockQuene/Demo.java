package BlockQuene;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> ar=new ArrayBlockingQueue<>(1);

        Cooker c=new Cooker(ar);
        Foodie f=new Foodie(ar);

        c.start();
        f.start();

    }
}
