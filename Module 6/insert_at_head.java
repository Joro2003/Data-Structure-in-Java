class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    public static Node insertAtHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
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

        head = insertAtHead(head, 100);
        head = insertAtHead(head, 200);
        head = insertAtHead(head, 300);

        printLinkedList(head);
    }
}
