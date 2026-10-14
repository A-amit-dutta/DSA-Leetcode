class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length  ;
        long  total = 0;
        int MOD = 1_000_000_007;
        int[] nsl = new int[n];
        int[] nsr = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            nsl[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nsr[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        for (int i = 0; i < n; i++) {
            int left = (i-nsl[i]);
            int right = nsr[i] - i ;

            // total ways 
            long totalWays = left*1l*right*arr[i];
            total = (totalWays + total) % MOD;
        }
        return (int)total;
    }
}