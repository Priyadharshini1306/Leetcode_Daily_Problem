class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i:nums) {
            m.put(i,m.getOrDefault(i,0)+1);
        }
        int sum = 0;
        for(int i: m.keySet()) {
            if((int)m.get(i)==1) {
                sum += i;
            }
        }
        return sum;
    }
}