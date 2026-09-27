class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder curr = new StringBuilder();
        for(int i = 0;i<s.length();i++) {
            char a = s.charAt(i);
            if(a=='(') {
                st.push(curr.toString());
                curr.setLength(0);
            } else if(a==')') {
                curr = new StringBuilder(st.pop()).append(curr.reverse());
            } else {
                curr.append(a);
            }
        }
        return curr.toString();
    }
}