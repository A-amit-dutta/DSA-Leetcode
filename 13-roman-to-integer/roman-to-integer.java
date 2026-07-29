class Solution {

    public int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s) {
        // Map<Character,Integer> mpp = new HashMap<>();
        // mpp.put('I',1);
        // mpp.put('V',5);
        // mpp.put('X',10);
        // mpp.put('L',50);
        // mpp.put('C',100);
        // mpp.put('D',500);
        // mpp.put('M',1000);
       
        int sum = 0 ;
        for(int i=0;i<s.length()-1;i++){
            // int current = mpp.get(s.charAt(i));
            // int next = mpp.get(s.charAt(i+1)) ;
            int current = value(s.charAt(i));
            int next = value(s.charAt(i+1));

            if(current>= next)
                sum += current;
            
            else
                sum -= current;
        }
        sum += value(s.charAt(s.length()-1));
        return sum;       
    }
}