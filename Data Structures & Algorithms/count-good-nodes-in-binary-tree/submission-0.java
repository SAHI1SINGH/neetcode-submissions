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
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
    public int dfs(TreeNode root, int maxForSum){
        if(root ==null) return 0;
        int good =root.val>=maxForSum ?1:0;
        int numMax = Math.max(maxForSum,root.val);
        return good+dfs(root.left,numMax)+dfs(root.right,numMax);
    }
}
