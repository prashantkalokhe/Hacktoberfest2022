class Solution {
    public List<List<Integer>> combinationSum(int[] a, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        help(a, target, ans, curr, 0);
        return ans;
    }
    public void help(int a[], int target, List<List<Integer>> ans, List<Integer> curr, int i){
        if(i == a.length){
            if(target == 0)
                ans.add(new ArrayList<>(curr));
            return;
        }
        if(a[i] <= target){
            curr.add(a[i]);
            help(a, target-a[i], ans, curr, i);
            curr.remove(curr.size()-1);
        }
        help(a, target, ans, curr, i+1);
    }
   public static void main(String[] args){
      int a[] = {1, 2, 3};
     
      System.out.println(combinationSum(a, 4));
   }
}
