class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int[][] m = new int[n][n];
        int value = 0;
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<n;j++) {
                m[i][j] = value++;
            }
        }
        int k = 0,l = 0;
        for(String str:commands) {
            if(str.equals("DOWN")) k++;
            else if(str.equals("RIGHT")) l++;
            else if(str.equals("LEFT")) l--;
            else k--;
        }
        return m[k][l];
    }
}