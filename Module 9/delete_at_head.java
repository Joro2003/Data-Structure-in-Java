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

    // Function to delete the head node
    public static void deleteAtHead(Node head, Node tail) {
        if (head == null) {
            return; // List is empty, nothing to delete
        }
        
        // Remove the head node
        Node deleteNode = head;
        head = head.next;
        
        if (head == null) {
            tail = null; // If the list is empty now, set tail to null
        } else {
            head.prev = null; // Set head's previous to null
        }

        // Free the memory of the deleted node
        deleteNode = null; // In Java, this will be garbage collected later
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

        // Deleting the head node twice
        deleteAtHead(head, tail);
        deleteAtHead(head, tail);

        // Print the list after deletion
        printForward(head);
    }
}
