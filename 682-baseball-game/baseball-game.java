class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack();

        for(String ch : operations){

            switch(ch){
                case "+":
                    int top = stack.pop();
                    int newTop = stack.peek() + top;
                    stack.push(top);
                    stack.push(newTop);
                    break;
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push( stack.peek() * 2 );
                    break;
                default:
                    stack.push(Integer.valueOf(ch));
            }
        }

        int ans = 0;
        for (int score : stack) {
            ans+=score;
        }

        return ans;

        
    }
}