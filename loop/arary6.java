import java.lang.*;
import jdk.jshell.execution.Util;

class array6
{
    public static void main(String[] args) {
        String arr[]={"java","python","pascal","ada","basic"};
        java.util.Arrays.sort(arr);

        for (String x:arr)
        System.out.println(x);
        
            
        }
    }
