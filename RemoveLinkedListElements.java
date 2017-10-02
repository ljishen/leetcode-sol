// Question: https://leetcode.com/problems/remove-linked-list-elements/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode newHead = head;
        ListNode cur = head;

        while (cur != null) {
            if (cur.val == val) {
                if (prev == null) {
                    newHead = cur.next;
                } else {
                    prev.next = cur.next;
                }
            } else {
                prev = cur;
            }

            cur = cur.next;
        }

        return newHead;
    }
}
