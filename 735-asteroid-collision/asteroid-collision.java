class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack();
        int sum = 0;

        for (int i = 0; i < asteroids.length; i++) {
            while(!st.isEmpty() && asteroids[i] < 0 && st.peek() > 0 ){
                sum = asteroids[i] + st.peek();
                if(sum < 0)
                    st.pop();
                else if(sum > 0){
                   asteroids[i] = 0;
                   break;
                }
                else{
                    st.pop();
                    asteroids[i] = 0;
                    break;
                }  
            }
            if(asteroids[i] != 0)
                st.push(asteroids[i]);
        }

        int arr[] = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i] = st.peek();
            st.pop();
        }
        return arr;
    }
}