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
    public boolean isBalanced(TreeNode root) {
     if (root==null) return true;
    
    return dfs(root)[0] == 1;
       
    }


    private int [] dfs(TreeNode node){
        if (node == null) return new int []{1,0};
        boolean balanced = dfs(node.left)[0]==1 && dfs(node.right)[0] == 1 &&
                            Math.abs(dfs(node.left)[1] - dfs(node.right)[1]) <= 1;
        int height = 1 + Math.max(dfs(node.left)[1],dfs(node.right)[1]);
        return new int [] {balanced ? 1: 0, height};
    }

  
}
