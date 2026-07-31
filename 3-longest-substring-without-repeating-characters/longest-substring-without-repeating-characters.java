class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0 , j = 0 , len = 0,n = s.length();
        int[] arr = new int[256];

        while(j<n){
            while(arr[s.charAt(j)]>0){
                arr[s.charAt(i)] = 0;
                i++;
            }
            arr[s.charAt(j)] = 1;
            len = Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}