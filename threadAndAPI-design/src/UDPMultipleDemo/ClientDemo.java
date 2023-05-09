package UDPMultipleDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();



            String s="hello 广播";



            byte[] bytes=s.getBytes();
            //多播
            //InetAddress ip=InetAddress.getByName("224.0.1.0");
            //广播
            InetAddress ip=InetAddress.getByName("255.255.255.255");

            int port=10000;

            DatagramPacket dp=new DatagramPacket(bytes, bytes.length,ip,port);
            ds.send(dp);

        ds.close();
    }
}
