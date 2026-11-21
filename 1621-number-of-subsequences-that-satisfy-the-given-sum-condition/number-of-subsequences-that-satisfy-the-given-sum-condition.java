class Solution {

    // static int cnt = 0;

    // public void subset(int idx, List<Integer> list, int[] arr, int target) {

    //     if (idx >= arr.length) {
    //         if(list.isEmpty()) return;
    //         int large = Integer.MIN_VALUE, small = Integer.MAX_VALUE;
    //         for (int i : list) {
    //             large = Math.max(large, i);
    //             small = Math.min(small, i);
    //         }
    //         long sum = (long) large + (long) small;
    //         if (sum <= target) {
    //             cnt = (cnt + 1) % (int) (1e9 + 7) ;
    //         }
    //         return;
    //     }
    //     list.add(arr[idx]);
    //     subset(idx + 1, list, arr, target);
    //     list.removeLast();
    //     subset(idx + 1, list, arr, target);
    // }

    public int numSubseq(int[] nums, int target) {
        // List<Integer> list = new ArrayList<>();
        // cnt = 0;
        // subset(0, list, nums, target);
        // return cnt;

        Arrays.sort(nums);
        int mod = 10_000000_07;
        int n = nums.length, ans = 0;
        int[] pow = new int[n];
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = (int) (((long) pow[i - 1] * 2 % mod));
        }

        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int sum = nums[lo] + nums[hi];
            if (sum <= target) {
                int diff = hi - lo;
                ans = (ans % mod + pow[diff] % mod) % mod;
                lo++;
            } else
                hi--;
        }
        return ans;
    }
}