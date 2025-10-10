package backtracing;
import java.lang.*;
import java.util.*;

public class backtracking {
    public static void main(String[]args){
        int i[]={1,2,3};

        int n=i.length;

         boolean backtrack(int i,int[] CurrentSubset){
            if(i==n){
                System.out.println(currentSubset);
                return true;
            }
            else{
                backtrack(i+1,currentSubset);

                currentSubset.add(i);
                backtrack(i+1,currentsubset);
                currentSubset.pop;
            }
        }

    }
    
    
}
