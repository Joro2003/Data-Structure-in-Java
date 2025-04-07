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

    // Function to delete a node at any position
    public static void deleteAtAnyPos(Node head, int idx) {
        Node temp = head;
        // Traverse to the node before the one to be deleted
        for (int i = 1; i < idx; i++) {
            if (temp == null || temp.next == null) {
                return;  // Position is out of bounds
            }
            temp = temp.next;
        }

        // Delete the node
        Node deleteNode = temp.next;
        if (deleteNode != null) {
            temp.next = deleteNode.next;
            if (deleteNode.next != null) {
                deleteNode.next.prev = temp;
            }
            deleteNode.next = null;  // Disconnect the node
            deleteNode.prev = null;  // Disconnect the node
        }
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

        // Deleting the node at position 1 (zero-indexed, so it deletes the second node, value 20)
        deleteAtAnyPos(head, 1);
        
        // Print the list after deletion
        printForward(head);
    }
}
