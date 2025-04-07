import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {

    // Function to insert a node at the tail of the linked list
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

    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    // Function to sort the linked list using bubble sort
    public static void sortLinkedList(Node head) {
        for (Node i = head; i != null && i.next != null; i = i.next) {
            for (Node j = i.next; j != null; j = j.next) {
                if (i.val > j.val) {
                    // Swap values
                    int temp = i.val;
                    i.val = j.val;
                    j.val = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node tail = null;

        int val;
        // Insert values into the linked list until we input -1
        while (true) {
            val = sc.nextInt();
            if (val == -1) {
                break;
            }
            insertAtTail(head, tail, val);
        }

        // Sort the linked list
        sortLinkedList(head);

        // Print the sorted linked list
        printLinkedList(head);

        sc.close();
    }
}
