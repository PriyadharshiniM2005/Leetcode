// Last updated: 2/9/2026, 4:09:56 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return isUnival(root, root.val);
    }
    private boolean isUnival(TreeNode node, int value) {
        if (node == null) return true;
        if (node.val != value) return false;
        return isUnival(node.left, value) && isUnival(node.right, value);
    }
}
