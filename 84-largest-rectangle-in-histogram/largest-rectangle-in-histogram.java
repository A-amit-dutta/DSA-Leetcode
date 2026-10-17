
class Solution {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length, psi, nsi, area = 0;
        Deque<Integer> st = new ArrayDeque<>();
        // Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                int currIdx = st.pop();
                nsi = i;
                psi = st.isEmpty() ? -1 : st.peek();
                area = Math.max(area, arr[currIdx] * (nsi - psi - 1));
            }
            st.push(i);
        }
        nsi = n;
        while (!st.isEmpty()) {
            int currIdx = st.pop();
            psi = st.isEmpty() ? -1 : st.peek();
            area = Math.max(area, arr[currIdx] * (nsi - psi - 1));
        }
        return area;
    }
}