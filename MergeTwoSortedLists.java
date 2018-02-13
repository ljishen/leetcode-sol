// Question: https://leetcode.com/problems/merge-two-sorted-lists/description/

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; } }
 */
public class MergeTwoSortedLists {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode head1 = l1;
    ListNode head2 = l2;

    ListNode head = null;
    ListNode prev = null;

    while (head1 != null && head2 != null) {
      ListNode cur = null;

      if (head1.val < head2.val) {
        cur = head1;
        head1 = head1.next;
      } else {
        cur = head2;
        head2 = head2.next;
      }

      if (head == null) {
        head = cur;
      }

      if (prev != null) {
        prev.next = cur;
      }

      prev = cur;
    }

    ListNode remain = null;
    if (head1 != null) {
      remain = head1;
    } else if (head2 != null) {
      remain = head2;
    }

    if (remain != null) {
      if (head == null) {
        head = remain;
      } else {
        prev.next = remain;
      }
    }

    return head;
  }
}
