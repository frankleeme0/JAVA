package MyIO;

import java.io.*;

public class MyBufferReader {
    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new FileReader("a.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("b.txt"));
        char[] chars=new char[1024];
        bw.newLine();
        //读不到返回null而不是-1
        String s = br.readLine();
        int len;
        while ((len=br.read(chars))!=-1 ){
            bw.write(chars,0,len);
        }
        br.close();
    }
}
