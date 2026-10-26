class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length()<p.length()) {
            return ans;
        }
        int[] a = new int[26];
        int[] b = new int[26];
        for(int i = 0;i<p.length();i++) {
            a[s.charAt(i)-'a']++;
            b[p.charAt(i)-'a']++;
        }
        int l = 0;
        for(int r = p.length();r<s.length();r++) {
            if(Arrays.equals(a,b)==true) {
                ans.add(l);
            }
            a[s.charAt(r)-'a']++;
            a[s.charAt(l)-'a']--;
            l++;
        }
        if(Arrays.equals(a,b)) ans.add(l);
        return ans;

    }
}