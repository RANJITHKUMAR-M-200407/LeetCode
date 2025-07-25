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
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
       int count=0;
      count= fun(root,count);
       return count-1;
    }
    public static int fun(TreeNode root,int count){
        if(root==null) return 1;
        return fun(root.left,count+1)+ fun(root.right,count+1);
    }
}