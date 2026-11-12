class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i:gain) {
            max = Math.max(sum,max);
            sum += i;
        }
        max = Math.max(sum,max);
        return max;

    }
}