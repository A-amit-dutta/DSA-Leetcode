class Solution {
    boolean evenDig(int n) {
        if (n >= 10 && n <= 99)
            return true;
        if (n >= 1000 && n <= 9999)
            return true;
        if (n >= 100000 && n <= 999999)
            return true;
        return false;
    }

    public int findNumbers(int[] nums) {
        int total = 0;
        for (int ele : nums) {
            if (evenDig(ele)) {
                total += 1;
            }
        }
        return total;
    }
}