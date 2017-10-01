// Question: https://leetcode.com/problems/path-sum-iii/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return pathCount(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathCount(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        int remain = sum - node.val;
        return (remain == 0 ? 1 : 0) + pathCount(node.left, remain) + pathCount(node.right, remain);
    }
}
