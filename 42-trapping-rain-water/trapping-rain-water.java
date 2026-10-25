class Solution {
    public int trap(int[] h) {
        int n =h.length;
        int l = 0;
        int hi = n-1;
        int water = 0;
        int lmax = 0,rmax = 0;
        while(l<=hi)
        {
            if(h[l]<=h[hi])
            {
                lmax = Math.max(lmax,h[l]);
                int curr  = h[l];
                water+=(lmax-curr);
                l++;
            }
            else{
                rmax = Math.max(rmax,h[hi]);
                int curr = h[hi];
                water+=(rmax-curr);
                hi--;
            }
        }
        return water;
    }
}