// Question: https://leetcode.com/problems/binary-tree-inorder-traversal/description/

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
public class BinaryTreeInorderTraversal {
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<Integer>();
    if (root == null) {
      return res;
    }

    Stack<TreeNode> nodes = new Stack<>();
    nodes.add(root);

    while (!nodes.isEmpty()) {
      TreeNode n = nodes.peek();
      if (n.left != null) {
        nodes.add(n.left);
        n.left = null;
        continue;
      }

      nodes.pop();
      res.add(n.val);

      if (n.right != null) {
        nodes.add(n.right);
        n.right = null;
      }
    }

    return res;
  }
}
