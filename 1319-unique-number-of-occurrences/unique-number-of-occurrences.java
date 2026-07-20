class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int ele : arr) {
            mpp.put(ele, mpp.getOrDefault(ele, 0) + 1);
        }

        Set<Integer> st = new HashSet<>();

        for (int values : mpp.values()) {
            st.add(values);
        }
        return mpp.size()==st.size();

    }
}

// class Solution {
//     public boolean uniqueOccurrences(int[] arr) {
//         Map<Integer, Integer> freq = new HashMap<>();
//         for (int x : arr) {
//             freq.put(x, freq.getOrDefault(x, 0) + 1);
//         }

//         Set<Integer> s = new HashSet<>();
//         for (int x : freq.values()) {
//             s.add(x);
//         }

//         return freq.size() == s.size();
//     }
// }