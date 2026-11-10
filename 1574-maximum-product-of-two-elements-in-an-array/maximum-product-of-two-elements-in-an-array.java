class Solution {
    public int maxProduct(int[] nums) {
        int lar = 0;
        int sec = 0;
        for(int i:nums) {
            if(lar<=i) {
                sec = lar;
                lar = i;
            } else if(sec<=i) {
                sec = i;
            }
        }
        return (lar-1)*(sec-1);
    }
}