class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mpp = new HashMap<>(2005);
        for (int ele : arr) {
            mpp.put(ele, mpp.getOrDefault(ele, 0) + 1);
        }

        // int[] hash = new int[2005];
        // for(int ele : arr){
        //     hash[ele+1000]++;
        // }

        Set<Integer> st = new HashSet<>();

        for (int values : mpp.values()) {
            st.add(values);
        }
        return mpp.size()==st.size();

    }
}