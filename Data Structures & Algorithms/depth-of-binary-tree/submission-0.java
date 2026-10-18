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
        int max_depth = 0;
        if (root == null) { return 0; }
        ArrayList<TreeNode> arr = new ArrayList<TreeNode>();
        arr.add(root);
        while (!arr.isEmpty()) {
            int size = arr.size();
            for(int i = 0; i < size; i++){
            TreeNode curr = arr.remove(0);
            if(curr != null){
                if (curr.left != null)
                    arr.add(curr.left);
                if (curr.right != null)
                    arr.add(curr.right);
                }
            }
            max_depth++;
        }
        return max_depth;
    }
}
