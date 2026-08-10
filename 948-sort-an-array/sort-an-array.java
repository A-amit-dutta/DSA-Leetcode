class Solution {
    public static void merge(int[] arr,int lo,int mid,int hi){
        int left = lo;
        int right = mid+1;
        ArrayList<Integer> al = new ArrayList<>();
        while(left<=mid && right <= hi){
            if(arr[left]>=arr[right]){
                al.add(arr[right]);
                right++;
            }
            else{
                al.add(arr[left]);
                left++;
            }
        }
        while(left<=mid){
            al.add(arr[left]);
            left++;
        }
        while(right<=hi){
            al.add(arr[right]);
            right++;
        }
        for(int i=lo;i<=hi;i++){
            arr[i] = al.get(i-lo);
        }
    }
    
    public static void mergeSort(int[] arr,int lo,int hi){
        if(lo>=hi) return;
        int mid = (lo+hi)/2;
        mergeSort(arr,lo,mid);
        mergeSort(arr,mid+1,hi);
        merge(arr,lo,mid,hi);
    }
    public int[] sortArray(int[] nums) {
         mergeSort(nums,0,nums.length-1);
        return nums;
    }
}