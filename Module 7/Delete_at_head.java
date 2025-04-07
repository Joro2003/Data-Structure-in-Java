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

    // Method to delete the head node
    public static void deleteAtHead(Node head) {
        if (head == null) return; // Edge case: if the list is empty, do nothing
        Node deleteNode = head;
        head = head.next;
        deleteNode = null; // Set the deleted node to null (in Java, the garbage collector will handle memory)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Node head = null;
        Node tail = null;
        
        int val;
        
        while (true) {
            val = sc.nextInt();
            if (val == -1) {
                break;
            }
            insertAtTail(head, tail, val);
        }
        
        deleteAtHead(head); // Deleting the head node
        printLinkedList(head); // Printing the updated list after deletion
    }
}

