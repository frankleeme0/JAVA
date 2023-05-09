package TCPUploadOptimal;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(10001);

        ThreadPoolExecutor pool=new ThreadPoolExecutor(3,10,60, TimeUnit.SECONDS,new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());



        while (true) {
            Socket accept = ss.accept();
            ThreadSocket ts=new ThreadSocket(accept);
            //new Thread(ts).start();
            pool.submit(ts);

        }
        //ss.close();

    }
}
