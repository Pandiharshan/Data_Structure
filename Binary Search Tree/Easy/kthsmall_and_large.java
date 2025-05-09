import java.util.ArrayList;
import java.util.List;

// Definition for a binary tree node.
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { data = val; left = null; right = null; }
}

class Solution {
    private int k;
    private int result;

    // Function to find the kth smallest element
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        this.result = -1;
        inorder(root);
        return result;
    }

    // Helper function for inorder traversal
    private void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            if (--k == 0) {
                result = node.data;
                return;
            }
            inorder(node.right);
        }
    }

    // Function to find the kth largest element
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        this.result = -1;
        reverseInorder(root);
        return result;
    }

    // Helper function for reverse inorder traversal
    private void reverseInorder(TreeNode node) {
        if (node != null) {
            reverseInorder(node.right);
            if (--k == 0) {
                result = node.data;
                return;
            }
            reverseInorder(node.left);
        }
    }

    // Function to return kth smallest and kth largest elements
    public List<Integer> kLargesSmall(TreeNode root, int k) {
        List<Integer> result = new ArrayList<>();
        result.add(kthSmallest(root, k));
        result.add(kthLargest(root, k));
        return result;
    }
}

// Separate main class
public class Main {
    public static void main(String[] args) {
        // Constructing the tree: [3, 1, 4, null, 2]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);

        Solution solution = new Solution();
        int k = 1;
        List<Integer> result = solution.kLargesSmall(root, k);

        // Output the result
        System.out.println(result); // Output: [1, 4]
    }
}
