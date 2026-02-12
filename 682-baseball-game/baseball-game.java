class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for(String st : operations){

            if(st.equals("+")){
                int num = stack.pop();
                int sum = num + stack.peek();
                stack.push(num);
                stack.push(sum);
            }
            else if(st.equals("D")){
                stack.push( stack.peek() * 2 );
            }else if(st.equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.valueOf(st));
            }
        }

        int ans = 0;
        for(int score : stack){
            ans+=score;
        }

        return ans;
        
    }
}