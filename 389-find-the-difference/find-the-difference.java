class Solution {
    public char findTheDifference(String s, String t) {
        int[] s1 = new int[27];
        int[] t1 = new int[27];
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            s1[x]++;
        }

        for (int i = 0; i < t.length(); i++) {
            int x = t.charAt(i) - 'a';
            t1[x]++;
        }
        for (int i = 0; i < 27; i++) {
            if (s1[i] != t1[i])
                return (char)(i + 'a');
        }
        return 'x';
    }
}