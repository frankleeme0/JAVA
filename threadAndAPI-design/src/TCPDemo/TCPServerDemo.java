package TCPDemo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(10001);

        Socket accept = serverSocket.accept();

        InputStream is = accept.getInputStream();
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }
        is.close();
        serverSocket.close();


    }
}
