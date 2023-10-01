class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int bp=-1;
        int index=0;
        for(int i=n-2;i>=0;i--){
            index=i;
           if(nums[i]<nums[i+1]){
             bp=nums[i];
             
             break;
           }
        }
      //  System.out.print(index);
        if(bp==-1){
        reverse(nums,0);
        }
        else{
       for(int j=n-1;j>index;j--){
           if(nums[j]>nums[index]){
               int temp=nums[index];
               nums[index]=nums[j];
               nums[j]=temp;
               break;
           }
       }
        reverse(nums,index+1);
    }
    }
     void reverse(int[] nums,int start){
        int index=start;
        int j=nums.length-1;
        while(index<j){
            swap(nums,index,j);
            index++;
            j--;
        }
    }
     void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}