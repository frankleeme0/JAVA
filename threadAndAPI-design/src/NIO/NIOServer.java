package NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class NIOServer {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel ssc=ServerSocketChannel.open();

        ssc.bind(new InetSocketAddress(10001));

        ssc.configureBlocking(false);

        Selector selector=Selector.open();
        ssc.register(selector, SelectionKey.OP_ACCEPT);

        while (true){
            SocketChannel sc=ssc.accept();

            int count=selector.select();


            if(count!=0){

                Set<SelectionKey> selectionKeys=selector.selectedKeys();
                Iterator<SelectionKey> iterator=selectionKeys.iterator();

                while(iterator.hasNext()){
                    SelectionKey    selectionKey= iterator.next();
                    if(selectionKey.isAcceptable()){
                        ServerSocketChannel sscc = (ServerSocketChannel) selectionKey.channel();
                        //客户端的延伸通道
                        SocketChannel socketChannel = sscc.accept();
                        //将客户端延伸通道设置为非阻塞的
                        socketChannel.configureBlocking(false);
                        socketChannel.register(selector,SelectionKey.OP_READ);

                    }else if(selectionKey.isReadable()){
                        //当前通道已经做好了读取的准备(延伸通道)
                        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                        ByteBuffer byteBuffer1 = ByteBuffer.allocate(1024);
                        //socketChannel.read(byteBuffer1);
                        int len;
                        while((len = socketChannel.read(byteBuffer1)) > 0){
                            byteBuffer1.flip();
                            System.out.println(new String(byteBuffer1.array(),0,len));
                            byteBuffer1.clear();
                        }
                        socketChannel.write(ByteBuffer.wrap("哎哟喂好疼啊!!!".getBytes()));
                        socketChannel.close();
                    }
                    iterator.remove();
                }
            }
        }


    }
}
