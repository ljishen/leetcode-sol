// Question: https://leetcode.com/problems/sum-of-left-leaves/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class SumOfLeftLeaves {
    private int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        traverse(root);
        return sum;
    }

    private boolean traverse(TreeNode node) {
        if (node == null) {
            return false;
        }

        if (node.left == null && node.right == null) {
            return true;
        }

        if (traverse(node.left)) {
            sum += node.left.val;
        }

        traverse(node.right);
        return false;
    }
}
