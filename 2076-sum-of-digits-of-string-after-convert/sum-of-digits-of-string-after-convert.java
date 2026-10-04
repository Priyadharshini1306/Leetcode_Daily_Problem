class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(int i = 0;i<s.length();i++) {
            int a = s.charAt(i)-'a'+1;
            while(a>0) {
                sum += a%10;
                a /= 10;
            }
        }
        if(k==1) {
            return sum;
        }
        --k;
        int t = 0;
        while(k-- > 0) {
            t = 0;
            while(sum>0) {
                t += sum%10;
                sum /= 10;
            }
            sum = t;
        }
        return t;
    }
}