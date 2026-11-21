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
        int mod = 1000000007;
        int n = nums.length;

        int left = 0;
        int right = n - 1;

        int[] pow = new int[n];

        pow[0] = 1;

        for (int i = 1; i < n; i++) {
            pow[i] = (pow[i - 1] * 2) % mod;
        }

        int ans = 0;

        while (left <= right) {

            if (nums[left] + nums[right] <= target) {

                ans = (ans + pow[right - left]) % mod;

                left++;
            } else {
                right--;
            }
        }

        return ans;
    }
}