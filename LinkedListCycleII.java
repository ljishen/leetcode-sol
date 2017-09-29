// Question: https://leetcode.com/problems/linked-list-cycle-ii/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode runner = head;
        ListNode walker = head;

        while (runner != null && runner.next != null) {
            runner = runner.next.next;
            walker = walker.next;

            if (runner == walker) {
                ListNode walker2 = head;
                while (walker != walker2) {
                    walker = walker.next;
                    walker2 = walker2.next;
                }
                return walker;
            }
        }

        return null;
    }
}
