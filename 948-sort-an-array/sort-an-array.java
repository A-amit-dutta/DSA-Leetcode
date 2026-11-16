class Solution {

    public void merge(int[] arr, int[] temp, int lo, int mid, int hi) {
        int left = lo, right = mid + 1;
        int k = lo;
        while (left <= mid && right <= hi) {
            if (arr[left] > arr[right]) {
                temp[k++] = arr[right++];
            } else {
                temp[k++] = arr[left++];
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }
        while (right <= hi) {
            temp[k++] = arr[right++];
        }
        for (int i = lo; i <= hi; i++) {
            arr[i] = temp[i];
        }
    }

    public void mergesort(int[] arr, int[] temp, int lo, int hi) {
        if (lo >= hi)
            return;
        int mid = lo + (hi - lo) / 2;

        mergesort(arr, temp, lo, mid);
        mergesort(arr, temp, mid + 1, hi);
        merge(arr, temp, lo, mid, hi);
    }

    public int[] sortArray(int[] nums) {
        int[] temp = new int[nums.length];
        int n = nums.length;
        mergesort(nums, temp, 0, n - 1);
        return nums;
    }
}