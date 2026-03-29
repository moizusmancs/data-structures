class MyQueue {

    Deque<Integer> deq1;
    Deque<Integer> deq2;


    public MyQueue() {
        this.deq1 = new ArrayDeque<>();
        this.deq2 = new ArrayDeque<>();

    }
    
    public void push(int x) {
        while (!deq1.isEmpty()){
            deq2.offerFirst(deq1.pollFirst());
        }
        deq1.offerFirst(x);
        while (!deq2.isEmpty()){
            deq1.offerFirst(deq2.pollFirst());
        }
    }
    
    public int pop() {
        return deq1.pollFirst();
    }
    
    public int peek() {
        return deq1.peekFirst();
    }
    
    public boolean empty() {
        return deq1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */