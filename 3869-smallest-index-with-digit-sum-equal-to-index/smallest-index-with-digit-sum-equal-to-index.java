class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(sum(nums[i]) == i) return i;
        }
        return -1;
    }

    public static int sum(int x){
        int rem = 0;
        while(x>0){
            rem += x % 10;
            x /= 10;
        }
        return rem;
    }
}