class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
         int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return rr(n,nums,dp);
    }
    static int rr(int n,int[] nums,int[] dp){
        if(n==0) return nums[0];
        if(n==1) return nums[1];
        if(dp[n]!=-1) return dp[n];
        int l,ll;
        if(n==nums.length){
            l =  rr(n-1,nums,dp);
            ll=rr(n-2,nums,dp);
        }
        else{
         l = rr(n-2,nums,dp)+nums[n];
        
        if(n-3>=0){
         ll=rr(n-3,nums,dp)+nums[n];
        }else{
             ll=Integer.MIN_VALUE;
        }
        }    
        return dp[n]=Math.max(l,ll);
    }
}