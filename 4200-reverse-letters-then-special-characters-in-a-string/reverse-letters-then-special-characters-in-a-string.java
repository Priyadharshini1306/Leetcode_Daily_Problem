class Solution {
    public String reverseByType(String s) {
        Stack<Character> s1 = new Stack();
        Stack<Character> s2 = new Stack();
        for(int i = 0;i<s.length();i++) {
            char a = s.charAt(i);
            if(Character.isLetter(a)) {
                s1.push(a);
            } else {
                s2.push(a);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++) {
            char a = s.charAt(i);
            if(Character.isLetter(a)) {
                sb.append(s1.pop());
            } else {
                sb.append(s2.pop());
            }
        }
        return sb.toString();

    }
}