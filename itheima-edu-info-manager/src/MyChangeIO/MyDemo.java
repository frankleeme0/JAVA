package MyChangeIO;

import java.io.*;

public class MyDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("c:\\users\\frank\\desktop\\a.txt"),"GBK");
        int ch;
        while ((ch=isr.read())!=-1){
            System.out.println((char) ch);

        }
        isr.close();
    }
}
