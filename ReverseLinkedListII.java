// Question: https://leetcode.com/problems/reverse-linked-list-ii/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode prev = null;
        ListNode cur = head;
        int index = 1;

        while (index < m) {
            prev = cur;
            cur = cur.next;
            index++;
        }

        ListNode start = cur;

        ListNode next = null;
        ListNode old = null;
        while (index <= n) {
            next = cur.next;
            if (prev != null) {
                prev.next = cur;
            }
            cur.next = old;
            old = cur;
            cur = next;
            index++;
        }

        start.next = cur;

        return m == 1 ? old : head;
    }
}
