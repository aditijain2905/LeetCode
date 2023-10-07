class Solution {
    public int maxProfit(int[] arr) {
        int n =arr.length;
        int sum=0;
        int i=0;
        while(i<n-1){
            if(arr[i]<arr[i+1]){
                sum=sum+arr[i+1]-arr[i];
                
                
            }
            i++;
        }
        return sum;
    }
}