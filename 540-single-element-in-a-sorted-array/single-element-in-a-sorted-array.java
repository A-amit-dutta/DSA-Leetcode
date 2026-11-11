
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int lo = 0, hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            // Make mid even
            if (mid % 2 != 0) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                // Pair is correctly positioned
                lo = mid + 2;
            } else {
                // Single element is in left half
                hi = mid;
            }
        }

        return nums[lo];
    }
}
