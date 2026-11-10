class Solution {
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        dp[1]=2;
        Climbing(n,dp);
        return dp[n];
       
    }
    public static void Climbing(int n,int[] dp){
        if(n==0){
          dp[0]=1;
          return;
        }
         if(n==1){
          dp[1]=1;
          return;
        }
        if(dp[n]!=-1){
          return;
        }
        Climbing(n-1,dp);
        Climbing(n-2,dp);
        dp[n]=dp[n-2]+dp[n-1];

       

       
    }
}
