class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> s = new HashSet<>();
        int[] ans = new int[2];
        int sum = 0;
        for(int i = 0;i<grid.length;i++) {
            for(int j = 0;j<grid[0].length;j++) {
                if(s.contains(grid[i][j])) {
                    ans[0] = grid[i][j];
                } else {
                    sum += grid[i][j];
                }
                s.add(grid[i][j]);
            }
        }
        int n = grid.length*grid.length;
        int val = n*(n+1)/2;
        ans[1] = val-sum;
        return ans;

    }
}