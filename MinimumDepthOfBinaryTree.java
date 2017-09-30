// Question: https://leetcode.com/problems/minimum-depth-of-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        LinkedList<TreeNode> nodes = new LinkedList<>();

        root.val = 1;
        nodes.offer(root);

        while (!nodes.isEmpty()) {
            TreeNode n = nodes.remove();
            if (n.left == null && n.right == null) {
                return n.val;
            }

            if (n.left != null) {
                n.left.val = n.val + 1;
                nodes.offer(n.left);
            }

            if (n.right != null) {
                n.right.val = n.val + 1;
                nodes.offer(n.right);
            }
        }

        throw new RuntimeException("Error");
    }
}
