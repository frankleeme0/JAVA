package NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NIOClient {
    public static void main(String[] args) throws IOException {
        SocketChannel sc=SocketChannel.open();
        sc.connect(new InetSocketAddress("127.0.0.1",10001));

        ByteBuffer b=ByteBuffer.wrap("首次传输数据".getBytes());
        sc.write(b);
        sc.shutdownOutput();

        sc.close();


    }
}
