class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxHour = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            maxHour = Math.max(maxHour, piles[i]);
        }

        int lo = 1, hi = maxHour;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (requiredHour(piles, mid) > h) {
                lo = mid + 1;
            } else {
                maxHour = mid;
                hi = mid - 1;
            }
        }
        return maxHour;
    }

    public long requiredHour(int[] arr, int mid) {
        long totalHour = 0;
        for (int i = 0; i < arr.length; i++) {
            totalHour += ((long) arr[i] + (long) mid - 1) / (long) mid;
        }
        return totalHour;
    }
}