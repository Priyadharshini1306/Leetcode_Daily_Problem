
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        int[] ans = new int[A.length];
        int count = 0;

        for (int i = 0; i < A.length; i++) {

            set.add(A[i]);
            set2.add(B[i]);

            if (set2.contains(A[i])) {
                count++;
            }

            if (set.contains(B[i]) && A[i] != B[i]) {
                count++;
            }

            ans[i] = count;
        }

        return ans;
    }
}
