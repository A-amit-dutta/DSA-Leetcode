class Solution {
    public int maxProduct(int n) {
        int dig1 = 0 , dig2 = 0;
        while(n>0){
            int rem = n % 10;
            if(rem > dig1){
                dig2 = dig1;
                dig1 = rem; 
            }
            else if(rem > dig2 && rem <= dig1){
                dig2 = rem;
            }
            n /= 10;
        }
        return dig1 * dig2;
    }
}