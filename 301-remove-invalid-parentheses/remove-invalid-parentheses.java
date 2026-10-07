class Solution {

    HashSet<String> set = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {

        dfs(s, 0, 0, new StringBuilder());

        int max = 0;

        for (String si : set) {
            max = Math.max(max, si.length());
        }

        List<String> l = new ArrayList<>();

        for (String si : set) {
            if (si.length() == max) {
                l.add(si);
            }
        }

        return l;
    }

    void dfs(String s, int i, int bal, StringBuilder cur) {

        // Too many ')' encountered
        if (bal < 0) {
            return;
        }

        // End of string
        if (i == s.length()) {
            if (bal == 0) {
                set.add(cur.toString());
            }
            return;
        }

        char ch = s.charAt(i);

        // Normal character
        if (ch != '(' && ch != ')') {

            cur.append(ch);

            dfs(s, i + 1, bal, cur);

            // Backtrack
            cur.deleteCharAt(cur.length() - 1);

        } 
        
        else {

            // OPTION 1: Keep the parenthesis
            cur.append(ch);

            if (ch == '(') {
                dfs(s, i + 1, bal + 1, cur);
            } 
            else {
                dfs(s, i + 1, bal - 1, cur);
            }

            // Backtrack the "keep" choice
            cur.deleteCharAt(cur.length() - 1);

            // OPTION 2: Remove the parenthesis
            dfs(s, i + 1, bal, cur);
        }
    }
}