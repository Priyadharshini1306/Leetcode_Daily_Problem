class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n);
        char[] arr = s.toCharArray();
        int sum = 0;
        for(int i = 0;i<arr.length;i++) {
            if(i%2==0) {
                sum += arr[i]-'0';
            } else {
                sum -= arr[i]-'0';
            }
        }
        return sum;

    }
}