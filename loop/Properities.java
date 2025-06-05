import java.lang.*;
import java.util.*;
import java.io.*;

public class Properities {
    public static void main(String[] args) throws Exception {
        Properties p = new Properties();

       /*  p.setProperty("brand", "Dell");
        p.setProperty("processor", "i7");
        p.setProperty("OS", "window12");
        p.setProperty("Model", "latitude");

        p.storeToXML(new FileOutputStream("C:\\Users\\Sinha\\Aniket.xml"),"Laptop");
        */

        p.loadFromXML(new FileInputStream("C:\\Users\\Sinha\\Aniket.xml"));

        System.out.println(p.getProperty("brand"));
    }
}