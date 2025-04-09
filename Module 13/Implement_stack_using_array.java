import java.util.*;

public class MyStack {

    public ArrayList<Integer> v;

    public MyStack() {
        v = new ArrayList<>();
    }

    public void push(int val) {
        v.add(val);
    }

    public void pop() {
        if (!v.isEmpty()) {
            v.remove(v.size() - 1);
        }
    }

    public int top() {
        if (!v.isEmpty()) {
            return v.get(v.size() - 1);
        }
        throw new EmptyStackException();
    }

    public int size() {
        return v.size();
    }

    public boolean empty() {
        return v.isEmpty();
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

        sc.close();
    }
}
