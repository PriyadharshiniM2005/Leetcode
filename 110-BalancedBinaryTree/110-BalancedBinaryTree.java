// Last updated: 2/9/2026, 4:11:13 PM
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
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }
    private int checkHeight(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) return -1;
        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) return -1;
        int diff = leftHeight - rightHeight;
        if (diff < 0) diff = -diff;
        if (diff > 1) return -1;
        int maxHeight = (leftHeight > rightHeight) ? leftHeight : rightHeight;
        return maxHeight + 1;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(sol.isBalanced(root));  
    }
}
