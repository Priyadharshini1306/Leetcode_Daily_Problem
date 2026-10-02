class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int fleet = position.length;
        HashMap<Integer,Float> map = new HashMap<>();
        for(int i = 0;i<fleet;i++) {
            float time = ((float)target-position[i])/speed[i];
            map.put(position[i],time);
        }
        Arrays.sort(position);
        int i = fleet-1;
        while(i>0) {
            float c = map.get(position[i]);
            i--;
            while(i>=0 && c>=map.get(position[i])) {
                fleet--;
                i--;
            }
        }
        return fleet;
    }
}