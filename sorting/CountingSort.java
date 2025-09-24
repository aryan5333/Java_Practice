public class CountingSort {
    public static void main(String[] args) {
        int arr[]={2,5,1,2,3,4,6,5,2};
        
    }
    public static void countingsort(int arr[]){
      //find k
        int n=arr.length;
        int k=Integer.MIN_VALUE; //maximum value of array
        int res[]=new int[n];
        for(int i=0; i<n;i++){
            if(arr[i]>k){
                k=arr[i];
            }
        }

        if(k==Integer.MIN_VALUE){
            System.out.println("Empty value");
            return;
        }
        int countArr[]=new int[k+1];
        //find the frequency
        for(int i=0;i<n;i++){
            int index=arr[i];
            countArr[index]+=1;
            
        }
        //find the cummulative frequency
        for(int i=1;i<=k;i++){
            countArr[i]+=countArr[i-1];
        }

        //find the sorted array
        for(int i=n-1;i>=0;i--){
            int val=arr[i];
            int countval=--countArr[val];
            res[countval]=val;
        }
        // Print the sorted array
        for(int i=0; i<n; i++){
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
    
    
}
