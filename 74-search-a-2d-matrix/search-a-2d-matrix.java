
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int value = cloTarget(matrix, target);

        if (value != -1) {
            return rowTarget(matrix, target, value);
        }

        return false;
    }

    int cloTarget(int[][] m, int target) {
        int low = 0;
        int high = m.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (m[mid][0] <= target &&
                m[mid][m[0].length - 1] >= target) {
                return mid;
            } else if (m[mid][0] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    boolean rowTarget(int[][] m, int target, int value) {
        int low = 0;
        int high = m[value].length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (m[value][mid] == target) {
                return true;
            } else if (m[value][mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }
}
