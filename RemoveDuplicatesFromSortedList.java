// Question: https://leetcode.com/problems/remove-duplicates-from-sorted-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curNode = head;
        ListNode lastNode = null;
        while (curNode != null) {
            int curVal = curNode.val;
            if (lastNode != null && lastNode.val == curVal) {
                lastNode.next = curNode.next;
            } else {
                lastNode = curNode;
            }

            curNode = curNode.next;
        }

        return head;
    }
}
