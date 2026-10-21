class Solution {
    public int majorityElement(int[] nums) {
        int cur = 0;
        int count = 0;
        for(int i:nums) {
            if(count==0) {
                cur = i;
                count++;
            } else if(cur==i) count++;
            else count--;
        }
        count = 0;
        for(int i:nums) {
            if(i==cur) count++;
        }
        if(count>nums.length/2) {
            return cur;
        }
        return 0;
    }
}