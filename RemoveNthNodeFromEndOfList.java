// Question: https://leetcode.com/problems/remove-nth-node-from-end-of-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode front = head;
        ListNode follow = head;

        int distance = 0;
        while (front.next != null) {
            front = front.next;
            distance++;
            if (distance > n) {
                follow = follow.next;
            }
        }

        if (distance >= n) {
            follow.next = follow.next.next;
            return head;
        } else {
            return head.next;
        }
    }
}
