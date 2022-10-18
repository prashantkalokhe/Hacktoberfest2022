class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int sum = 0;
        int length = nums.size();
        // cout << length << "10";
        for(int i=0; i < length; i++){
            sum += nums[i];
        }
        int num =((length*(length+1)/2));
        return(num - sum);
    }
};
