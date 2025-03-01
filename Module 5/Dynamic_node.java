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
        Node head = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);

        head.next = a;
        a.next = b;

        System.out.println(head.val);
        System.out.println(head.next.val);
    }
}
