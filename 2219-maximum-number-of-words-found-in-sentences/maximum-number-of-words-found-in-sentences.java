class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;
        for(int i = 0;i<s.length;i++) {
            int space = 0;
            for(int j = 0;j<s[i].length();j++) {
                if(s[i].charAt(j)==' ') {
                    space++;
                }
            }
            max = Math.max(max,space+1);
        }
        return max;
    }
}