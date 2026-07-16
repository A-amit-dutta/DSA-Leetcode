class Solution {
    public int mostFrequentEven(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> mpp = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            if (!mpp.containsKey(arr[i]) && arr[i] % 2 == 0) {
                mpp.put(arr[i], 1);
            } else if (arr[i] % 2 == 0 && mpp.containsKey(arr[i])) {
                mpp.put(arr[i], mpp.get(arr[i]) + 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int ans = -1;
        for (Integer key : mpp.keySet()) {
            if (mpp.get(key) > max) {
                max = mpp.get(key);
                ans = key;
            }
        }
        return ans;
    }
}