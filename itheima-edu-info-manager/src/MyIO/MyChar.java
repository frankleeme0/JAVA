package MyIO;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class MyChar {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="黑马程序员";
        byte[] bytes=s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
//        System.out.println(bytes);
        byte[] bytes1={-70, -38, -62, -19, -77, -52, -48, -14, -44, -79};
//        String s1 = Arrays.toString(bytes);
        String s1=new String(bytes1,"gbk");
        System.out.println(s1);


    }
}
