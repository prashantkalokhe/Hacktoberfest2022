class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]>0)
            {
            int min=Integer.MAX_VALUE;
            for(int j=1;j<=nums[i] && i+j<n;j++)
            {
              if(dp[i+j]!=-1 && dp[i+j]<min)
              {
                 min=dp[i+j];
              }
            }
            if(min==Integer.MAX_VALUE)
            dp[i]=-1;
            else
            dp[i]=min+1;
            }
            else
            dp[i]=-1;
        }
        return dp[0];
    }
}
