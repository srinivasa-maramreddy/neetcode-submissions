class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int longestlength=0;
        
        for(int i=0;i<n;i++){
            int max=0;
            int[]freq=new int[26];
            for(int j=i;j<n;j++){
                
           freq[s.charAt(j)-'A']++;
           int count= freq[s.charAt(j)-'A'];
          max=Math.max(max,count);
            int window=j-i+1;
            if(window-max<=k){
             longestlength=Math.max(window,longestlength);
            }else{
                break;
            }
            }
        }
        return longestlength;
    }
}
