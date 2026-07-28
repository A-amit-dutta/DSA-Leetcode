class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        for( char ch : s.toCharArray()){
            int pos = ch - 'a';
            arr[pos]++;
        }

        for(int i = 0;i<26;i++){
            char ch = (char)(i + 'a');
            int even = arr[i]/2;
            while(even>0){
                sb.append(ch);
                even--;
            }
        }
        if(s.length()%2!=0){
            for(int i=0;i<26;i++){
                if(arr[i]%2!=0){
                    char ch = (char)(i + 'a');
                    sb.append(ch);
                }
            }
        }
        if(s.length()%2==0){
            for(int i =sb.length()-1;i>=0;i--){
                sb.append(sb.charAt(i));
            }
        }        
        else{
            for(int i =sb.length()-2;i>=0;i--){
                sb.append(sb.charAt(i));
            }
        }
        return sb.toString();
    }
}