class Solution {

    public boolean isPossible(int[] dist, double givenHour, int speed) {
        double hourTaken = 0.0d;
        int n = dist.length;
        for (int i = 0; i < n; i++) {
            if (i == n - 1)
                hourTaken += (double) dist[i] / (double) speed;
            else {
                hourTaken += (dist[i] + speed - 1) / speed;
            }
        }
        return hourTaken > givenHour ? false : true;
    }

    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length, speed = 0;

        if (dist.length > Math.ceil(hour))
            return -1;

        int lo = 1, hi = 1_00_00_000;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(dist, hour, mid)) {
                speed = mid;
                hi = mid - 1;
            } else
                lo = mid + 1;
        }
        return speed;
    }
}