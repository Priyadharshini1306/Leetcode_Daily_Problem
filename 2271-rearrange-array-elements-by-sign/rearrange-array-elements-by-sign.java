class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        for(int i = 0;i<nums.length;i++) {
            if(nums[i]<0) {
                l.add(nums[i]);
            } else {
                l1.add(nums[i]);
            }
        }
        int j = 0;
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++) {
            if(i%2==0) {
                ans[i] = l1.get(j);
            } else {
                ans[i] = l.get(j);
                j++;
            }
        }
        return ans;
        
    }
}