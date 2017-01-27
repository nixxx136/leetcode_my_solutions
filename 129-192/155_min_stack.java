public class MinStack {

    /** initialize your data structure here. */
    
    class Element {
        int x;
        int min;
        public Element(int x, int min) {
            this.x = x;
            this.min = min;
        }
    }
    Stack<Element> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int x) {
        if(st.isEmpty()) st.push(new Element(x, x));
        else st.push(new Element(x, Math.min(x, st.peek().min)));
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().x;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */