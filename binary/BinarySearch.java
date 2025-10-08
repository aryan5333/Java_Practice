package binary;

public class BinarySearch {
    public static void main(String[]args){
        int [] arr={2,4,6,10,18,19,25};

        int key=18;
        int start=1 ,end=arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<key){
                start=mid+1;
            }
            else if(arr[mid]>key){
                end=mid-1;

            }
            else{
                System.out.println("key is present"+mid);
                System.exit(0);

            }

        }
        System.out.println("key is not present");
    }
    
}
