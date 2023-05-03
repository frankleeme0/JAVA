package MyThread;

public class Demo2 {
    public static void main(String[] args) throws InterruptedException {
        Demo demo=new Demo("bbb");
        Demo demo1=new Demo("bbb");
        demo1.setName("aaa");
        //start方法native本地交互
        demo.start();
        demo1.start();
        String name = Thread.currentThread().getName();
        System.out.println(name);
        Thread.sleep(1000);
    }
}
