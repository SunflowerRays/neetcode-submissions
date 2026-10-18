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
    public TreeNode invertTree(TreeNode root) {
        if (root == null){ return root; }
        ArrayList<TreeNode> arr = new ArrayList<TreeNode>();
        arr.add(root);
        while (!arr.isEmpty()) {
            TreeNode curr = arr.remove(0);
            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
            if (curr.left != null)
                arr.add(curr.left);

            if (curr.right != null)
                arr.add(curr.right);
        }
        return root;
    }
}
