import java.lang.*;
import java.util.*;
import java.time.*;
import java.time.temporal.*;

public class Datenew
{
    public static void main(String[]args)
    {

        LocalDate ld=LocalDate.parse("2025-02-03");
        LocalDate ld1=ld.plusMonths(6);
        System.out.println(ld1);

    }
}