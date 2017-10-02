// Question: https://leetcode.com/problems/min-stack/

public class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> minST;

    /** initialize your data structure here. */
    public MinStack() {
        st = new Stack<Integer>();
        minST = new Stack<Integer>();
    }

    public void push(int x) {
        st.push(x);
        if (minST.empty()) {
            minST.push(x);
        } else {
            int min = minST.peek();
            if (x <= min) {
                minST.push(x);
            }
        }
    }

    public void pop() {
        int top = st.pop();
        if (top == minST.peek()) {
            minST.pop();
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minST.peek();
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
