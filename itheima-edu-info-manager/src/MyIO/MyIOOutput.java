package MyIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyIOOutput {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("b.txt");
        //一次读取一个字节，字节是数字

        while(fis.read() !=-1){
            System.out.println((char) fis.read());

        }
        fis.close();
    }
}
