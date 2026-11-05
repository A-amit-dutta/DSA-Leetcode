class Solution {

    public int digSum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public int differenceOfSum(int[] nums) {
        int esum = 0, dsum = 0;
        for (int i = 0; i < nums.length; i++) {
            esum += nums[i];
            dsum += digSum(nums[i]);
        }
        return Math.abs(esum - dsum);
    }
}