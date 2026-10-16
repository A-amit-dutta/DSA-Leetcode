
class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0, pse, nse;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                int idx = st.pop();
                nse = i;
                pse = st.isEmpty() ? -1 : st.peek();
                maxArea = Math.max(maxArea, (nse - pse - 1) * arr[idx]);
            }
            st.push(i);
        }

        while (!st.isEmpty()) {
            int idx = st.pop();
            pse = st.isEmpty() ? -1 : st.peek();
            nse = n;
            maxArea = Math.max(maxArea, (nse - pse - 1) * arr[idx]);
        }
        return maxArea;
    }
}