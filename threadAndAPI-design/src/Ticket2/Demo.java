package Ticket2;

public class Demo {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();

        Thread t1=new Thread(ticket);
        Thread t2=new Thread(ticket);


        t1.setName("窗口1");
        t2.setName("窗口2");


        t1.start();
        t2.start();


    }
}
