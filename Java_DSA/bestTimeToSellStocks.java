class Solution {
    public int maxProfit(int[] arr) {
        int n=arr.length;
        int min=arr[0];
        int profit=0;
        for(int i=1;i<n;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
            else
            {
                profit+=arr[i]-min;
                min=arr[i];
            }
        }
        return profit;
        
        
    }
}
