
class MinStack {
    Stack<Long> st;
    long min = Long.MAX_VALUE;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int value) {
        if (st.isEmpty()) {
            st.push((long)value);
            min = value;
        } 
        else {
            if (value > min) {
                st.push((long)value);
            } 
            else {
                st.push(2L * value - min);
                min = value;
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long x = st.pop();

        if (x < min) {
            min = 2 * min - x;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long x = st.peek();

        if (x < min) return (int)min;

        return (int)x;
    }

    public int getMin() {
        return (int)min;
    }
}
