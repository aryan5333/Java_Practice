package array2;

public class SlidingWindow {
    public static void main(String[] args) {
        int[]arr={10,2,7,8,11,13};
        int sum=0,n=arr.length;
        int k=3;
        for(int i=0;i<k;i++){
            sum +=arr[i];
        }
        System.out.println(sum);
        
        for(int i=1;i<n-k;i++){
            sum=sum-arr[i-1]+arr[i+k-1];
            System.out.println(sum);

        }

    }
    
}
