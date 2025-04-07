class Node {
    int val;
    Node next;
    Node prev;

    // Constructor for the Node class
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

    // Function to delete the tail node
    public static void deleteAtTail(Node head, Node tail) {
        if (tail == null) return; // List is empty, nothing to delete

        // Remove the tail node
        Node deleteNode = tail;
        tail = tail.prev;

        if (tail == null) {
            head = null; // If the list becomes empty, set head to null
        } else {
            tail.next = null; // Set the new tail's next to null
        }

        // In Java, no need for explicit deletion, as the garbage collector will handle it
        deleteNode = null; // Mark the deleted node for garbage collection
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

        // Deleting the tail node
        deleteAtTail(head, tail);

        // Print the list after deletion
        printForward(head);
    }
}
