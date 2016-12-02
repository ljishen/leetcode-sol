// Question: https://leetcode.com/problems/palindrome-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedList {
    private ListNode left;

    public boolean isPalindrome(ListNode head) {
        left = head;
        return helper(head);
    }

    private boolean helper(ListNode right) {
        if (right == null) {
            return true;
        }

        boolean r = helper(right.next);
        if (!r) {
            return false;
        }

        boolean y = left.val == right.val;
        left = left.next;
        return y;
    }
}
