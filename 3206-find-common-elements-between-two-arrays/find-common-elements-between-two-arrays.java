class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> s = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        for(int i:nums1) {
            s.add(i);
        }
        for(int i:nums2) {
            s2.add(i);
        }
        int[] ans = new int[2];
        for(int i:nums1) {
            if(s2.contains(i)) {
                ans[0]++;
            }
        }
        for(int i: nums2) {
            if(s.contains(i)) {
                ans[1]++;
            }
        }
        return ans;
    }
}