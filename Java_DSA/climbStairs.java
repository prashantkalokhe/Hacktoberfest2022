class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[]=new int[cost.length];
        dp[cost.length-1]=cost[cost.length-1];
        dp[cost.length-2]=cost[cost.length-2];
        for(int i=cost.length-3;i>=0;i--)
        {
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=2;j++)
            {
               min=Math.min(dp[i+j],min); 
            }
            dp[i]=min+cost[i];
        }
        if(dp[0]<dp[1])
            return dp[0];
        else
            return dp[1];
        
    }
}
