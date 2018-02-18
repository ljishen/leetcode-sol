// Question: https://leetcode.com/problems/copy-list-with-random-pointer/description/

/**
 * Definition for singly-linked list with a random pointer. class RandomListNode { int label;
 * RandomListNode next, random; RandomListNode(int x) { this.label = x; } };
 */
public class CopyListWithRandomPointer {
  public RandomListNode copyRandomList(RandomListNode head) {
    RandomListNode n = head;
    while (n != null) {
      RandomListNode next = n.next;

      RandomListNode nn = new RandomListNode(n.label);
      n.next = nn;
      nn.next = next;

      n = next;
    }

    RandomListNode nHead = head != null ? head.next : null;

    n = head;
    while (n != null && n.next != null) {
      if (n.random != null) {
        n.next.random = n.random.next;
      }
      n = n.next.next;
    }

    n = head;
    while (n != null && n.next != null) {
      RandomListNode next = n.next;
      n.next = n.next.next;
      n = next;
    }

    return nHead;
  }
}
