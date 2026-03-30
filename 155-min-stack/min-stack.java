class MinStack {

    Stack<Integer> s;
    Stack<Integer> min;

    public MinStack() {
        this.s = new Stack<>();
        this.min = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if (min.isEmpty() || val <= min.peek()){
            min.push(val);
        }
    }
    
    public void pop() {
        Integer removed = s.pop();
        if(removed.equals(min.peek())){
            min.pop();
        }
    }
    
    public int top() {
        return s.isEmpty() ? -1 : s.peek();
    }
    
    public int getMin() {
        return min.isEmpty() ? -1 : min.peek();

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */