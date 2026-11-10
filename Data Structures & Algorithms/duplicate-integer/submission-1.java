class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>map=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
        if(map.contains(nums[i])){
            return true;
        }
        else{
            map.add(nums[i]);
        }
    }
    return false;
    }
}