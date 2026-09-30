class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[nums.length];
        int j = 0;
        for(int i = 0;i<nums.length;i++) {
            if(j>=nums.length) {
                j = 1;
            }
            a[j]  = nums[i];
            j += 2;
        }
        return a;
    }
}