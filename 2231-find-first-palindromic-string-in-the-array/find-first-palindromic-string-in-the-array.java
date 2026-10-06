class Solution {
    boolean pali(String s) {
        int end = s.length()-1;
        int start = 0;
        while(start<=end) {
            if(s.charAt(start)!=s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0;i<words.length;i++) {
            if(pali(words[i])) {
                return words[i];
            }
        }
        return "";
    }
}