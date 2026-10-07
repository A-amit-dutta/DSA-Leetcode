class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        Map<Integer,Integer> mpp = new HashMap<>(); 
        for(int i=nums2.length-1;i>=0;i--){
            while( !st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.isEmpty())
                mpp.put(nums2[i],-1);
            else
                mpp.put(nums2[i],st.peek());
            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            arr[i] = mpp.get(nums1[i]);
        }
        return arr;
    }
}