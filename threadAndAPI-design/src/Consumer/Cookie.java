package Consumer;

public class Cookie extends Thread {
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if (Desk.count==0){
                    break;
                }else{
                    if(!Desk.flag){
                        System.out.println("厨师正在生产");
                        Desk.flag=true;
                        Desk.lock.notifyAll();
                    }else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }
}
