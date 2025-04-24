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
    public boolean Valid(TreeNode root,long x,long y){
       return root==null || (root.val > x && root.val < y) && Valid(root.left,x,root.val)
       && Valid(root.right,root.val,y);
    }
    public boolean isValidBST(TreeNode root) {
        return Valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
} 