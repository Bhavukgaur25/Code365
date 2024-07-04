package Day_87.Bhavuk;

class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4) return 0;
        Arrays.sort(nums);
        int temp = Integer.MAX_VALUE;
        for(int i = 0; i<=3; i++){
            int difference = nums[nums.length-1-i] - nums[3-i];
            temp = Math.min(difference,temp);
        }
        return temp;

    }
}