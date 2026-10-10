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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> results =new ArrayList<>();
        dfs(root,0,results);
        return results;
    }
    public void dfs(TreeNode root, int level,List<Integer> results){
        if(root == null) return;
        if (level == results.size()) {
            results.add(root.val);
        }
        dfs(root.right, level + 1, results);
        dfs(root.left, level + 1, results);
    
    }
}
