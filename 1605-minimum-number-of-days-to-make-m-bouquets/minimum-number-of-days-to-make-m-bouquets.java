class Solution {
    boolean isPossible(int[] arr,int m,int k,int day){
        int cnt = 0 , cntOfBouquet = 0 ,n = arr.length;
        for(int i = 0; i<n ; i++){
            if(day>=arr[i])
                cnt++;
            else{
                cntOfBouquet += cnt/k;
                cnt = 0;
            }
        }
        cntOfBouquet += cnt/k;
        if(cntOfBouquet >= m) return true;
        return false;
    }
    public int minDays(int[] days, int m, int k) {
        int n = days.length;
        // For ignoring Integer overflow error 
        if((long)m*k > (long)n) return -1;
        int lo = Integer.MAX_VALUE;
        int hi = Integer.MIN_VALUE;
        int ans = -1;
        for(int i = 0 ; i < n ; i++){
            lo = Math.min(days[i],lo);
            hi = Math.max(days[i],hi);
        }
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(days,m,k,mid) == true){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return ans;
    }
}