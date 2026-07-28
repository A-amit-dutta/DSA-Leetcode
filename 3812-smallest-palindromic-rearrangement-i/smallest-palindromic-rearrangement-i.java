class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[26];
        for( int i=0;i<s.length();i++){
            int pos = s.charAt(i) - 'a';
            arr[pos]++;
        }

        for(int i = 0;i<26;i++){
            char ch = (char)(i + 'a');
            if(arr[i]%2==0){
                int even = arr[i]/2;
                while(even>0){
                    sb.append(ch);
                    even--;
                }
            }
            else{
                int odd = arr[i]/2;
                while(odd>0){
                    sb.append(ch);
                    odd--;
                }
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