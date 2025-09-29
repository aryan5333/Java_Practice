package nextgreaterelement;
import java.lang.*;
import java.util.*;

public class NextGreaterElement {
public static void main(String[]args){

    Stack<Integer>stack=new Stack<>();
    int arr[] = {6, 8, 0, 1, 3};
    int n=arr.length;

    int[] res = new int[n];
    for(int i=n-1;i>=0;i--){
        while(stack.size() > 0 && stack.peek() <= arr[i]){
            stack.pop();
        }
        if(stack.isEmpty()){
            res[i] = -1;
        }
        else{
            res[i]=stack.peek();
        }
        stack.push(arr[i]);
    }
    // Print the result array
    System.out.println(Arrays.toString(res));
}


    
}
 