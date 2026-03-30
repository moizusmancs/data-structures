class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack<>();

        for (String s : tokens){
            if(isArithmatic(s)){
                String pop1 = st.pop();
                String pop2 = st.pop();
                int ans = doArithmatic(pop2,pop1,s);
                st.push(String.valueOf(ans));
            }else{
                st.push(s);
            }
        }
        return Integer.parseInt(st.peek());
    }

    private boolean isArithmatic(String c){
        return (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") );
    }

    private int doArithmatic(String num1, String num2, String Op){
        int sum = 0;
        switch (Op) {
            case "+":
                sum = Integer.parseInt(num1) + Integer.parseInt(num2);
                break; 
            case "-":
                sum = Integer.parseInt(num1) - Integer.parseInt(num2);
                break; 
            case "*":
                sum = Integer.parseInt(num1) * Integer.parseInt(num2);
                break; 
            case "/":
                sum = Integer.parseInt(num1) / Integer.parseInt(num2);
                break; 
            default:
                sum = 0;
                break;
        }

        return sum;
    }
}