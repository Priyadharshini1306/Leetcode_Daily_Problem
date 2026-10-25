class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int[] ans = new int[2];
        while(l<r) {
            int sum = nums[l]+nums[r];
            if(sum>target) {
                r--;
            } else if(sum<target) {
                l++;
            } else {
                ans[0] = l+1;
                ans[1] = r+1;
                break;
            }
        }
        return ans;
    }
}