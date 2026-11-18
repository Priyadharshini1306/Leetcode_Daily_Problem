class Solution {
    public String sortVowels(String s) {
        int[] hash = new int[256];
        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if("aeiouAEIOU".indexOf(ch) != -1) {
                hash[ch]++;
            }
        }
        StringBuilder sb1 = new StringBuilder();
        for(int i = 0;i<256;i++) {
            while(hash[i]-->0) {
                sb1.append((char)i);
            }
        }
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++) {
            char ch = s.charAt(i);
            if("aeiouAEIOU".indexOf(ch) != -1) {
                sb.append(sb1.charAt(j++));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}