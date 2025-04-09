public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {
    public void reverse(ListNode[] headRef, ListNode tmp) {
        if (tmp.next == null) {
            headRef[0] = tmp;
            return;
        }
        reverse(headRef, tmp.next);
        tmp.next.next = tmp;
        tmp.next = null;
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode[] headRef = new ListNode[1]; 
        reverse(headRef, head);
        return headRef[0];
    }
}
