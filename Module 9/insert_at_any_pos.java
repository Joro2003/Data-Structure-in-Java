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

    // Function to insert a node at any position in the doubly linked list
    public static void insertAtAnyPos(Node head, int idx, int val) {
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
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

        // Inserting nodes at specific positions
        insertAtAnyPos(head, 2, 100);
        insertAtAnyPos(head, 1, 500);

        // Printing the updated linked list
        printForward(head);
    }
}
