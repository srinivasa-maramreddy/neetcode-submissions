class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;

        int n = s.length();
        int max = 0;
        int left=0;
        
        int[]seen=new int[128];
        for(int i=0;i<n;i++){
          

          while(seen[s.charAt(i)]==1){
             seen[s.charAt(left)]=0;
             left++;
          }
           seen[s.charAt(i)]=1;
           max=Math.max(max,i-left+1);
        }
        return max;
    }
}