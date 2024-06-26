package Day_84.bhavuk;

class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    public int search(int[] nums,int target, boolean firstposition){
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int potentialans =-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start = mid +1;
            }
            else{
                potentialans = mid;
                if(firstposition){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        //
        return potentialans;
    }
}