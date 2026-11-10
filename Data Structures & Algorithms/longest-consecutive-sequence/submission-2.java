class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0){
            return 0; 
        }
        
        int length=1;
        int longest=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]==nums[i-1]+1){
                length++;
            }else{
               length=1;
            }
            
            longest=Math.max(longest,length);
        }
        return longest;
    }
}
