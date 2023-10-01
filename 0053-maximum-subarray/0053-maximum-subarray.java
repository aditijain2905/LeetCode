class Solution {
    public int maxSubArray(int[] arr) {
        
        int presum=arr[0];
        int res=arr[0];
        int n = arr.length;
        for(int i=1;i<n;i++){
            presum=Math.max(presum+arr[i],arr[i]);
            res=Math.max(presum,res);
        }
        return res;
        
    }
}