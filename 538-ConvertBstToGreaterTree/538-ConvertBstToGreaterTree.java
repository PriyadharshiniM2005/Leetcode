// Last updated: 2/9/2026, 4:10:32 PM
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
    int sum=0;
    public TreeNode convertBST(TreeNode root) {
        revInorder(root);
        return root;
    }
    public void revInorder(TreeNode root){
        if(root!=null){
            revInorder(root.right);
            sum+=root.val;
            root.val=sum;
            revInorder(root.left);
        }
    }
       
}