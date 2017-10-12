// Question: https://leetcode.com/problems/binary-tree-tilt/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class BinaryTreeTilt {
    private int wholeTile;

    public int findTilt(TreeNode root) {
        calcSum(root);
        return wholeTile;
    }

    private int calcSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = calcSum(node.left);
        int rightSum = calcSum(node.right);

        wholeTile += Math.abs(leftSum - rightSum);

        return leftSum + rightSum + node.val;
    }
}
