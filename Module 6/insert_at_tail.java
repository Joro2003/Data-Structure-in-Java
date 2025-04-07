class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    public static Node insertAtTail(Node head, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            return newNode;
        }

        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = newNode;
        return head;
    }

    public static void printLinkedList(Node head) {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

    public static void main(String[] args) {
        Node head = null;

        head = insertAtTail(head, 40);
        head = insertAtTail(head, 50);
        head = insertAtTail(head, 60);

        printLinkedList(head);
    }
}
