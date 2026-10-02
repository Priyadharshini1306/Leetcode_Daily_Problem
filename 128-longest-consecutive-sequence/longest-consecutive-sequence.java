class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set =  new HashSet<>();
        for(int i:nums) {
            set.add(i);
        }
        int result = 0;
        for(int val: set) {
            int count = 1;
            if(!set.contains(val-1)) {
                while(set.contains(++val)) {
                    count++;
                }
                result = Math.max(result,count);
            }
        }
        return result;
    }
}