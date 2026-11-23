class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int[] arr = new int[51];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }
        int xor = 0;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] == 2) xor^=i;
        }
        return xor;
    }
}