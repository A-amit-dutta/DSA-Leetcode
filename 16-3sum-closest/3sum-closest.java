class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int closeSum = 0 , diff1 = Integer.MAX_VALUE;;
        int n = arr.length ;
        for(int i = 0 ; i < n ; i++){
            int j = i+1 , k = n-1;
            while(j<k){
                int s = arr[i] + arr[j] + arr[k];
                int diff = Math.max(target,s) - Math.min(target,s);
                if(diff<diff1){
                    closeSum = s;
                    diff1 = diff;
                }
                if(s>target) 
                    k--;
                else if(s<target)
                    j++;
                else 
                return s;
            }
        }
        return closeSum;
    }
}