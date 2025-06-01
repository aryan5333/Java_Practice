import java.io.File;

public class filehanding
{
    public static void main(String[] args) {
        File f=new File("c:\\users\\sinha\\Data.txt");

        System.out.println(f.isDirectory());
        File list[]=f.listFiles();

        for(File x:list)
        {
            System.out.println(x.getName()+"");
            System.out.println(x.getParentFile());
        }
    }
}
