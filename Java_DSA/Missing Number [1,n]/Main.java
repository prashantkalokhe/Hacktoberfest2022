public class missingNumber {
    public static void main(String[] args) {
        int[] array = {3,4,2,1,0,6};
        int res = missingNumber1(array);
        System.out.println(res);
    }
    static int missingNumber1(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i]!=nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j <= nums.length ; j++) {
            if(nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }
}
