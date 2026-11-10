class Solution {
    public String longestCommonPrefix(String[] strs) {
        int length=strs.length;
        String prefix=strs[0];
        for(int i=0;i<length-1;i++){
            char[]ans=prefix.toCharArray();
            char[]ans1=strs[i+1].toCharArray();
            
            int j=0;
            while(j<ans.length&&j<ans1.length&& ans[j]==ans1[j]){
                j++;
            }
            prefix=prefix.substring(0,j);
            if(prefix.isEmpty()){
                return "";
            }

        }
        return prefix;

    }
}