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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        Queue<TreeNode> queP = new LinkedList<>();
        queP.offer(p);
        Queue<TreeNode> queQ = new LinkedList<>();
        queQ.offer(q);
        while(!queP.isEmpty()){
            int sizeP = queP.size();
            int sizeQ = queQ.size();         
            TreeNode currP = queP.poll();
            TreeNode currQ = queQ.poll();
            if(currP != null && currQ != null){
                if(currP.val != currQ.val){
                    return false;
                }
            }
            for(int i=0; i < sizeP; i++){
                if ((currP.left == null) != (currQ.left == null)) {
                return false;
                }
                if (currP.left != null) {
                    queP.offer(currP.left);
                    queQ.offer(currQ.left);
                }
                if ((currP.right == null) != (currQ.right == null)) {
                    return false;
                }
                if (currP.right != null) {
                    queP.offer(currP.right);
                    queQ.offer(currQ.right);
                }
            }   
        }
        return true;
    }
}
