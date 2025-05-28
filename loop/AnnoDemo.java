import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value=ElementType.LOCAL_VARIABLE)
@interface MyAnno
{
    String name();
    String date();
    String project();
    float version();


}
@MyAnno(name="Aryan sinha",date="2013-10-01",project="java",version=1.0f)
public class AnnoDemo
{
    int data;

    public static void main(String[] args) {
        int x;
    }
}