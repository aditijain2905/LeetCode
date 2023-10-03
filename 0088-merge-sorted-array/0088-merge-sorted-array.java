class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=0;
        int right=m-1;
        while(left<n && right>=0){
            if(nums1[right]>=nums2[left]){
                int temp=nums1[right];
                nums1[right]=nums2[left];
                nums2[left]=temp;
                left++;
                right--;
            }
            else break;
        }
        int j=0;
     if(m!=0)   Arrays.sort(nums1,0,m);
        Arrays.sort(nums2);
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[j];
            j++;
        }
        
    }
}