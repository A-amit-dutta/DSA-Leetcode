class Solution {

    public double pow(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double ans = 0.000;
        ans = pow(x, n / 2);
        ans = n % 2 == 0 ? ans * ans : ans * ans * x;
        return ans;
    }

    public double myPow(double x, int n) {
        long N = (long) n;
        double ans = pow(x, Math.abs(N));
        if (n < 0) {
            ans = 1 / ans;
        }
        return ans;
    }
}