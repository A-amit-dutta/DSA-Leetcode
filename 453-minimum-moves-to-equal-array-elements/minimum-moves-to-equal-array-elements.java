class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        long steps = 0l;
        for (int i : nums) {
            min = Math.min(min, i);
        }
        for (int x : nums) {
            steps = steps + (long) x - min;
        }
        return (int) steps;
    }
}