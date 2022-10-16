class Solution {
    public List<List<Integer>> subsetsII(int[] nums) {
        ArrayList<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subset(nums, curr, ans, 0, false);
        return ans;
    }
    void subset(int nums[], ArrayList<Integer> curr, List<List<Integer>> ans, int i, boolean h){
        if(i == nums.length){
            if(  !ans.contains(curr))
                ans.add(new ArrayList<>(curr));
            return;
        }
        
        
        
        
        curr.add(nums[i]);
        //if(i>=1&&nums[i]==nums[i-1] && !h) return;
        subset(nums, curr, ans, i+1,false);
        curr.remove(curr.size() - 1);
        subset(nums, curr, ans, i+1,true);
    }
   public static void main(String[] args){
      int a[] = {'1', '2', '3'};
     
      System.out.println(subsetsII(a));
   }
}
