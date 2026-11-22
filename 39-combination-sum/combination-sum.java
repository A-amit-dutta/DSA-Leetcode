class Solution {
    public void findComb(int idx, int target, int[] arr, List<Integer> list, List<List<Integer>> ans) {
        if (idx == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(list));
                return;
            } else
                return;
        }
        if (arr[idx] <= target) {
            // picking same idx
            list.add(arr[idx]);
            target -= arr[idx];
            findComb(idx, target, arr, list, ans);
            target += arr[idx];
            list.removeLast();
        }
        // not pick
        findComb(idx + 1, target, arr, list, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        findComb(0, target, candidates, list, ans);
        return ans;
    }
}