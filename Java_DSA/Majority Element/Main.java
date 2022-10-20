class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int max=0;     
        for(int ele:nums){
            if(count==0){
                max=ele;
            }          
            if(ele==max){
                count=count+1;
            }else{
                count=count-1;
            }
        }
     return max;   
    }
}
