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
    List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        String path = "" + root.val;
        dfs(root,path);
        return result;
    }
    public void dfs(TreeNode node, String path){
        if(node.left == null && node.right == null){
            result.add(path);
            return;
        }
        if (node.left != null){
            dfs(node.left,path + "->" + node.left.val);
        }
        if (node.right != null){
            dfs(node.right,path + "->" + node.right.val);
        }
    }
}