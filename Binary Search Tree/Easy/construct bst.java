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
    int idx=0;
    public TreeNode construct(int[] preorder,long x,long y){
        if(idx>=preorder.length || preorder[idx]<=x || preorder[idx]>=y) return null;
        TreeNode root = new TreeNode(preorder[idx]);
        idx++;
        root.left = construct(preorder,x,root.val);
        root.right=construct(preorder,root.val,y);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        return construct(preorder,Long.MIN_VALUE,Long.MAX_VALUE);
    }
}