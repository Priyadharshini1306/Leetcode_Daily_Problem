class Solution {
    public boolean hasSameDigits(String s) {
        String s1  = "";
        for(int i = 0;i<s.length()-1;i++){
            s1 += (s.charAt(i)-'0' + s.charAt(i+1)-'0')%10;
        }
        while(s1.length()>2) {
            String a = "";
            for(int i = 0;i<s1.length()-1;i++){
                a += (s1.charAt(i)-'0' + s1.charAt(i+1)-'0')%10;
            }
            s1 = a;
        }
        return s1.charAt(0)==s1.charAt(1);
    }
}