class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr[0].length;
        int n = arr.length;
        
        int i = 0,j = m-1;
        while(i<n && j>=0){
            if(arr[i][j] == target) return true;
            if(arr[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}