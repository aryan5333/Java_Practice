package searchindex;

public class SearchIndex {
    class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=-1;
        int start=0,end=nums.length-1;

        while(start <= end){
            int mid=(start+end)/2;
            if(nums[mid]>target){
                end =mid-1;
            }
            else if(nums[mid]<=target){
                ans=mid;
                start=mid+1;
            }
        }
        if(ans==-1){
            return 0;
        }
        else if(nums[ans]==target){
            return ans;
        }
        else{
            return ans+1;
        }
        
    }
}
    
}
