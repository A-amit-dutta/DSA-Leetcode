class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num == 1) return false;
        int sum = 1;
        int temp = num;
        for (int i = 2; i < num ; i++) {
            if(num % i == 0) sum += i;
        }
        return temp == sum;
    }
}