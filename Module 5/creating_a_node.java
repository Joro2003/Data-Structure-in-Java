public class LinkedListExample {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(300);

        a.next = b;
        b.next = c;

        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
    }
}
