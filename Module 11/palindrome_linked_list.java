public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public void insertAtTail(ListNode[] headTail, int val) {
        ListNode newNode = new ListNode(val);
        if (headTail[0] == null) {
            headTail[0] = newNode; 
            headTail[1] = newNode; 
            return;
        }
        headTail[1].next = newNode;
        headTail[1] = newNode;
    }

    public void reverse(ListNode[] headRef, ListNode curr) {
        if (curr.next == null) {
            headRef[0] = curr;
            return;
        }
        reverse(headRef, curr.next);
        curr.next.next = curr;
        curr.next = null;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode[] newList = new ListNode[2];
        ListNode tmp = head;

        while (tmp != null) {
            insertAtTail(newList, tmp.val);
            tmp = tmp.next;
        }

        reverse(newList, newList[0]);

        tmp = head;
        ListNode tmp2 = newList[0];

        while (tmp != null) {
            if (tmp.val != tmp2.val) {
                return false;
            }
            tmp = tmp.next;
            tmp2 = tmp2.next;
        }

        return true;
    }
}
