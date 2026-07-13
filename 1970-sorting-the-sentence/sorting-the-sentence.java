class Solution {
    public String sortSentence(String s) {
        String[] arr = new String[10];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch !=' '){
                sb.append(ch);
            }
            if(ch == ' ' || i == s.length()-1){
                int pos = sb.charAt(sb.length()-1)-'0';
                sb.deleteCharAt(sb.length()-1);
                arr[pos] = sb.toString();
            sb.setLength(0);
            }
        }
        sb.setLength(0);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=null ){
                sb.append(arr[i]+" ");
            }
        }
        return sb.toString().strip();
    }
}