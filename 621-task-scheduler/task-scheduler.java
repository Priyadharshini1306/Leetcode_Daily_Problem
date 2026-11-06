class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] fre = new int[26];
        for(char a: tasks) {
            fre[a-'A']++;
        }
        Arrays.sort(fre);
        int maxfre = fre[25];
        int idle = (maxfre-1)*n;
        for(int i = 24;i>=0;i--) {
            idle -= Math.min(maxfre-1,fre[i]);
        }
        if(idle<0) idle = 0;
        return tasks.length+idle;
    }
}