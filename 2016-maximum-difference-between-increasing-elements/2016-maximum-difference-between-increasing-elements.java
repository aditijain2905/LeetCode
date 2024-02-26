class Solution {
    public int maximumDifference(int[] arr) {
        int res=0;
        int  min=arr[0];
        for(int i=1;i<arr.length;i++){
            res = Math.max(res,arr[i]-min);
            min = Math.min(min,arr[i]);
        }
        if(res==0) return -1;
        return res;
    }
}