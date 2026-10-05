
class MinStack {

    long min = Long.MAX_VALUE;
    Stack<Long> st = new Stack<>();

    public MinStack() {
    }

    public void push(int value) {

        if (st.isEmpty()) {
            min = value;
            st.push((long) value);
        } 
        else {
            if (value >= min) {
                st.push((long) value);
            } 
            else {
                st.push(2L * value - min);
                min = value;
            }
        }
    }

    public void pop() {

        if (st.isEmpty())
            return;

        long x = st.peek();

        if (x < min) {
            min = 2L * min - x;
        }

        st.pop();
    }

    public int top() {

        long x = st.peek();

        if (x < min)
            return (int) min;

        return (int) x;
    }

    public int getMin() {
        return (int) min;
    }
}
