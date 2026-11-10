class Solution {
    public boolean isPalindrome(String s) {
       char[]arr=s.toLowerCase().toCharArray();
       int n=arr.length;
       int left=0;
       int right=n-1;
       while(left<right){
        while(left<right&&!Alpha(arr[left])){
            left++;
        }
         while(left<right&&!Alpha(arr[right])){
            right--;
        }
        if(arr[left]!=arr[right]){
            return false;
        }
        left++;
        right--;
       }
          return true;
       }
    
    private boolean Alpha(char c){
        return (c>='a'&&c<='z'||c>='0'&&c<='9');
    }
}
