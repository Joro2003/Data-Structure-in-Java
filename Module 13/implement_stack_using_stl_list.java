import java.util.*;

public class MyStack {
    public LinkedList<Integer> list = new LinkedList<>();

    public void push(int val) {
        list.addLast(val);
    }

    public void pop() {
        list.removeLast();
    }

    public int top() {
        return list.getLast();
    }

    public int size() {
        return list.size();
    }

    public boolean empty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack st = new MyStack();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.push(x);
        }

        while (!st.empty()) {
            System.out.println(st.top());
            st.pop();
        }
    }
}
