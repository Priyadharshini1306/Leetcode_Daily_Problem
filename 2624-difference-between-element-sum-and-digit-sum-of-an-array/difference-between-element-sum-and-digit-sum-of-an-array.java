class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int sum1 = 0;
        for(int i = 0;i<nums.length;i++) {
            sum += nums[i];
            int n = nums[i];
            while(n>0) {
                sum1 += n%10;
                n /= 10;
            }
        }
        return Math.abs(sum-sum1);
    }
}