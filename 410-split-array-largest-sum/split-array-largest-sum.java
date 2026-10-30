class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int i : nums) {
            low = Math.max(low,i);
            high += i;
        }
        int min = Integer.MAX_VALUE;
        while(low<=high) {
            int mid = low + (high - low)/2;
            int maxcount = countSubarray(nums,mid);
            if(maxcount<=k) {
                min = Math.min(min,mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return min;
    }
    int countSubarray(int[] nums,int max) {
        int count = 1;
        int sum = 0;
        for(int i:nums) {
            if(sum+i<=max) {
                sum += i;
            } else {
                count++;
                sum = i;
            }
        }
        return count;
    }
}