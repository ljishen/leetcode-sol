// Question: https://leetcode.com/problems/linked-list-cycle/

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
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode runner = head;
        ListNode walker = head;

        while (runner != null && runner.next != null) {
            runner = runner.next.next;
            walker = walker.next;

            if (runner == walker) {
                return true;
            }
        }

        return false;
    }
}
