/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int ldepth = maxDepth(root.left);
        int rdepth = maxDepth(root.right);
        
        int max = Math.max(ldepth, rdepth);
        
        return max+1;
    }
}
