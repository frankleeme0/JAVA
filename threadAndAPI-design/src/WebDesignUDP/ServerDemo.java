package WebDesignUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(10000);

        byte[] bytes=new byte[1024];

        DatagramPacket dp=new DatagramPacket(bytes, bytes.length    );
        ds.receive(dp);
        //byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println(new String(bytes,0,length));
        ds.close();
        //先运行接收端，如果没有接收到则会阻塞
    }
}
