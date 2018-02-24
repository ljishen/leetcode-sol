// Question:
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
public class LowestCommonAncestorOfABinarySearchTree {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if (root == null) {
      return null;
    }

    Stack<TreeNode> st = new Stack<>();
    find(st, root, p);

    while (!st.isEmpty()) {
      TreeNode n = st.pop();
      if (find(n, q)) {
        return n;
      }
    }

    return null;
  }

  private boolean find(TreeNode root, TreeNode target) {
    if (root == null) {
      return false;
    }

    if (root.val == target.val) {
      return true;
    }

    return target.val < root.val && find(root.left, target)
        || target.val > root.val && find(root.right, target);
  }

  private boolean find(Stack<TreeNode> st, TreeNode root, TreeNode target) {
    if (root == null) {
      return false;
    }

    st.push(root);

    if (target.val == root.val) {
      return true;
    }

    if (target.val < root.val) {
      if (find(st, root.left, target)) {
        return true;
      }
    } else if (find(st, root.right, target)) {
      return true;
    }

    st.pop();
    return false;
  }
}
