class Solution {
    public boolean rotateString(String s, String goal) {
        String ans = s+s;

        // if(ans.contains(goal)) return true;
        // return false;
        
        if(s.length()!=goal.length()) return false;
        return ans.contains(goal);
    }
}