class Solution {
    public String minWindow(String s, String t) {
        int stringIndex = -1;
        int minLength = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int count = 0;
        int[] hash = new int[256];
        for(int i = 0;i<t.length();i++) {
            hash[t.charAt(i)]++;
        }
        while(right<s.length()) {
            if (hash[s.charAt(right)] > 0) {
                count++;
            }
            hash[s.charAt(right)]--;
            while(count==t.length()) {
                if(minLength>right-left+1) {
                    stringIndex = left;
                    minLength = right-left+1;
                }
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)]>0) {
                    count--;
                }
                left++;
            }
            right++;
        }
        return stringIndex==-1?"":s.substring(stringIndex,minLength+stringIndex);
    }
}