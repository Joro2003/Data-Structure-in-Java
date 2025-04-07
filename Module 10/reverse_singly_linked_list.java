import java.util.Scanner;

public class SinglyLinkedList {

    // Node class to represent each element in the list
    static class Node {
        int val;
        Node next;

        // Constructor
        Node(int val) {
            this.val = val;
            this.next = null;
        }
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

    // Method to reverse the linked list recursively
    public static void reverseLinkedList(Node head, Node tail, Node tmp) {
        if (tmp.next == null) {
            head = tmp;
            return;
        }
        reverseLinkedList(head, tail, tmp.next);
        tmp.next.next = tmp;
        tmp.next = null;
        tail = tmp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        // Insert values into the linked list
        while (true) {
            int val = scanner.nextInt();
            if (val == -1) {
                break;
            }
            insertAtTail(head, tail, val);
        }

        // Reverse the linked list recursively
        reverseLinkedList(head, tail, head);

        // Print the values of head and tail
        System.out.println(head.val);
        System.out.println(tail.val);

        scanner.close();
    }
}
