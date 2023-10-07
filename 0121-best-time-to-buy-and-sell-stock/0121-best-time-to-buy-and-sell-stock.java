class Solution {
    public int maxProfit(int[] arr) {
        int n  = arr.length;
        int res=0;
        int ans=0;
        int i=0;
       while( i<n){
             int sum=0;
             int j=i+1;
             while( j<n && arr[i]<=arr[j]){
                  sum=arr[j]-arr[j-1];
              ans= Math.max(sum,arr[j]-arr[i]);
                 res = Math.max(ans,res);
                
                 j++;
                // i++;
             }
             i=j;
            // res = Math.max(res,sum);
                 
         }
       
        return res;
    }
}