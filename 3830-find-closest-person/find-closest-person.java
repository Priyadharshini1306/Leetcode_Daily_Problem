class Solution {
    public int findClosest(int x, int y, int z) {
        int[] a = new int[2];
        a[0] = Math.abs(x-z);
        a[1] = Math.abs(y-z);
        if(a[0]==a[1]) {
            return 0;
        } else if(a[0]<a[1]) {
            return 1;
        } else {
            return 2;
        }
    }
}