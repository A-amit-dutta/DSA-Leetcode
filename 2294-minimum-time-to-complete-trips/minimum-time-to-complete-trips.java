class Solution {

    public long minTime(int[] arr, long mid) {
        long trips = 0;
        for (int i = 0; i < arr.length; i++) {
            trips += mid / (long) arr[i];
        }
        return trips;
    }

    public long minimumTime(int[] time, int totalTrips) {
        long sum = 0;
        for (int i : time) {
            sum = Math.max(sum, i);
        }
        long lo = 1, hi = sum * (long)totalTrips;
        long times = 0;
        while (lo <= hi) {
            // 1. find the time 
            long mid = lo + (hi - lo) / 2;

            // 2. check in that time the bus  can complete the trip or not

            if (minTime(time, mid) >= totalTrips) {
                times = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return times;
    }
}