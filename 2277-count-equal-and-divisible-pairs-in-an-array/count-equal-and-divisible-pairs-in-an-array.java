class Solution {
    public int countPairs(int[] nums, int k) {
        HashMap<Integer,List<Integer>> m = new HashMap<>();
        for(int i = 0;i< nums.length;i++) {
            int num = nums[i];
            if(!m.containsKey(num)) {
                m.put(num,new ArrayList<Integer>());
            }
            m.get(num).add(i);
        }
        int count = 0;
        for(List l:m.values()) {
            for(int i = 0;i<l.size()-1;i++) {
                for(int j = i+1;j<l.size();j++) {
                    if(((int)l.get(i)*(int)l.get(j))%k==0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}