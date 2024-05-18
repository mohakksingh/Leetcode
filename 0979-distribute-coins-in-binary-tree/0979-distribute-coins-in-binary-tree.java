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
    private int totalMoves; // To track the total number of moves needed

    // Distributes coins in the binary tree such that every node has exactly one coin
    public int distributeCoins(TreeNode root) {
        totalMoves = 0; // Initialize the total moves to 0
        postOrderTraversal(root); // Start post-order traversal from the root
        return totalMoves; // After traversal, totalMoves has the answer
    }

    // Helper function to perform post-order traversal of the binary tree
    private int postOrderTraversal(TreeNode node) {
        // Base case: if current node is null, return 0 (no moves needed)
        if (node == null) {
            return 0;
        }

        // Recurse on the left subtree
        int leftMovesRequired = postOrderTraversal(node.left);
        // Recurse on the right subtree
        int rightMovesRequired = postOrderTraversal(node.right);

        // Calculate the total moves needed by adding up the moves required by both subtrees
        totalMoves += Math.abs(leftMovesRequired) + Math.abs(rightMovesRequired);

        // Return the net balance of coins for this node
        // The net balance is the sum of left and right balances plus the coins at the node minus one (for the node itself)
        return leftMovesRequired + rightMovesRequired + node.val - 1;
    }
}