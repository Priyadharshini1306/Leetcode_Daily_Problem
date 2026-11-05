class Trio {
    int x;
    int y;
    int dis;
    Trio(int x,int y,int dis) {
        this.x = x;
        this.y = y;
        this.dis = dis;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Trio> q = new PriorityQueue<>((a,b)->b.dis-a.dis);
        for(int i = 0;i<points.length;i++) {
            int dist = points[i][0]*points[i][0]+points[i][1]*points[i][1];
            q.offer(new Trio(points[i][0],points[i][1],dist));
            if(q.size()>k) q.poll();
        }
        int[][] ans = new int[k][2];
        int l = 0;
        for(Trio a:q) {
            ans[l][0] = a.x;
            ans[l][1] = a.y;
            l++; 
        }
        return ans;
    }

}