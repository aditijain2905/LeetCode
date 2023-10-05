class Solution {
    public int[] twoSum(int[] arr, int target) {
         HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
          int n = arr.length;
       
        int[] res= new int[2];
        for(int i=0;i<n;i++){
            if(h.containsKey(target-arr[i])){
                res[0]=h.get((target-arr[i]));
                res[1]=i;
            }
            h.put(arr[i],i);
        }
     
        return res;
        
        
    }
}