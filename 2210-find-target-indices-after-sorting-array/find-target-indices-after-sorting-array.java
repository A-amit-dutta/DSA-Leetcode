class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        Arrays.sort(arr);
        List<Integer> lt = new ArrayList<>();
        for(int i = 0 ; i<arr.length ; i++){
            if(target == arr[i]) lt.add(i);
        }
        return lt;
    }
}