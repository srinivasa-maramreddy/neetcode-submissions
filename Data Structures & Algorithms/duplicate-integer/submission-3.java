class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
           return true;}
        }
        return false;
    }
}