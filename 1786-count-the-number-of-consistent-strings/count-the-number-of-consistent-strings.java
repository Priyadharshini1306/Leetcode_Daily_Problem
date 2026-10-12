class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> s = new HashSet<>();
        for(int i = 0;i<allowed.length();i++) {
            s.add(allowed.charAt(i));
        }
        int count = 0;
        for(String a:words) {
            boolean yes = true;
            for(int i = 0;i<a.length();i++) {
                if(!s.contains(a.charAt(i))) {
                    yes = false;
                    break;
                }
            }
            if(yes) count++;
        }
        return count;
    }
}