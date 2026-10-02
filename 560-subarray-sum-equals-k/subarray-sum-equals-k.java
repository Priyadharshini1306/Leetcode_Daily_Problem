import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> sumCountMap = new HashMap<>();

        sumCountMap.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            if (sumCountMap.containsKey(prefixSum - k)) {
                count += sumCountMap.get(prefixSum - k);
            }

            sumCountMap.put(
                prefixSum,
                sumCountMap.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }
}