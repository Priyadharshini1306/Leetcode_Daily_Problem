class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int cn1 = 0;
        int cn2 = 0;
        for(int i = 0;i<nums.length;i++) {
            if(cn1==0 && nums[i]!=ele2) {
                ele1 = nums[i];
                cn1++;
            } else if(cn2==0 && nums[i]!=ele1) {
                ele2 = nums[i];
                cn2++;
            } else if(ele1==nums[i]) {
                cn1++;
            } else if(ele2==nums[i]) {
                cn2++;
            } else {
                cn1--;
                cn2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
        cn1 = 0;
        cn2 = 0;
        for(int i = 0;i<nums.length;i++) {
            if(nums[i]==ele1) cn1++;
            if(nums[i]==ele2) cn2++;
        }
        int min = (int)(nums.length/3)+1;
        if(cn1>=min) ls.add(ele1);
        if(cn2>=min) ls.add(ele2);
         Collections.sort(ls);
         return ls;

    }
}