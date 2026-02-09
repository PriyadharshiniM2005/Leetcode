// Last updated: 2/9/2026, 4:11:16 PM
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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftdepth=maxDepth(root.left);
        int rightdepth=maxDepth(root.right);
        int larger;
        if(leftdepth>rightdepth){
            larger=leftdepth;
        }
        else{
            larger=rightdepth;
        }
        return 1+larger;
    }
}