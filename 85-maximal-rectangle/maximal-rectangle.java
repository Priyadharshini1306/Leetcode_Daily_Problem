class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int n = matrix.length;
        int m = matrix[0].length;
        int[][] prefixSum = new int[n][m];
        for(int i = 0;i<m;i++) {
            int sum = 0;
            for(int j = 0;j<n;j++) {
                if(matrix[j][i] == '1') {
                    sum++;
                } else {
                    sum = 0;
                }
                prefixSum[j][i] = sum;
            }
        }
        int maxArea = 0;
        for(int i = 0;i<n;i++) {
            maxArea = Math.max(maxArea,largestHistogram(prefixSum[i]));
        }
        return maxArea;
    }
    int largestHistogram(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        //previsous smallest element
        int[] pse = new int[n];
        Arrays.fill(pse,-1);
        for(int i = 0;i<n;i++) {
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]) {
                st.pop();
            }
            if(!st.isEmpty()) {
                pse[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        //next smallest element
        int maxarea = 0;
        for(int i = n-1;i>=0;i--) {
            int area = 0;
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]) {
                st.pop();
            }
            if(!st.isEmpty()) {
                area = nums[i] * (st.peek()-pse[i]-1);
            } else {
                area = nums[i] * (n-pse[i]-1);
            }
            st.push(i);
            maxarea = Math.max(maxarea,area);
        }
        return maxarea;
    }
}