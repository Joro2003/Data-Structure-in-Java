import java.util.*;

public class Main {

    public static class MyQueue {
        public LinkedList<Integer> list = new LinkedList<>();

        public void push(int val) {
            list.addLast(val);
        }

        public void pop() {
            list.removeFirst();
        }

        public int front() {
            return list.getFirst();
        }

        public int back() {
            return list.getLast();
        }

        public int size() {
            return list.size();
        }

        public boolean empty() {
            return list.isEmpty();
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
