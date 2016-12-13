// Question: https://leetcode.com/problems/add-two-numbers/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2);
    }

    private ListNode add(ListNode l1, ListNode l2) {
        ListNode n = new ListNode(l1.val + l2.val);
        add(l1.next, l2.next, n);
        return n;
    }

    private void add(ListNode l1, ListNode l2, ListNode prev) {
        ListNode n = new ListNode((l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0));

        if (prev.val > 9) {
            n.val += prev.val / 10;
            prev.val = prev.val % 10;
            prev.next = n;
        } else if (l1 != null || l2 != null) {
            prev.next = n;
        } else {
            return;
        }

        add(l1 != null ? l1.next : null, l2 != null ? l2.next : null, n);
    }
}
