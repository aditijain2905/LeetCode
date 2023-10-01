class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low=0;
        int mid =0;
        int high = n-1;
        int temp=0;
        while(mid<=high){
           if(arr[mid]==0){
               temp=arr[low];
               arr[low]=arr[mid];
               arr[mid]=temp;
               low++;
               mid++;
               
           }
           else if(arr[mid]==1){
               mid++;
           }
           else{
               temp=arr[high];
               arr[high]=arr[mid];
               arr[mid]=temp;
               high--;
           }
        }
    }
}