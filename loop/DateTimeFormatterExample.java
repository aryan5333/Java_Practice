import java.lang.*;
import java.time.*;
import java.time.temporal.*;
import java.util.*;
import java.time.format.*;

public class DateTimeFormatterExample
{
    public static void main(String[] args) {
        ZonedDateTime dt=ZonedDateTime.now();

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy  hh:mm:ss  z Z");
        System.out.println(df.format(dt));


        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt.get(ChronoField.YEAR));
        
    }
}