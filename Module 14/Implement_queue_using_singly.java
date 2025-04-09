import java.util.*;

public class Main {

    public static class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class MyQueue {
        public Node head = null;
        public Node tail = null;
        public int sz = 0;

        public void push(int val) {
            sz++;
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public void pop() {
            sz--;
            Node deleteNode = head;
            head = head.next;
            if (head == null) {
                tail = null;
            }
        }

        public int front() {
            return head.val;
        }

        public int back() {
            return tail.val;
        }

        public int size() {
            return sz;
        }

        public boolean empty() {
            return head == null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue q = new MyQueue();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            q.push(val);
        }
        while (!q.empty()) {
            System.out.println(q.front());
            q.pop();
        }
    }
}
