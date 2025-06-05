import java.lang.*;
import java.util.*;
import javax.lang.model.util.ElementScanner14;

class point implements Comparable<point>
{
    int x;
    int y;
    public point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public String toString()
    {
        return "x=" + x + " y=" + y;
    }

    
    public int compareTo(point p)
    {
        if(this.x < p.x)
        {
            return -1;
        }
        else if(this.x > p.x)
        {
            return 1;
        }
        else{
            if(this.y < p.y)
            {
                return -1;
            }
            else if(this.y > p.y)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}

public class comparable
{
    public static void main(String[] args) {
        TreeSet<point> ts=new TreeSet<>();

        ts.add(new point(1,1));
        ts.add(new point(5,5));
        ts.add(new point(5,2));

        System.out.println(ts);
        

        


    }
}




























