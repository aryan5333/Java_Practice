import java.io.*;
import java.util.Arrays;

public class studentchallengestream
{
    public static void main(String[] args) throws Exception {
        float[] list = {1.1f, 2.2f, 3.3f}; // Example float array
        FileOutputStream fos = new FileOutputStream("c:\\Users\\sinha\\Data.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(list.length);
        for(float f : list)
        {
            dos.writeFloat(f);
        }

        dos.close();
        fos.close();

         FileInputStream fis = new FileInputStream("c:\\Users\\sinha\\Data.txt");
        DataInputStream dis = new DataInputStream(fis);

        int length=dis.readInt();
        float data;

        for(int i=0; i<length; i++)
        {
            data=dis.readFloat();
            System.out.println(data);

        }
        dis.close();
        fis.close();


    }
}