class Solution {
    public int[] dailyTemperatures(int[] t) {

        int[] results = new int[t.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<t.length; i++){
            while(!st.isEmpty() && t[st.peek()] < t[i]){
                int val = st.pop();
                results[val] = i-val;
            }
            st.push(i);
        }
        return results;
        
    }
}