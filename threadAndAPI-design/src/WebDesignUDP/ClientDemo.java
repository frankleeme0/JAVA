package WebDesignUDP;

import java.io.IOException;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket();


        String s="送给村长礼物";
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port=10000;
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,address,port);

        ds.send(dp);

        ds.close();

    }
}
