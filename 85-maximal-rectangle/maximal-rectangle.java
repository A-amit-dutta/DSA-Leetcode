class Solution {

    public int largestRectangle(int[] arr) {
        int area = 0, nsi, psi, n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                int idx = st.pop();
                nsi = i;
                psi = st.isEmpty() ? -1 : st.peek();
                area = Math.max(area, (nsi - psi - 1) * arr[idx]);
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            nsi = n;
            int idx = st.pop();
            psi = st.isEmpty() ? -1 : st.peek();
            area = Math.max(area, (nsi - psi - 1) * arr[idx]);
        }
        return area;
    }

    public int maximalRectangle(char[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];
        int maxArea = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            int preSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                int n = matrix[i][j] - '0';
                preSum += n;
                if (n == 0)
                    preSum = 0;
                arr[i][j] = preSum;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            maxArea = Math.max(maxArea, largestRectangle(arr[i]));
        }
        return maxArea;
    }
}