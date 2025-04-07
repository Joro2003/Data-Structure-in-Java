import java.util.Scanner;

class Node {
    int val;
    Node next;

    // Constructor for Node
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    // Method to insert a node at the tail
    public static void insertAtTail(Node head, Node tail, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Method to print the linked list
    public static void printLinkedList(Node head) {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }

    // Method to delete the tail node
    public static void deleteTail(Node head) {
        if (head == null) {
            return;  // Empty list, nothing to delete
        }
        
        Node tmp = head;
        while (tmp.next != null && tmp.next.next != null) {
            tmp = tmp.next;
        }
        
        if (tmp.next != null) {
            Node deleteNode = tmp.next;
            tmp.next = null;
            System.out.println("Tail node deleted");
            deleteNode = null;  // Mark node for garbage collection
        }
    }

    // Method to delete a node at a specific position
    public static void deleteAtAnyPos(Node head, int idx) {
        if (head == null) {
            return;  // Empty list, nothing to delete
        }
        
        Node tmp = head;
        for (int i = 0; i < idx - 1 && tmp != null; i++) {
            tmp = tmp.next;
        }

        if (tmp != null && tmp.next != null) {
            Node deleteNode = tmp.next;
            tmp.next = tmp.next.next;
            System.out.println("Node at position " + idx + " deleted");
            deleteNode = null;  // Mark node for garbage collection
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        int val;
        // Input loop to create the linked list
        while (true) {
            val = sc.nextInt();
            if (val == -1) {
                break;
            }
            insertAtTail(head, tail, val);
        }

        // Print the linked list
        printLinkedList(head);

        // Delete the tail node
        deleteTail(head);

        // Print the linked list after deletion
        printLinkedList(head);
        
        // Example of deleting a node at a specific position
        System.out.println("Deleting node at position 1");
        deleteAtAnyPos(head, 1);
        printLinkedList(head);
    }
}
