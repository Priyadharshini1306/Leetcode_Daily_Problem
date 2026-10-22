class Solution {
    public void rotate(int[][] m) {
        for(int i = 0;i<m.length-1;i++) {
            for(int j = i+1;j<m.length;j++) {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
        for(int i = 0;i<m.length;i++) {
            int left = 0;
            int right = m.length-1;
            while(left<right) {
                int temp = m[i][left];
                m[i][left] = m[i][right];
                m[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}