class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] s1 = new int[26];
        int[] t1 = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            int x = ransomNote.charAt(i) - 'a';
            s1[x]++;
        }

        for (int i = 0; i < magazine.length(); i++) {
            int x = magazine.charAt(i) - 'a';
            t1[x]++;
        }

        for (int i = 0; i < 26; i++) {
            if (t1[i] < s1[i])
                return false;
        }
        return true;
    }
}