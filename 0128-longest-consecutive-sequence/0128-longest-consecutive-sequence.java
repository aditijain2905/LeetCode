class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int count=0;
        int n = nums.length;
        int max=0;
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }
          for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i]-1)){
                continue;
            }
            count=1;
              
        int j=1;
              while(h.contains(nums[i]+j) ){
                  count++;
                  j++;
              }
              max=Math.max(max,count);
            
        }
        return max;
        
    }
}