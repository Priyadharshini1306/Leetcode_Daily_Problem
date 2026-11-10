class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> m = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();
        for(int i = 0;i<s.length();i++) {
            m.put(s.charAt(i),i);
        }
        for(int i = 0;i<t.length();i++) {
            m2.put(t.charAt(i),i);
        }
        int sum = 0;
        for(int i = 0;i<s.length();i++) {
            sum += Math.abs(m.get(s.charAt(i))-m2.get(s.charAt(i)));
        }
        return sum;
    }
}