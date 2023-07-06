class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int end=0;
        int sum=0;
        int count=1000000;
        int res;
        for(end=0;end<nums.length;end++){
            sum=sum+nums[end];
            while(sum>=target){
                sum = sum-nums[start];
                 count = Math.min(count,end-start+1);
                start++;
            }
           
        }
        if(count==1000000) return 0;
        return count;
    }
}