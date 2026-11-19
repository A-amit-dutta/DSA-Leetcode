class Solution {
    static void printSubSets(int idx, List<Integer> list, int[] arr, List<List<Integer>> ans) {
        if (idx >= arr.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        // take
        list.add(arr[idx]);
        printSubSets(idx + 1, list, arr, ans);

        // not take
        list.removeLast();
        printSubSets(idx + 1, list, arr, ans);
    }

    public List<List<Integer>> subsets(int[] arr) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        printSubSets(0, list, arr, ans);
        return ans;
    }
}