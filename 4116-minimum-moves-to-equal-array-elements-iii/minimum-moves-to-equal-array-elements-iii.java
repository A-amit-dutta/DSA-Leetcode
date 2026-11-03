class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0], steps = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }

        for (int i = 0; i < nums.length; i++) {
            steps = steps + (max - nums[i]);
        }
        return steps;
    }
}