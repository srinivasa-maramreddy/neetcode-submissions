class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left=0;
        int right=0;
        int max=0;
        int []freq=new int[26];
        int res=0;
         for(int i=0;i<n;i++){
             freq[s.charAt(i)-'A']++;
              max=Math.max(max,freq[s.charAt(i)-'A']);
            while(i-left+1-max>k){
             freq[s.charAt(left)-'A']--;
             left++;
            }
            
           res=Math.max(res,i-left+1);
         }
         return res;
    }}
