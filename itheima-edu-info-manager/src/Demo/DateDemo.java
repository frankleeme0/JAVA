package Demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date=new Date(3600L*1000);
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis());
        date.setTime(0L);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = simpleDateFormat.format(date);
        String ss="2022-11-11 10:22:11";
//        String[] s1 = ss.split(" ");
        System.out.println(s);
        Date parse = simpleDateFormat.parse(ss);
        System.out.println(parse);
    }
}
