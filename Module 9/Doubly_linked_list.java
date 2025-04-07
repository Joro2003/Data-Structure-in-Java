class Node {
    int val;
    Node next;
    Node prev;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class Main {

    // Function to print the list forward
    public static void printForward(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to print the list backward
    public static void printBackward(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating nodes for the doubly linked list
        Node head = new Node(10);
        Node a = new Node(20);
        Node tail = new Node(30);

        // Linking the nodes
        head.next = a;
        a.prev = head;

        a.next = tail;
        tail.prev = a;

        // Print the list forward
        printForward(head);

        // Print the list backward
        printBackward(tail);
    }
}
