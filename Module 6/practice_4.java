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

    static class LinkedList {
        Node head = null;
        Node tail = null;

        void insertAtTail(int val) {
            Node newNode = new Node(val);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        void insertAtHead(int val) {
            Node newNode = new Node(val);
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
        }

        void insertAtAnyPos(int idx, int val) {
            Node newNode = new Node(val);
            Node tmp = head;
            for (int i = 1; i < idx; i++) {
                tmp = tmp.next;
            }
            newNode.next = tmp.next;
            tmp.next = newNode;
        }

        int size() {
            int count = 0;
            Node tmp = head;
            while (tmp != null) {
                count++;
                tmp = tmp.next;
            }
            return count;
        }

        void printList() {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.val + " ");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        // Build initial list
        while (true) {
            int val = sc.nextInt();
            if (val == -1) break;
            list.insertAtTail(val);
        }

        // Handle queries
        while (sc.hasNextInt()) {
            int idx = sc.nextInt();
            int val = sc.nextInt();

            int sz = list.size();
            if (idx > sz) {
                System.out.println("Invalid");
                continue;
            } else if (idx == sz) {
                list.insertAtTail(val);
            } else if (idx == 0) {
                list.insertAtHead(val);
            } else {
                list.insertAtAnyPos(idx, val);
            }

            list.printList();
        }

        sc.close();
    }
}
