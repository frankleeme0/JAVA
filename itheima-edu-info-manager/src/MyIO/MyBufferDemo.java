package MyIO;

import java.io.*;

public class MyBufferDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("a.txt"));

        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("itheima-edu-info-manager\\a.txt"));

        byte[] bytes=new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }

        bis.close();
        bos.close();
    }
}
