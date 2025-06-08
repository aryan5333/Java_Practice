import java.lang.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Datenew
{
    public static void main(String[]args)
    {

        ZonedDateTime Zdt= ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        //OffsetDateTime odt= OffsetDateTime.now();
        System.out.println(Zdt);

        Period p=Period.of(4, 5, 10);
        System.out.println(p.addTo(LocalDate.now()));

        Instant i=Instant.now();
        System.out.println(i);

        //LocalDate ld=LocalDate.parse("2025-02-03");
        //LocalDate ld1=ld.plusMonths(6);
        //System.out.println(ld1);

    }
}