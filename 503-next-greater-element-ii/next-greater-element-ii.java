class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        Arrays.fill(ans,-1);
        for(int i = nums.length*2-1;i>=0;i--) {
            int curr = nums[i%nums.length];
            while(!st.isEmpty() && st.peek()<=curr) {
                st.pop();
            }
            if(i<nums.length) {
                if(!st.isEmpty())
                    ans[i] = st.peek();
            }
            st.push(curr);
        }
        return ans;
    }
}