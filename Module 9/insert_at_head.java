class Node {
    int val;
    Node next;
    Node prev;

    // Constructor for Node
    Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class Main {

    // Function to print the linked list from head to tail
    public static void printForward(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to insert a node at the head of the doubly linked list
    public static void insertAtHead(Node head, Node tail, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public static void main(String[] args) {
        // Creating nodes for the linked list
        Node head = new Node(10);
        Node a = new Node(20);
        Node tail = new Node(30);

        // Linking nodes together
        head.next = a;
        a.prev = head;

        a.next = tail;
        tail.prev = a;

        // Inserting nodes at the head
        insertAtHead(head, tail, 100);
        insertAtHead(head, tail, 200);

        // Printing the updated linked list
        printForward(head);
    }
}
