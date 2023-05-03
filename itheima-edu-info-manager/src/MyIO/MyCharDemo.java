package MyIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class MyCharDemo {
    public static void main(String[] args) throws IOException {
//        FileWriter fw=new FileWriter(new File("b.txt"));
        FileWriter fw=new FileWriter("b.txt", Charset.forName("GBK"));
        char[] chars={97,98};
//        fw.write(97);
        fw.write(chars,0,1);

        fw.write("黑马");

        fw.close();

        FileReader fr=new FileReader(new File("b.txt"));
        char[] charss=new char[1024];
        int ch;
        while ((ch= fr.read(charss))!=-1){

            System.out.println(new String(charss,0,ch));
        }
        fr.close();
    }
}
