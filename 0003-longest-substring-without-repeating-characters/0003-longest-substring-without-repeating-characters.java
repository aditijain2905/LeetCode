class Solution {
    public int lengthOfLongestSubstring(String s) {
          HashMap<Character , Integer> h =new HashMap<>();
          int l=0;
        int r=0;
        int len=0;
        int n = s.length();
        
        while(r<n){
            if(h.containsKey(s.charAt(r))) {
               l = Math.max(h.get(s.charAt(r))+1,l); 
            }
             h.put(s.charAt(r), r);
            len = Math.max(r-l+1,len);
            r++;
        }
        
        return len;
    }
}