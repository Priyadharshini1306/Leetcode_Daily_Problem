class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> sumOfCounts = new HashMap<>();
        sumOfCounts.put(0,1);
        int prefixSum = 0;
        int count = 0;
        for(int i = 0;i<nums.length;i++) {
            prefixSum += nums[i];
            if(sumOfCounts.containsKey(prefixSum-k)) {
                count += sumOfCounts.get(prefixSum-k);
            }
            sumOfCounts.put(prefixSum,sumOfCounts.getOrDefault(prefixSum,0)+1);
        } 
        return count;
    }
}