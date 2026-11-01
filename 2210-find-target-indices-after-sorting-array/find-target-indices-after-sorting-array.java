class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length-1;
        int ans = 0;
        while(low<=high) {
            int mid = low + (high - low)/2;
            if(nums[mid]==target) {
                high = mid - 1;
                ans = mid;
            } else if(nums[mid]>target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        List<Integer> l = new ArrayList<>();
        for(int i = ans;i<nums.length;i++) {
            if(nums[i]==target) {
                l.add(i);
            } else {
                break;
            }
        }
        return l;
    }
}