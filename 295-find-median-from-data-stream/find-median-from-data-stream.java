class MedianFinder {
    List<Integer> l;
    public MedianFinder() {
        l = new ArrayList<>();
    }
    
    public void addNum(int num) {
        int index = Collections.binarySearch(l, num);

        if(index < 0) {
            index = -(index + 1);
        }

        l.add(index, num);
    }
    
    public double findMedian() {
        int len = l.size();
        if(len%2!=0) {
            return (double)l.get(len/2);
        } else {
            int b = len/2;
            int a = (len/2)-1;
            return (l.get(a)+l.get(b))/2.0;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */