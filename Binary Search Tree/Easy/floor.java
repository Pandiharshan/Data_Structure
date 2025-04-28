import java.util.*;

// Definition of TreeNode class for a binary tree node
class TreeNode {
    // Value of the node
    int val;

    // Pointer to the left child node
    TreeNode left;

    // Pointer to the right child node
    TreeNode right;

    // Constructor to initialize the node with a value
    // and set left and right pointers to null
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class Solution {
    // Function to find the floor of a key
    // in a Binary Search Tree (BST)
    public int floorInBST(TreeNode root, int key) {
        // Initialize the floor variable
        // to store the floor value
        int floor = -1;

        // Traverse the BST until reaching
        // the end or finding the key
        while (root != null) {
            // If the key is found, assign it
            // as the floor value and return
            if (root.val == key) {
                floor = root.val;
                return floor;
            }

            // If the key is greater than the current
            // node's value, move to the right subtree
            if (key > root.val) {
                // Update the floor with the current node's
                // value and move to the right subtree
                floor = root.val;
                root = root.right;
            } else {
                // If the key is smaller than the current
                // node's value, move to the left subtree
                root = root.left;
            }
        }
        // Return the computed floor value
        return floor;
    }
}

// Main class
public class Main {
    // Function to perform an in-order traversal
    // of a binary tree and print its nodes
    public static void printInOrder(TreeNode root) {
        // Check if the current node
        // is null (base case for recursion)
        if (root == null) {
            // If null, return and
            // terminate the function
            return;
        }

        // Recursively call printInOrder
        // for the left subtree
        printInOrder(root.left);

        // Print the value of the current node
        System.out.print(root.val + " ");

        // Recursively call printInOrder
        // for the right subtree
        printInOrder(root.right);
    }

    // Main method
    public static void main(String[] args) {
        // Creating a BST
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(2);
        root.left.left.right = new TreeNode(4);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(9);
        root.right.left = new TreeNode(11);
        root.right.right = new TreeNode(14);

        System.out.println("Binary Search Tree:");
        printInOrder(root);
        System.out.println();

        Solution solution = new Solution();

        // Searching for a value in the BST
        int target = 8;
        int floorVal = solution.floorInBST(root, target);

        if (floorVal != -1) {
            System.out.println("Floor of " + target + " is: " + floorVal);
        } else {
            System.out.println("No floor found!");
        }
    }
} 