import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class API {

    public static void main(String[] args) {
        LocalDate now=LocalDate.now();

        Date date=new Date();
        date.getTime();
        LocalDateTime ldt=LocalDateTime.now();
        LocalDateTime ldt2=LocalDateTime.of(2020,11,22,23,44,55);
        Duration du=Duration.between(ldt,ldt2);
        du.toDays();
        ChronoUnit.DAYS.between(ldt,ldt2);
        String reg="\\d*";
        //

    }





}
