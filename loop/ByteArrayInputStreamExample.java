import java.io.*;
import java.lang.*;

public class ByteArrayInputStreamExample
{
    public static void main(String[] args) throws Exception
     {
        byte b[]={'a','s','d','f','g','h','j','k','l'};
        try (ByteArrayInputStream bis = new ByteArrayInputStream(b)) {

            String str = new String(bis.readAllBytes());

            System.out.println(str);

        }
     }
} 


