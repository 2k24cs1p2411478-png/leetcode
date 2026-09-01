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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            return new TreeNode(val,root,null);
        }
      addrow(root,val,depth , 1);
      return root;
  }
        public void addrow( TreeNode node,int val,int depth, int currentDepth ){
            if(node == null)
                return ;
            if(currentDepth == depth - 1){
                TreeNode left = node.left;
                TreeNode right = node.right;
                node.left = new TreeNode(val);
                node.right = new TreeNode(val);
                node.left.left = left;
                node.right.right = right;
                return;
            
        }
        addrow(node.left,val,depth,currentDepth + 1);
        addrow(node.right,val,depth,currentDepth + 1);
    }
}