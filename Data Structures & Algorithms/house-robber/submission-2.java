class Solution {
    public int rob(int[] nums) {
     int idx=0;
     int[]dp=new int[nums.length];
     Arrays.fill(dp,-1);
        return ans(nums,0,dp);
    }
    public static int ans(int[]nums,int idx,int[]dp){
        if(idx>=nums.length){
            return 0 ;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int pick=nums[idx]+ans(nums,idx+2,dp);
        int nopick=ans(nums,idx+1,dp);
        dp[idx]= Math.max(pick,nopick);
        return dp[idx];
    }
}
