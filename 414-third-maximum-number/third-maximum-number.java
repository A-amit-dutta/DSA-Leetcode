class Solution {
    public int thirdMax(int[] arr) {
        int n = arr.length;
        long max1 = Long.MIN_VALUE , max2 = Long.MIN_VALUE, max3 = Long.MIN_VALUE;

        for(int i = 0 ; i<n ; i++){
            if(arr[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = (long)arr[i];
            }
            else if(arr[i]>max2 && arr[i] < max1){
                max3 = max2;
                max2 = (long)arr[i];
            }
            else if(arr[i]>max3 && arr[i] < max2){
                max3 = (long)arr[i];
            }
        }
        
        if(max3 == Long.MIN_VALUE) return (int)max1;
        return (int)max3;
    }
}