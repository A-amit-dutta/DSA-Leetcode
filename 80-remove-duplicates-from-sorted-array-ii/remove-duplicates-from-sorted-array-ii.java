class Solution {
    public int removeDuplicates(int[] arr) {
        int k = 0, n = arr.length;
        for (int i = 0; i < n; i++) {
            if (k < 2 || arr[i] != arr[k - 2]) {
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}