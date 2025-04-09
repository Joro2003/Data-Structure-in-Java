import java.util.*;

public class MyStack {

    public class Node {
        public int val;
        public Node next;
        public Node prev;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head = null;
    public Node tail = null;
    public int sz = 0;

    public void push(int val) {
        sz++;
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        newnode.prev = tail;
        tail = newnode;
    }

    public void pop() {
        sz--;
        Node deletenode = tail;
        tail = tail.prev;
        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }
    }

    public int top() {
        return tail.val;
    }

    public int size() {
        return sz;
    }

    public boolean empty() {
        return head == null;
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
