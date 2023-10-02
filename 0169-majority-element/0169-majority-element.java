class Solution {
    public int majorityElement(int[] nums) {
        
           int element=nums[0];
           int n = nums.length;
           int count=1;
          for(int i=1;i<n;i++){
              if(nums[i]==element){
                  count++;
              }
              else if(nums[i]!=element){
                  count--;
                  if(count==0){
                      element=nums[i];
                      count++;
                  }
              }
          }
        return element;
    }
}