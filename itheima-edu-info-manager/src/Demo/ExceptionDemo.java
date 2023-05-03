package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        method();
        method2();
        throw new RuntimeException();


        
    }

    private static void method2() throws ParseException {
        SimpleDateFormat sf=new SimpleDateFormat("yyyy年MM月dd日");
        sf.parse("2048-10月10日");

    }

    private static void method() /*throws NullPointerException*/{
        int[] arr=null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
