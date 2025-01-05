import.java.util.*;
// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

class Solution {
    // Function to search a value in BST
    public TreeNode searchBST(TreeNode root, int target) {

        // Traverse the tree while node is not null and value not matched
        while (root != null && root.val != target) {

            // If target is less than node's value, go to left subtree
            if (target < root.val) {
                root = root.left;
            }

            // Else go to right subtree
            else {
                root = root.right;
            }
        }

        // Return the node if found, otherwise null
        return root;
    }
}

// Driver code
public class Main {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        Solution obj = new Solution();
        TreeNode result = obj.searchBST(root, 2);

        if (result != null)
            System.out.println("Node found: " + result.val);
        else
            System.out.println("Node not found");
    }
}
