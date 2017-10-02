// Question: https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TwoSumIV {
    public boolean findTarget(TreeNode root, int k) {
        return traverseTree(root, root, k);
    }

    private boolean traverseTree(TreeNode root, TreeNode node, int k) {
        if (root == null || node == null) {
            return false;
        }

        TreeNode remainNode = checkIfRemainExist(root, k - node.val);
        if (remainNode != null && remainNode != node) {
            return true;
        }

        return traverseTree(root, node.left, k) || traverseTree(root, node.right, k);
    }

    private TreeNode checkIfRemainExist(TreeNode node, int remain) {
        if (node == null) {
            return null;
        }

        if (remain == node.val) {
            return node;
        }

        if (remain > node.val) {
            return checkIfRemainExist(node.right, remain);
        } else {
            return checkIfRemainExist(node.left, remain);
        }
    }
}
