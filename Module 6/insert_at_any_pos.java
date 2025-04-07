class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    public static void insertAtAnyPos(Node head, int idx, int val) {
        Node newNode = new Node(val);
        Node tmp = head;

        for (int i = 1; i < idx; i++) {
            tmp = tmp.next;
        }

        newNode.next = tmp.next;
        tmp.next = newNode;
    }

    public static void printLinkedList(Node head) {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node a = new Node(20);
        Node b = new Node(30);

        head.next = a;
        a.next = b;

        insertAtAnyPos(head, 2, 100);
        insertAtAnyPos(head, 2, 200);
        printLinkedList(head);
    }
}
