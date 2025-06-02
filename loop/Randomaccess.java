import java.io.*;
import java.lang.*;

public class Randomaccess
{
    public static void main(String[] args) throws Exception  {
        RandomAccessFile rf = new RandomAccessFile("C:\\Users\\sinha\\Data.txt", "rw");

        

        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        System.out.println((char)rf.read());
        rf.write('d');




    }
}