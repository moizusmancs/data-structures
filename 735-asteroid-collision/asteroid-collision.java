class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int astr : asteroids){
            while (!st.isEmpty() && st.peek() > 0 && astr < 0){
                if (st.peek() > Math.abs(astr)){
                    astr = 0;
                    break;
                }else if( st.peek() == Math.abs(astr)){
                    st.pop();
                    astr = 0;
                    break;
                }else if(st.peek() < Math.abs(astr)){
                    st.pop();
                }
            }

            if(astr != 0)st.push(astr);

        }

        int[] result = new int[st.size()];
        for(int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
        
    }
}