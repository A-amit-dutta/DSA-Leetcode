class Solution {


    public int[] nsl(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int nsl[] = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            nsl[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return nsl;
    }

    public int[] nsr(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nsr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nsr[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nsr;
    }


    public int[] prevGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] prevGreater = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            prevGreater[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return prevGreater;
    }

    public int[] nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nextGreater = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            nextGreater[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return nextGreater;
    }

    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        int[] nsl = nsl(nums);
        
        int[] nsr = nsr(nums);
       
        int[] prevGreater = prevGreater(nums);
        
        int[] nextGreater = nextGreater(nums);
        

        long total = 0;
        for(int i=0;i<n;i++){
            long temp1 = (i - nsl[i])*(nsr[i] - i);
            long contribution1 = temp1 * 1l * nums[i];
            long temp2 = (i - prevGreater[i])*(nextGreater[i] - i);
            long contribution2 = temp2 * 1l * nums[i];
            total = total + (contribution2 - contribution1);
        }
        return total;
    }
}