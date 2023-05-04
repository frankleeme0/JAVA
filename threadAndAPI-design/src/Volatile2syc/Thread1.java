package Volatile2syc;

public class Thread1 extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Demo.obj){
                if(Demo.money!=10000){
                    System.out.println("结婚基金已经不是十万元了");
                    break;
                }
            }
        }

    }
}
