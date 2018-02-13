// Question: https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
public class FlattenBinaryTreeToLinkedList {
  private TreeNode tail;

  public void flatten(TreeNode root) {
    if (root == null) {
      return;
    }

    arrange(root);
  }

  private void arrange(TreeNode n) {
    TreeNode right = n.right;
    TreeNode left = n.left;

    if (left != null) {
      arrange(left);
      n.left = null;
      n.right = left;
      if (right != null) {
        tail.right = right;
        tail = right;
      }
    }

    if (right != null) {
      arrange(right);
    }

    if (n.left == null && n.right == null) {
      tail = n;
    }
  }
}
