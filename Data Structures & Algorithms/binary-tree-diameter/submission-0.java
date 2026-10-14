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

    int result;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return this.result;
    }

    private int dfs(TreeNode node){
     
     if(node == null) return 0;
     int left = dfs(node.left);
     int right = dfs(node.right);
     this.result = Math.max(this.result,left+right);
     int hight = Math.max(left, right) + 1;

     return hight;
    }
}
