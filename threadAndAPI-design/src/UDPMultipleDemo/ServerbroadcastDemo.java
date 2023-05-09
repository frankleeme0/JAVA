package UDPMultipleDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class ServerbroadcastDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ms=new DatagramSocket(10000);


        byte[] bytes=new byte[1024];
        DatagramPacket dp=new DatagramPacket(bytes, bytes.length);



        ms.receive(dp);

        byte[] data = dp.getData();
        int length = dp.getLength();

        System.out.println(new String(data,0,length));

        ms.close();
    }
}
