// Question: https://leetcode.com/problems/binary-tree-level-order-traversal/description/

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
public class BinaryTreeLevelOrderTraversal {
  private List<List<Integer>> res;

  public List<List<Integer>> levelOrder(TreeNode root) {
    res = new ArrayList<List<Integer>>();

    if (root == null) {
      return res;
    }

    add(root, 0);

    return res;
  }

  private void add(TreeNode n, int level) {
    if (res.size() == level) {
      res.add(new ArrayList<Integer>());
    }

    res.get(level).add(n.val);

    if (n.left != null) {
      add(n.left, level + 1);
    }

    if (n.right != null) {
      add(n.right, level + 1);
    }
  }
}
