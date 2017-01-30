public class MyStack {

    Queue<Integer> qu;

    /** Initialize your data structure here. */
    public MyStack() {
        qu = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        qu.offer(x);
        for (int i=0; i<qu.size()-1; i++) {
            qu.offer(qu.poll());
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return qu.poll();
    }
    
    /** Get the top element. */
    public int top() {
        return qu.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return qu.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */