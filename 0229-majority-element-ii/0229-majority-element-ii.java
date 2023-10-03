class Solution {
    public List<Integer> majorityElement(int[] nums) {
           ArrayList<Integer> a = new ArrayList<Integer>();
           int c1=1;
           int c2=0;
        int n= nums.length;
           int e1 = nums[0];
           int e2 = Integer.MIN_VALUE;
           for(int i=1;i<n;i++){
               if(c1==0 && e2!=nums[i]){
                   e1=nums[i];
                   c1++;
               }
               else if(c2==0 && e1!=nums[i]){
                   e2=nums[i];
                   c2++;
               }
               
               else if((nums[i]==e1)){
                   c1++;
               }
               else if(nums[i]==e2){
                  c2++;   
               }
               else if(nums[i]!=e1 && nums[i]!=e2){
                   c1--;
                   c2--;
               }
           }
        c1=0;
        c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==e1) c1++;
            if(nums[i]==e2) c2++;
        }
           int m=  (int)(n / 3) + 1;
        if(c1>=m)  a.add(e1);
         
       if(c2>=m) a.add(e2);
   
        return a;
    }
}