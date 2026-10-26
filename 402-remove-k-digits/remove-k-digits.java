class Solution {
    public String removeKdigits(String s, int k) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            while( !st.isEmpty() && k > 0 && st.peek()-'0' > s.charAt(i)-'0'){
                k--;
                st.pop();
            }
            st.push(s.charAt(i));
        }

        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){ 
            res.append(st.pop());
        }
        while(res.length() > 0 && res.charAt(res.length()-1) == '0'){
            res.deleteCharAt(res.length()-1);
        }
        res.reverse();
        if(res.isEmpty()) return "0";
        return res.toString();
    }
}