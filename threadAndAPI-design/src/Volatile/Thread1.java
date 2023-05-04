package Volatile;

public class Thread1 extends Thread{
    @Override
    public void run() {
        while(Demo.money==10000){

        }
        System.out.println("结婚基金已经不是十万元了");
    }
}
