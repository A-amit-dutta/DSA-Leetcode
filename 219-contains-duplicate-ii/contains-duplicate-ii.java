class Solution {
    public boolean containsNearbyDuplicate(int[] arr, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(arr[0], 0);
        for (int i = 1; i < arr.length; i++) {
            if (mpp.containsKey(arr[i])) {
                if (Math.abs(i - mpp.get(arr[i])) <= k) {
                    return true;
                } else
                    mpp.put(arr[i], i);

            } else {
                mpp.put(arr[i], i);
            }
        }
        return false;
    }
}