import java.util.Scanner;

public class DoublyLinkedList {

    // Node class to represent each element in the doubly linked list
    static class Node {
        int val;
        Node next;
        Node prev;

        // Constructor
        Node(int val) {
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // Method to print the linked list forward
    public static void printForward(Node head) {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.val + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    // Method to insert a new node at the tail of the list
    public static void insertAtTail(Node head, Node tail, int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Method to reverse the doubly linked list
    public static void reverseDoubly(Node head, Node tail) {
        Node i = head;
        Node j = tail;
        
        while (i != j && i.prev != j) {
            // Swap values of nodes i and j
            int temp = i.val;
            i.val = j.val;
            j.val = temp;
            
            i = i.next;
            j = j.prev;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        // Input values to insert in the doubly linked list
        while (true) {
            int val = scanner.nextInt();
            if (val == -1) {
                break;
            }
            insertAtTail(head, tail, val);
        }

        // Print the list before reversal
        printForward(head);

        // Reverse the doubly linked list
        reverseDoubly(head, tail);

        // Print the list after reversal
        printForward(head);

        // Print the values at head and tail
        System.out.println(head.val);
        System.out.println(tail.val);

        scanner.close();
    }
}
