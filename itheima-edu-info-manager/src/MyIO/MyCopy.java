package MyIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("a.txt");
        FileOutputStream fos=new FileOutputStream("itheima-edu-info-manager\\a.txt");

        byte [] bytes=new byte[1024];
        int len;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }
}
