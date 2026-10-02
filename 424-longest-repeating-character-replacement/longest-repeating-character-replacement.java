class Solution {
    public int characterReplacement(String s, int k) {
        int[] a = new int[26];
        int l = 0;
        int maxwin = 0;
        int maxfre = 0;
        for(int r = 0;r<s.length();r++) {
            a[s.charAt(r)-'A']++;
            maxfre = Math.max(maxfre,a[s.charAt(r)-'A']);
            int len = r-l+1;
            if(len-maxfre>k) {
                a[s.charAt(l)-'A']--;
                l++;
            }
            maxwin = Math.max(maxwin,r-l+1);
        }
        return maxwin;

    }
}