class Solution {
    public int mostWordsFound(String[] s) {
        int max = 0;
        for(String str : s) {
            String[] a = str.split(" ");
            max = Math.max(max,a.length);
        }
        return max;
    }
}