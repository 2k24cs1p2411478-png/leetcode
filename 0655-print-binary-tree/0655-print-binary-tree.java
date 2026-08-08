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
    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> tree = new ArrayList<>();
         int height=level(root);
         int row = height;
         int col  = (int)Math.pow(2,row) - 1;
           for (int i = 0; i < row; i++) {
            List<String> temp = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                temp.add("");
            }
            tree.add(temp);
        }
         formtree(root,0,0,col-1,tree);
         return tree;

    }
    public int level(TreeNode root){
        if(root == null)
            return 0;
        int left = level(root.left);
        int right = level(root.right);
        return 1 + Math.max(left,right);
    }
    public void formtree(TreeNode root, int r, int left, int right,       List<List<String>> tree) {

        if (root == null)
            return;

        int mid = left + (right - left) / 2;

        tree.get(r).set(mid, "" + root.val);
        formtree(root.left, r + 1, left, mid - 1, tree);
        formtree(root.right, r + 1, mid + 1, right, tree);
    }
}