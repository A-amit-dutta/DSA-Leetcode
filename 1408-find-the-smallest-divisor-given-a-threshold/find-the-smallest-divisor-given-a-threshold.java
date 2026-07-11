class Solution {
    public int smallestDivisor(int[] arr, int threshold) {
        int n = arr.length;
        int lo = 1 , hi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            hi = Math.max(hi,arr[i]);
        }
        int ans = 0;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int sum = 0;
            for(int i=0;i<n;i++){
                sum+= (arr[i] + mid - 1) / mid;
            }
            if(sum>threshold) lo = mid+1;
            else{
                ans = mid;
                hi = mid - 1;
            }
        }
        return ans;
    }
}