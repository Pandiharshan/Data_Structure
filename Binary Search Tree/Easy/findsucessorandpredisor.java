import java.util.*;

// define tree node structure
class TreeNode {
    // value of the node
    int val;
    // left child reference
    TreeNode left;
    // right child reference
    TreeNode right;
    // constructor
    TreeNode(int x) { val = x; }
}

// solution class
class Solution {
    // find inorder successor iteratively
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        // initialize successor
        TreeNode successor = null;
        // traverse until root becomes null
        while (root != null) {
            // when p is greater or equal, move right
            if (p.val >= root.val) {
                root = root.right;
            }
            // otherwise update successor and move left
            else {
                successor = root;
                root = root.left;
            }
        }
        // return successor (may be null)
        return successor;
    }
}

// separate main class
public class Main {
    // inorder print helper
    static void printInOrder(TreeNode root) {
        // base case
        if (root == null) return;
        // traverse left
        printInOrder(root.left);
        // print node
        System.out.print(root.val + " ");
        // traverse right
        printInOrder(root.right);
    }

    // program entry
    public static void main(String[] args) {
        // construct BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        // show inorder
        System.out.print("BST: ");
        printInOrder(root);
        System.out.println();

        // target node p
        TreeNode p = root.left.right;

        // find successor
        Solution solution = new Solution();
        TreeNode successor = solution.inorderSuccessor(root, p);

        // print result
        if (successor != null) {
            System.out.println("Inorder Successor of " + p.val + " is: " + successor.val);
        } else {
            System.out.println("Inorder Successor of " + p.val + " does not exist.");
        }
    }
}
