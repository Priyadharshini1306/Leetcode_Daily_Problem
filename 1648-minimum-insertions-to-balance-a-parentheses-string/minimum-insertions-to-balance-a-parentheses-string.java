class Solution {
    public int minInsertions(String s) {
        int need = 0;
        int ans = 0;
        for(int i = 0;i<s.length();i++) {
            char a = s.charAt(i);
            if(a=='(') {
                if(need%2==1) {
                    ans++;
                    need--;
                }
                need += 2;
            } else if(a==')') {
                need--;
            }
            if(need<0) {
                ans += 1;
                need = 1;
            }
        }
        return ans+need;
    }
}