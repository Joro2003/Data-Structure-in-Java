import java.util.*;

public class MyQueue {
    public Stack<Integer> st;

    public MyQueue() {
        st = new Stack<>();
    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        Stack<Integer> st2 = new Stack<>();
        int val = 0;
        while (!st.isEmpty()) {
            val = st.pop();
            if (st.isEmpty()) break;
            st2.push(val);
        }
        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }
        return val;
    }

    public int peek() {
        Stack<Integer> st2 = new Stack<>();
        int val = 0;
        while (!st.isEmpty()) {
            val = st.pop();
            st2.push(val);
        }
        while (!st2.isEmpty()) {
            st.push(st2.pop());
        }
        return val;
    }

    public boolean empty() {
        return st.isEmpty();
    }
}
