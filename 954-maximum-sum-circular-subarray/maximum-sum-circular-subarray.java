class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curmax = 0;
        int max = Integer.MIN_VALUE;
        int curmin = 0;
        int min = Integer.MAX_VALUE;
        int total = 0;
        for(int i:nums) {
            curmax += i;
            max = Math.max(max,curmax);
            if(curmax<0) curmax = 0;
            curmin += i;
            min = Math.min(min,curmin);
            if(curmin>0) curmin = 0;
            total += i;
        }
        if( max < 0 ) return max;
        return Math.max(total - min,max);

    }
}