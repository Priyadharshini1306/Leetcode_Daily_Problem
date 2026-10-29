
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for (int val : weights) {
            low = Math.max(low, val);
            high += val;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int day = validcapacity(weights, mid);

            if (day <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    int validcapacity(int[] a, int cap) {
        int curcap = 0;
        int day = 1;

        for (int i = 0; i < a.length; i++) {
            if (curcap + a[i] > cap) {
                day++;
                curcap = a[i];
            } else {
                curcap += a[i];
            }
        }

        return day;
    }
}
