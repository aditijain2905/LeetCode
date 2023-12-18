class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return mcc(n,cost,dp);
    }
    static int mcc(int n,int[] cost,int[] dp){
        if(n==0 || n==1){
            return 0;
        }
       
        if(dp[n]!=-1) return dp[n];
        int left=cost[n-1]+mcc(n-1,cost,dp);
        int right=cost[n-2]+mcc(n-2,cost,dp);
        return dp[n]=Math.min(left,right);
            
    }
}