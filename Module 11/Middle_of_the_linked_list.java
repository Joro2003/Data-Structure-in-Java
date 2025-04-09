class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        temp = head;
        for (int i = 0; i < count / 2; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
