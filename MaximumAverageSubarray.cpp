class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double avg=0;
        // double ans;
        for(int i = 0; i<k; i++){
            avg += nums[i];
        }
        // avg = avg;
        double ans = avg;
        int prevIndex=0;
        double prevAvg=avg;
        for(int j = k; j<nums.size(); j++){
            avg = ((avg) + nums[j] - nums[prevIndex]);
            if(avg < prevAvg){
                ans = prevAvg;
            }
            else{
                ans = avg;
            }
            prevAvg = ans;
            prevIndex++;
        }
        return ans/k;
    }
};
