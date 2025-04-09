import java.util.*;

public class MyStack {
    public Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
    }

    public int pop() {
        Queue<Integer> q2 = new LinkedList<>();
        int val = 0;
        while (!q.isEmpty()) {
            val = q.remove();
            if (q.isEmpty()) break;
            q2.add(val);
        }
        q = q2;
        return val;
    }

    public int top() {
        int val = 0;
        for (int x : q) val = x;
        return val;
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
