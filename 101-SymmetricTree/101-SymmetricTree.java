// Last updated: 2/9/2026, 4:11:18 PM
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
    boolean find(TreeNode p , TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q== null) return false;
        if(p.val!=q.val) return false;
        return find(p.left,q.right) && find(p.right,q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return find(root.left,root.right);
    }
}
