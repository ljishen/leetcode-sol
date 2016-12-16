// Question: https://leetcode.com/problems/merge-two-sorted-lists/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cl1 = l1;
        ListNode cl2 = l2;

        ListNode root = null;
        ListNode prev = null;
        while (true) {
            ListNode nextNode;
            if ((cl1 != null && cl2 != null && cl1.val <= cl2.val) || cl2 == null) {
                nextNode = cl1;
                cl1 = cl1 != null ? cl1.next : null;
            } else {
                nextNode = cl2;
                cl2 = cl2 != null ? cl2.next : null;
            }

            if (root == null) {
                root = nextNode;
                prev = nextNode;
            } else {
                prev.next = nextNode;
                prev = nextNode;
            }

            if (cl1 == null && cl2 == null) {
                break;
            }
        }

        return root;
    }
}
