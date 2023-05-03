import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println(2.5/3);
        String s="abc";
        String s1=s.replace("a","bb");
        System.out.println(s1);
        Calendar cl=Calendar.getInstance();

        System.out.println(cl);
        Instant in=Instant.now();
        Date date=Date.from(in);
        date.toInstant();
        cl.setTime(date);

    }
}