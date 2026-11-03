class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2] , steps = 0;
        for(int num : nums){
            if(num > mid){
                steps = steps + (num - mid);
            }
            else{
                steps = steps + (mid - num );
            }
        }
        return steps;
    }
}