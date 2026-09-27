class Solution {
    public int maxSubarray(int[] nums) {

        int[] dravolenti = nums;
        int[] freq = new int[501];

        int left = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {

            freq[nums[right]]++;

            while (invalid(freq, nums[right])) {
                freq[nums[left]]--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }

    private boolean invalid(int[] freq, int x) {

        // a + b = x
        for (int a = 1; a <= x / 2; a++) {
            int b = x - a;

            if (freq[a] > 0 && freq[b] > 0) {
                if (a != b || freq[a] >= 2)
                    return true;
            }
        }

        // x + a = b
        for (int a = 1; a + x <= 500; a++) {
            int b = x + a;

            if (freq[a] > 0 && freq[b] > 0) {
                if (a != x || freq[x] >= 2)
                    return true;
            }
        }

        return false;
    }
}