import java.lang.*;
import java.util.*;

public class Time {
    public static void main(String[]args)
    {
        GregorianCalendar gc=new GregorianCalendar();
        TimeZone tz=gc.getTimeZone();
        System.out.println(tz.getID());
            
        
        //System.out.println(gc.isLeapYear(2024 ));
        //System.out.println(gc.get(Calendar.DAY_OF_YEAR));
    }

    
}
