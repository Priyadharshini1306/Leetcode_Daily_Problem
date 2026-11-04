
class Pair {
    int val;
    int idx;

    public Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}

class StockSpanner {
    Stack<Pair> st;
    int count = 0;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {

        while (!st.isEmpty() && st.peek().val <= price) {
            st.pop();
        }

        int ans;

        if (!st.isEmpty()) {
            ans = count - st.peek().idx;
        } else {
            ans = count + 1;
        }

        st.push(new Pair(price, count));
        count++;

        return ans;
    }
}
